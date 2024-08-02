package lightheadfox.ru.library_system.service;

import lightheadfox.ru.library_system.domain.Book;
import lightheadfox.ru.library_system.repository.BookRepository;
import lightheadfox.ru.library_system.repository.BookStorage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component

public class BookService implements BookInterface {

    @Autowired
    public BookStorage storage;
    @Autowired
    private BookRepository bookRepository;


    @Override
    public Book getBook(Long id) {
        Book book = bookRepository.getBookFromStorage(id);

        return book;
    }


    @Override
    public List<Book> getBookByGenre(String genre) {
        return List.of();
    }


    private List<Book> allBooks = List.of(new Book());

    @Override
    public List<Book> getAllBooks() {


        return this.allBooks;
    }


    // TODO: Implement adding book to a list

    /**
     * @param id
     * @param author
     * @param title
     * @param isbn
     */


    @Override
    public void addBook(Long id, String author, String title, int isbn, String description, String genre, String language, int quantity, int publicationDate, int comingSoonDate, String subGenre, int pageLength) {
        Book book = new Book();
        book.setId(id);
        book.setAuthor(author);
        book.setTitle(title);
        book.setIsbn(isbn);
        book.setDescription(description);
        book.setGenre(genre);
        book.setLanguage(language);
        book.setQuantity(quantity);
        book.setPublicationDate(publicationDate);
        book.setComingSoonDate(comingSoonDate);
        book.setSubGenre(subGenre);
        book.setPageLength(pageLength);
        bookRepository.saveBook(book);
    }


    // TODO implement Interface deleteBook
    // (!) Dont use in multithreading
    //


    @Override
    public void deleteBook(Long id) {
        bookRepository.deleteBookFromStorage(id);

    }


    @Override
    public String getBookAuthor(Long id) {


        return "Author: " + bookRepository.getBookFromStorage(id).getAuthor();
    }

    @Override
    public String getBookTitle(Long id) {
        return "Title: " + bookRepository.getBookFromStorage(id).getTitle();
    }

    @Override
    public String getBookDescription(Long id) {
        return "Description: " + bookRepository.getBookFromStorage(id).getDescription();
    }

    @Override
    public String getBookGenre(Long id) {
        return "Genre: " + bookRepository.getBookFromStorage(id).getGenre();
    }

    @Override
    public String getBookSubGenre(Long id) {
        return "Sub Genre: " + bookRepository.getBookFromStorage(id).getSubGenre();
    }

    @Override
    public Integer getBookYear(Long id) {
        return bookRepository.getBookFromStorage(id).getYear();
    }

    @Override
    public Integer getBookISBN(Long id) {
        return bookRepository.getBookFromStorage(id).getIsbn();
    }

    @Override
    public Integer getBookPublicationDate(Long id) {
        return bookRepository.getBookFromStorage(id).getPublicationDate();
    }

    @Override
    public String getBookLanguage(Long id) {
        return "Language: " + bookRepository.getBookFromStorage(id).getLanguage();
    }

    @Override
    public Integer getBookPageLength(Long id) {
        return bookRepository.getBookFromStorage(id).getPageLength();
    }

    @Override
    public Integer getBookComingSoonDate(Long id) {
        return bookRepository.getBookFromStorage(id).getComingSoonDate();
    }

    @Override
    public Integer getBookQuantity(Long id) {
        return bookRepository.getBookFromStorage(id).getQuantity();
    }


}
