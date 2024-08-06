package lightheadfox.ru.library_system.repository;

import lightheadfox.ru.library_system.domain.Book;

import java.util.List;

public interface BookStorage {

    public void saveBook(Book book);

    public Book getBookFromStorage(Long id);

    public void deleteBookFromStorage(Long id);

    public List<Book> getAllBooks();

   // public Book updateBook(Long id, UpdateBook book);

}
