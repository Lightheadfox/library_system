package lightheadfox.ru.library_system.repository;

import lightheadfox.ru.library_system.domain.Book;
import lightheadfox.ru.library_system.domain.BookDTO;
import lombok.SneakyThrows;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


@Repository
public class BookRepository implements BookStorage {

    private ArrayList<Book> storage = new ArrayList<>();


    @Override
    public void saveBook(BookDTO bookDTO) {
        Long newID = getMaximumID() + 1;
        Book newBook = new Book();
        newBook.setId(newID);
        newBook.setIsbn(bookDTO.getIsbn());
        newBook.setTitle(bookDTO.getTitle());
        newBook.setAuthor(bookDTO.getAuthor());
        newBook.setGenre(bookDTO.getGenre());
        newBook.setYear(bookDTO.getYear());
        newBook.setDescription(bookDTO.getDescription());
        newBook.setPageLength(bookDTO.getPageLength());
        newBook.setLanguage(bookDTO.getLanguage());
        newBook.setComingSoonDate(bookDTO.getComingSoonDate());
        newBook.setQuantity(bookDTO.getQuantity());
        newBook.setSubGenre(bookDTO.getSubGenre());
        storage.add(newBook);
    }

    public Long getMaximumID() {
        Long maxID = 0L;
        for (Book book : storage) {
            if (book.getId() > maxID) {
                maxID = book.getId();
            }
        }
        return maxID;
    }


    /**
     * ? Not correct use int id
     */
    @SneakyThrows
    public Book getBookFromStorage(Long id) {
        for (Book book : storage) {

            if (book.getId() == id)
                return book;
        }

        throw new Exception("Book with id: " + id + " doesnt exist");
    }

    @SneakyThrows
    public void deleteBookFromStorage(Long id) {
        for (Book book : storage) {

            if (book.getId() == id) {
                storage.remove(Math.toIntExact(id));
            }
        }

        throw new Exception("Book with id: " + id + " doesnt exist");
    }

    @SneakyThrows
    public Book searchBookTitle(String input) {
        for (Book book : storage) {

            if (book.getTitle().equalsIgnoreCase(input)) {
                return book;
            } else if (book.getAuthor().equalsIgnoreCase(input)) {
                return book;
            } else if (book.getGenre().equalsIgnoreCase(input)) {
                return book;
            } else if (book.getLanguage().equalsIgnoreCase(input)) {
                return book;
            } else if (book.getSubGenre().equalsIgnoreCase(input)) {
                return book;

            } else if (book.getDescription().contains(input)) {
                return book;
            }

        }

        throw new Exception("Book with : " + input + " doesnt exist");
    }


    @Override
    public List<Book> getAllBooks() {
        return storage;
    }

//    @Override
//    public Book updateBook(Long id, UpdateBook book) {
//        return null;
//    }
}
