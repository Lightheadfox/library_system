package lightheadfox.ru.library_system.repository;

import lightheadfox.ru.library_system.domain.Book;

public interface BookStorage {

    public void saveBook(Book book);

    public Book getBookFromStorage(Long id);

    public void deleteBookFromStorage(Long id);

}
