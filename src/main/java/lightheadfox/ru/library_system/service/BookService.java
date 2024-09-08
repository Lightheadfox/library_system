package lightheadfox.ru.library_system.service;

import lightheadfox.ru.library_system.domain.Book;

import lightheadfox.ru.library_system.domain.BookDTO;
import lightheadfox.ru.library_system.repository.BookStorage;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
//@Transactional

public class BookService implements BookInterface {


    @Autowired
    BookStorage bookRepository;

    //private BookStorage bookRepository;


    @Override
    public Book getBook(Long id) {
        Optional<Book> book = bookRepository.findById(id);

        return book.get();
    }

    @Override
    public List<Book> getAllBooks() {

        List<Book> books = bookRepository.findAll();
        return books;
    }

    @Override
    public void deleteBook(Long id) {
        bookRepository.delete(getBook(id));
    }

    @Override
    public void addBook(BookDTO bookDTO) {


    }


//    @Override
//    public List<Book> getBookByGenre(String genre) {
//        return List.of();
//    }
//
//
//    private List<Book> allBooks = List.of(new Book());
//
//    @Override
//    public List<Book> getAllBooks() {
//
//
//        return this.allBooks;
//    }
//
//
//    // TODO: Implement adding book to a list
//
//    /**
//     * @param id
//     * @param author
//     * @param title
//     * @param isbn
//     */
//
//
//    @Override
//    public void addBook(BookDTO bookDTO) {
//
//        bookRepository.saveBook(bookDTO);
//    }
//
//
//    // TODO implement Interface deleteBook
//    // (!) Dont use in multithreading
//    //
//
//
//    @Override
//    public void deleteBook(Long id) {
//        bookRepository.deleteBookFromStorage(id);
//
//    }
//
//
//    @Override
//    public String getBookAuthor(Long id) {
//
//
//        return "Author: " + bookRepository.getBookFromStorage(id).getAuthor();
//    }
//
//    @Override
//    public String getBookTitle(Long id) {
//        return "Title: " + bookRepository.getBookFromStorage(id).getTitle();
//    }
//
//    @Override
//    public String getBookDescription(Long id) {
//        return "Description: " + bookRepository.getBookFromStorage(id).getDescription();
//    }
//
//    @Override
//    public String getBookGenre(Long id) {
//        return "Genre: " + bookRepository.getBookFromStorage(id).getGenre();
//    }
//
//    @Override
//    public String getBookSubGenre(Long id) {
//        return "Sub Genre: " + bookRepository.getBookFromStorage(id).getSubGenre();
//    }
//
//    @Override
//    public Integer getBookYear(Long id) {
//        return bookRepository.getBookFromStorage(id).getYear();
//    }
//
//    @Override
//    public Integer getBookISBN(Long id) {
//        return bookRepository.getBookFromStorage(id).getIsbn();
//    }
//
//    @Override
//    public Integer getBookPublicationDate(Long id) {
//        return bookRepository.getBookFromStorage(id).getPublicationDate();
//    }
//
//    @Override
//    public String getBookLanguage(Long id) {
//        return "Language: " + bookRepository.getBookFromStorage(id).getLanguage();
//    }
//
//    @Override
//    public Integer getBookPageLength(Long id) {
//        return bookRepository.getBookFromStorage(id).getPageLength();
//    }
//
//    @Override
//    public Integer getBookComingSoonDate(Long id) {
//        return bookRepository.getBookFromStorage(id).getComingSoonDate();
//    }
//
//    @Override
//    public Integer getBookQuantity(Long id) {
//        return bookRepository.getBookFromStorage(id).getQuantity();
//    }


}
