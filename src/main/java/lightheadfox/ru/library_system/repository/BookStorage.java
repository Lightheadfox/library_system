package lightheadfox.ru.library_system.repository;

import lightheadfox.ru.library_system.domain.Book;
import lightheadfox.ru.library_system.domain.BookDTO;

import java.util.List;

public interface BookStorage {



    void saveBook(BookDTO bookDTO);

    public Book getBookFromStorage(Long id);

    public void deleteBookFromStorage(Long id);

    public List<Book> getAllBooks();

   // public Book updateBook(Long id, UpdateBook book);

}
