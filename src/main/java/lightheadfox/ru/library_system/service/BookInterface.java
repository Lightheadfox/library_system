package lightheadfox.ru.library_system.service;

import lightheadfox.ru.library_system.domain.Book;
import lightheadfox.ru.library_system.domain.BookDTO;

import org.springframework.data.domain.Page;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface BookInterface {

    Book getBook(Long id);


    List<Book> getAllBooks();

    List<Book> getAllBooksPaginated(Optional<String> page, Optional<String> size);

    void deleteBook(Long aLong);

    void addBook(BookDTO bookDTO);

    void updateBook(Long id, BookDTO bookDTO);




    List<Book> fuzzySearchBooks(String searchTerm);

}
