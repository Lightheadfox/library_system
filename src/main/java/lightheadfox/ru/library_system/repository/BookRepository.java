package lightheadfox.ru.library_system.repository;

import org.springframework.stereotype.Repository;

//package lightheadfox.ru.library_system.repository;
//
//import lightheadfox.ru.library_system.domain.Book;
//import lightheadfox.ru.library_system.domain.BookDTO;
//import lombok.SneakyThrows;
//import org.springframework.stereotype.Component;
//import org.springframework.stereotype.Repository;
//
//import java.util.ArrayList;
//import java.util.List;
//import java.util.Optional;
//
//@Component
//@Repository
public class BookRepository  {
//
 //  private ArrayList<Book> storage = new ArrayList<>();
//
//
//    @Override
//    public void saveBook(BookDTO bookDTO) {
//        Long newID = getMaximumID() + 1;
//        Book newBook = new Book();
//        newBook.setId(newID);
//        newBook.setIsbn(bookDTO.getIsbn());
//        newBook.setTitle(bookDTO.getTitle());
//        newBook.setAuthor(bookDTO.getAuthor());
//        newBook.setGenre(bookDTO.getGenre());
//        newBook.setYear(bookDTO.getYear());
//        newBook.setDescription(bookDTO.getDescription());
//        newBook.setPageLength(bookDTO.getPageLength());
//        newBook.setLanguage(bookDTO.getLanguage());
//        newBook.setComingSoonDate(bookDTO.getComingSoonDate());
//        newBook.setQuantity(bookDTO.getQuantity());
//        newBook.setSubGenre(bookDTO.getSubGenre());
//        newBook.setPublicationDate(bookDTO.getPublicationDate());
//        storage.add(newBook);
//    }
//
//    public Long getMaximumID() {
//        Long maxID = 0L;
//        for (Book book : storage) {
//            if (book.getId() > maxID) {
//                maxID = book.getId();
//            }
//        }
//        return maxID;
//    }
//
//
//    /**
//     * ? Not correct use int id
//     */
//    @SneakyThrows
//    public Book getBookFromStorage(Long id) {
//        for (Book book : storage) {
//
//            if (book.getId() == id)
//                return book;
//        }
//
//        throw new Exception("Book with id: " + id + " doesnt exist");
//    }
//
//    @SneakyThrows
//    public void deleteBookFromStorage(Long id) {
//        for (Book book : storage) {
//
//            if (book.getId() == id) {
//                storage.remove(Math.toIntExact(id));
//            }
//        }
//
//        throw new Exception("Book with id: " + id + " doesnt exist");
//    }
//
//    @SneakyThrows
//    public Book searchBookTitle(String input) {
//        for (Book book : storage) {
//
//            if (book.getTitle().equalsIgnoreCase(input)) {
//                return book;
//            } else if (book.getAuthor().equalsIgnoreCase(input)) {
//                return book;
//            } else if (book.getGenre().equalsIgnoreCase(input)) {
//                return book;
//            } else if (book.getLanguage().equalsIgnoreCase(input)) {
//                return book;
//            } else if (book.getSubGenre().equalsIgnoreCase(input)) {
//                return book;
//
//            } else if (book.getDescription().contains(input)) {
//                return book;
//            }
//
//        }
//
//        throw new Exception("Book with : " + input + " doesnt exist");
//    }
//
//
//    @Override
//    public List<Book> getAllBooks() {
//        return storage;
//    }
//
//    @Override
//    public <S extends Book> S save(S entity) {
//        return null;
//    }
//
//    @Override
//    public <S extends Book> Iterable<S> saveAll(Iterable<S> entities) {
//        return null;
//    }
//
//    @Override
//    public Optional<Book> findById(Long aLong) {
//        return Optional.empty();
//    }
//
//    @Override
//    public boolean existsById(Long aLong) {
//        return false;
//    }
//
//    @Override
//    public Iterable<Book> findAll() {
//        return null;
//    }
//
//    @Override
//    public Iterable<Book> findAllById(Iterable<Long> longs) {
//        return null;
//    }
//
//    @Override
//    public long count() {
//        return 0;
//    }
//
//    @Override
//    public void deleteById(Long aLong) {
//
//    }
//
//    @Override
//    public void delete(Book entity) {
//
//    }
//
//    @Override
//    public void deleteAllById(Iterable<? extends Long> longs) {
//
//    }
//
//    @Override
//    public void deleteAll(Iterable<? extends Book> entities) {
//
//    }
//
//    @Override
//    public void deleteAll() {
//
//    }
//
////    @Override
////    public Book updateBook(Long id, UpdateBook book) {
////        return null;
//////    }
}
