package lightheadfox.ru.library_system.service;

import lightheadfox.ru.library_system.domain.Book;

public interface BookService {

    Book getBookAuthor(String author);

    Book getBookName(String title);

    Book getBookDescription(String description);

    Book getBookGenre(String genre);

    Book getBookSubGenre(String subGenre);

    Book getBookYear(int year);

    Book getBookISBN(int ISBN);

    Book getBookPublicationDate(int publicationDate);

    Book getBookLanguage(String language);

    Book getBookPageLength(int pageLength);

    Book getBookComingSoonDate(int comingSoonDate);

    Book getBookQuantitity(int quantity);





}
