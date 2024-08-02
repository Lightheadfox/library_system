package lightheadfox.ru.library_system.web.rest;


import lightheadfox.ru.library_system.domain.Book;
import lightheadfox.ru.library_system.service.BookInterface;
import lightheadfox.ru.library_system.service.BookService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController extends BaseController{


    private BookInterface bookService;

    public BookController(BookService bookService) {


        super();
        System.out.println("BookController");
        this.bookService = bookService;
        bookService.addBook(0L,
                "author",
                "title",
                1234,
                "descr",
                "genre",
                "lang",
                123,
                1990,
                1995,
                "subGenre",
                1000);
        System.out.println("------------------------------------------------------");
        System.out.println();
        System.out.println(bookService.getBookAuthor(0L));
        System.out.println(bookService.getBookDescription(0L));

//        bookService.deleteBook(0L);
//        System.out.println("------------------------------------------------------");
//        System.out.println();
//        System.out.println(bookService.getBookAuthor(0L));
//        System.out.println(bookService.getBookDescription(0L));

    }




    @GetMapping("/get_book")
    public ResponseEntity<Book> getBook(){
        Book book = bookService.getBook(0L);
        ResponseEntity<Book> entity = new ResponseEntity<>(book, HttpStatus.OK);
        return entity;
    }

    @GetMapping("/all_books")
    public ResponseEntity<List<Book>> getAllBooks(){
        List<Book> books = bookService.getAllBooks();
        ResponseEntity<List<Book>> entity = new ResponseEntity<>(books, HttpStatus.OK);
        return entity;
    }








}
