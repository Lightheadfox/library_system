package lightheadfox.ru.library_system.service;

import lightheadfox.ru.library_system.domain.Book;
import org.springframework.stereotype.Component;

import java.util.List;

@Component

public class BookService implements BookInterface {
    @Override
    public Book getBook(Long id) {
        Book book = new Book();
        book.setAuthor("Author");
        book.setTitle("Title");
        book.setIsbn(15315);
        book.setDescription("Description");
        book.setGenre("genre");
        book.setLanguage("English");
        book.setQuantity(15354);
        book.setPublicationDate(1990);
        book.setComingSoonDate(1995);
        book.setSubGenre("SubGenre");
        book.setPageLength(1550);
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

    @Override
    public void addBook(Long id) {

    }

    @Override
    public void deleteBook(Long id) {

    }





/*
    @Override
    public String getBookAuthor() {
        return "Author: ";
    }

    @Override
    public String getBookTitle() {
        return "Title: ";
    }

    @Override
    public String getBookDescription() {
        return "Description: ";
    }

    @Override
    public String getBookGenre() {
        return "Genre: ";
    }

    @Override
    public String getBookSubGenre() {
        return "Sub Genre: ";
    }

    @Override
    public Integer getBookYear() {
        return 1993;
    }

    @Override
    public Integer getBookISBN() {
        return 1651651543;
    }

    @Override
    public Integer getBookPublicationDate() {
        return 1990;
    }

    @Override
    public String getBookLanguage() {
        return "Language: ";
    }

    @Override
    public Integer getBookPageLength() {
        return 555;
    }

    @Override
    public Integer getBookComingSoonDate() {
        return 1995;
    }

    @Override
    public Integer getBookQuantitity() {
        return 999;
    }


 */
}
