package lightheadfox.ru.library_system.service;

import lightheadfox.ru.library_system.domain.Book;

import java.util.List;

public interface BookInterface {

    Book getBook(Long id);

    List<Book> getBookByGenre(String genre);

    List<Book> getAllBooks();


    /*
    String getBookAuthor();

    String getBookTitle();

    String getBookDescription();

    String getBookGenre();

    String getBookSubGenre();

    Integer getBookYear();

    Integer getBookISBN();

    Integer getBookPublicationDate();

    String getBookLanguage();

    Integer getBookPageLength();

    Integer getBookComingSoonDate();

    Integer getBookQuantitity();

*/



}
