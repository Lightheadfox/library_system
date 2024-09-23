package lightheadfox.ru.library_system.service;

import lightheadfox.ru.library_system.domain.Book;
import lightheadfox.ru.library_system.domain.BookDTO;

import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookInterface {

    Book getBook(Long id);


    List<Book> getAllBooks();

    void deleteBook(Long aLong);

    void addBook(BookDTO bookDTO);

    void updateBook(Long id, BookDTO bookDTO);




    List<Book> fuzzySearchBooks(String searchTerm);

}
