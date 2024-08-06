package lightheadfox.ru.library_system.repository;

import lightheadfox.ru.library_system.domain.Book;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class BookRepository implements BookStorage {

    private ArrayList<Book> storage = new ArrayList<>();


    @Override
    public void saveBook(Book book) {
        storage.add(book);
    }


    /** ? Not correct use int id
     *
    */
    public Book getBookFromStorage(Long id) { return storage.get(Math.toIntExact(id));}

    public void deleteBookFromStorage(Long id) { storage.remove(Math.toIntExact(id));}

    //public Book searchBookInArray(Long id) {}

    @Override
    public List<Book> getAllBooks() {
        return storage;
    }

//    @Override
//    public Book updateBook(Long id, UpdateBook book) {
//        return null;
//    }
}
