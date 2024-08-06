package lightheadfox.ru.library_system.service;

import lightheadfox.ru.library_system.domain.Book;

import java.util.List;

public interface BookInterface {

    Book getBook(Long id);

    List<Book> getBookByGenre(String genre);

    List<Book> getAllBooks();

    //void addBook(Long id);

    void addBook(Long id, String author, String title, int isbn, String description, String genre, String language, int quantity, int publicationDate, int comingSoonDate, String subGenre,int pageLength);

    void deleteBook(Long id);

    String getBookAuthor(Long id);

    String getBookTitle(Long id);

    String getBookDescription(Long id);

    String getBookGenre(Long id);

    String getBookSubGenre(Long id);

    Integer getBookYear(Long id);

    Integer getBookISBN(Long id);

    Integer getBookPublicationDate(Long id);

    String getBookLanguage(Long id);

    Integer getBookPageLength(Long id);

    Integer getBookComingSoonDate(Long id);

    Integer getBookQuantity(Long id);


    // TODO implement
   // Book updateBook(UpdateBook);



}
