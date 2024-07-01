package lightheadfox.ru.library_system.service;

import lightheadfox.ru.library_system.domain.Book;
import org.springframework.stereotype.Component;

import java.util.List;

@Component

public class BookService implements BookInterface {
    @Override
    public Book getBook(Long id) {
        Book book = new Book();
        book.
        return new Book();
    }

    @Override
    public List<Book> getBookByGenre(String genre) {
        return List.of();
    }

    @Override
    public List<Book> getAllBooks() {
        return List.of();
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
