package lightheadfox.ru.library_system.repository;

import lightheadfox.ru.library_system.domain.Book;
import lightheadfox.ru.library_system.domain.BookDTO;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

//@Repository
public interface BookStorage extends JpaRepository<Book, Long> {



//    void saveBook(BookDTO bookDTO);

//    public Optional<Book> findById(Long id);
//
//    public void deleteBookFromStorage(Long id);
//
//    public List<Book> getAllBooks();
//
//   // public Book updateBook(Long id, UpdateBook book);
//
//    public Book getBookById(Long id);

}
