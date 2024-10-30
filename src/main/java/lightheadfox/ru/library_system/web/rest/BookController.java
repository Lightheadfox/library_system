package lightheadfox.ru.library_system.web.rest;


import lightheadfox.ru.library_system.domain.Book;
import lightheadfox.ru.library_system.domain.BookDTO;
import lightheadfox.ru.library_system.repository.BookStorage;
import lightheadfox.ru.library_system.service.BookInterface;
import lightheadfox.ru.library_system.service.BookService;
import org.hibernate.query.Page;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class BookController extends BaseController {


    private final BookStorage bookStorage;
    private BookInterface bookService;

    public BookController(BookService bookService, BookStorage bookStorage) {


        super();
        System.out.println("BookController");
        this.bookService = bookService;
        this.bookStorage = bookStorage;
    }


    @PostMapping("/book")
    public ResponseEntity<?> createBook(@RequestBody BookDTO bookDTO) {
        bookService.addBook(bookDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


    @RequestMapping(value = "/book/{id}", method = RequestMethod.GET)

    public ResponseEntity<Book> getBook(@PathVariable("id") String id) {
        Book book = bookService.getBook(Long.valueOf(id));
        ResponseEntity<Book> entity = new ResponseEntity<>(book, HttpStatus.OK);
        return entity;
    }

//    @GetMapping("/book")
//    public ResponseEntity<List<Book>> getAllBooks() {
//        List<Book> books = bookService.getAllBooks();
//        ResponseEntity<List<Book>> entity = new ResponseEntity<>(books, HttpStatus.OK);
//        return entity;
//    }

   @GetMapping("/book")
   public ResponseEntity<?> getBooksPaginated(@RequestParam(defaultValue = "0", value="page") Optional<String> page,
                                              @RequestParam(defaultValue = "10", value="size") Optional<String> size) {
        List<Book> paginatedBooks = bookService.getAllBooksPaginated(page,size);

        return new ResponseEntity<>(paginatedBooks, HttpStatus.OK);
   }

    @PatchMapping("/book/{id}")
    public ResponseEntity<?> updateBook(@PathVariable("id") String id, @RequestBody BookDTO bookDTO) {

        bookService.updateBook(Long.valueOf(id), bookDTO);
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @DeleteMapping("/book/{id}")
    public ResponseEntity<?> deleteBook(@PathVariable("id") String id) {
        bookService.deleteBook(Long.valueOf(id));
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }

    @GetMapping("/book/search/{query}")
    public ResponseEntity<?> searchBook(@PathVariable("query") String query) {

        if (bookStorage.findByAuthorContainingIgnoreCase(query) != null) {
            return new ResponseEntity<>(bookStorage.findByAuthorContainingIgnoreCase(query), HttpStatus.OK);
        } else if (bookStorage.findByTitleContainingIgnoreCase(query) != null) {
            return new ResponseEntity<>(bookStorage.findByTitleContainingIgnoreCase(query), HttpStatus.OK);
        } else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);

    }

    @GetMapping("/book/searchBooks/{searchTerm}")
    public ResponseEntity<?> searchBooks(@PathVariable("searchTerm") String searchTerm) {
        if (bookService.fuzzySearchBooks(searchTerm) != null) {
            return new ResponseEntity<>(bookService.fuzzySearchBooks(searchTerm), HttpStatus.OK);
        } else
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }


}
