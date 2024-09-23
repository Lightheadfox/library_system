package lightheadfox.ru.library_system.service;

import lightheadfox.ru.library_system.domain.Book;
import lightheadfox.ru.library_system.domain.BookDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface BookInterface {

    Book getBook(Long id);


    List<Book> getAllBooks();

    void deleteBook(Long aLong);

    void addBook(BookDTO bookDTO);

    void updateBook(Long id, BookDTO bookDTO);

    //List<Book> fuzzySearch(String searchTerm);

    @Query(value = "SELECT * FROM book WHERE " +
            "SIMILARITY(author, :searchTerm) > 0.3 " +
            "ORDER BY GREATEST (SIMILARITY(author, :searchTerm)) DESC",
            nativeQuery = true)
    List<Book> fuzzySearchBooks(@Param("searchTerm") String searchTerm);

}
