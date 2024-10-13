package lightheadfox.ru.library_system.repository;

import lightheadfox.ru.library_system.domain.Book;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

public interface BookStorage extends JpaRepository<Book, Long> {


    void deleteBookById(Long id);

    List<Book> findByAuthorContainingIgnoreCase(String author);

    List<Book> findByTitleContainingIgnoreCase(String title);

    List<Book> findByAuthorContainingIgnoreCaseAndTitleContainingIgnoreCase(String author, String title);

    List<Book> findByDescriptionContainsIgnoreCase(String description);

//    @Query(value = "SELECT * FROM book WHERE " +
//            "SIMILARITY(author, :searchTerm) > 0.3 OR " +
//            "SIMILARITY(title, :searchTerm) > 0.3 OR " +
//            "SIMILARITY(description, :searchTerm) > 0.3 " +
//            "ORDER BY GREATEST ((SIMILARITY(author, :searchTerm), SIMILARITY(title, :searchTerm), SIMILARITY(description, :searchTerm))) DESC",
//            nativeQuery = true)
//    List<Book> fuzzySearchBooks(@Param("searchTerm") String searchTerm);

    @Query(value = "SELECT * FROM book WHERE " +
            "author LIKE %:searchTerm% OR " +
            "title LIKE %:searchTerm% OR " +
    "description Like %:searchTerm%", nativeQuery = true)
    List<Book> fuzzySearchBooks(@Param("searchTerm") String searchTerm);
}