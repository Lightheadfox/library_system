package lightheadfox.ru.library_system.web.rest;


import lightheadfox.ru.library_system.domain.Book;
import lightheadfox.ru.library_system.domain.BookDTO;
import lightheadfox.ru.library_system.service.BookInterface;
import lightheadfox.ru.library_system.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class BookController extends BaseController {


    private BookInterface bookService;

    public BookController(BookService bookService) {


        super();
        System.out.println("BookController");
        this.bookService = bookService;
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

    @GetMapping("/book")
    public ResponseEntity<List<Book>> getAllBooks() {
        List<Book> books = bookService.getAllBooks();
        ResponseEntity<List<Book>> entity = new ResponseEntity<>(books, HttpStatus.OK);
        return entity;
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


}
