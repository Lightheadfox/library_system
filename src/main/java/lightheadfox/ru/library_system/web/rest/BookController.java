package lightheadfox.ru.library_system.web.rest;


import lightheadfox.ru.library_system.domain.Book;
import lightheadfox.ru.library_system.domain.BookDTO;
import lightheadfox.ru.library_system.repository.BookRepository;
import lightheadfox.ru.library_system.service.BookInterface;
import lightheadfox.ru.library_system.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class BookController extends BaseController{


    private final BookRepository bookRepository;
    private BookInterface bookService;

    public BookController(BookService bookService, BookRepository bookRepository) {


        super();
        System.out.println("BookController");
        this.bookService = bookService;

        this.bookRepository = bookRepository;
    }



    @PostMapping("/book")
    public ResponseEntity<?> createBook(@RequestBody BookDTO bookDTO) {
        bookService.addBook(bookDTO);
        return new ResponseEntity<>(HttpStatus.CREATED);
    }


    @GetMapping("/book/{id}")

    public ResponseEntity<Book> getBook(@PathVariable("id") String id){
        Book book = bookService.getBook(Long.valueOf(id));
        ResponseEntity<Book> entity = new ResponseEntity<>(book, HttpStatus.OK);
        return entity;
    }

    @GetMapping("/book")
    public ResponseEntity<List<Book>> getAllBooks(){
        List<Book> books = bookRepository.getAllBooks();
        ResponseEntity<List<Book>> entity = new ResponseEntity<>(books, HttpStatus.OK);
        return entity;
    }

// TODO Rename methods as rest compatible
    // Add POST method






}
