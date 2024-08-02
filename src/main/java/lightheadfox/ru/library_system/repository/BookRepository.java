package lightheadfox.ru.library_system.repository;

import lightheadfox.ru.library_system.domain.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;


@Repository
public class BookRepository implements BookStorage {

    private ArrayList<Book> storage = new ArrayList<>();


    @Override
    public void saveBook(Book book) {
        storage.add(book);
    }


    // ? Is it correct?
    public Book getBookFromStorage(Long id) { return storage.get(Math.toIntExact(id));}

    public void deleteBookFromStorage(Long id) { storage.remove(Math.toIntExact(id));}
}
