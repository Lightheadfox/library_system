package lightheadfox.ru.library_system.Entity;


import lightheadfox.ru.library_system.Interfaces.BookCreationInterface;

import java.io.Serializable;

public class Book implements Serializable, BookCreationInterface {


    @Override
    public String setBookTitle(String title) {
        return "";
    }

    @Override
    public String setBookAuthor(String author) {
        return "";
    }

    @Override
    public String setBookISBN(String isbn) {
        return "";
    }

    @Override
    public String setBookDescription(String description) {
        return "";
    }

    @Override
    public String setBookGenre(String genre) {
        return "";
    }

    @Override
    public String setBookSubGenre(String subGenre) {
        return "";
    }

    @Override
    public String setBookLanguage(String language) {
        return "";
    }

    @Override
    public Integer setBookAsin(int asin) {
        return 0;
    }

    @Override
    public Integer setBookYear(int year) {
        return 0;
    }

    @Override
    public Integer setBookPageCount(int pageLength) {
        return 0;
    }

    @Override
    public Integer setBookQuantity(int quantity) {
        return 0;
    }
}
