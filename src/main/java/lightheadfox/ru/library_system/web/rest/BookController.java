package lightheadfox.ru.library_system.web.rest;


import lightheadfox.ru.library_system.service.BookService;
import lightheadfox.ru.library_system.service.impl.BookServiceImpl;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController extends BaseController{

    private final BookServiceImpl bookServiceImpl;
    private BookService bookService;

    public BookController(BookServiceImpl bookServiceImpl) {
        super();
        this.bookServiceImpl = bookServiceImpl;
    }

    @GetMapping("/get_book_title")
    public void getBookTitle(){
        System.out.println(bookServiceImpl.getBookTitle());

    }




}
