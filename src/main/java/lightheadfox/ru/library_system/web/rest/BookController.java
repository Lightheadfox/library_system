package lightheadfox.ru.library_system.web.rest;


import lightheadfox.ru.library_system.service.BookInterface;
import lightheadfox.ru.library_system.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController extends BaseController{


    private BookInterface bookService;

    public BookController(BookService bookService) {


        super();
        System.out.println("BookController");
        this.bookService = bookService;


    }

    @GetMapping("/get_book_title")
    public void getBookTitle(){
        System.out.println(bookService.getBookTitle());


    }




}
