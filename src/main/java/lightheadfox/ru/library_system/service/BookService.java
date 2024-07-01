package lightheadfox.ru.library_system.service;

import lightheadfox.ru.library_system.domain.Book;

public interface BookService {

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





}
