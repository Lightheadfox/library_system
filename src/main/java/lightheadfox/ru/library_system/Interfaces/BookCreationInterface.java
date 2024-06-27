package lightheadfox.ru.library_system.Interfaces;


public interface BookCreationInterface {


    public String setBookTitle(String title);


    public String setBookAuthor(String author);


    public String setBookISBN(String isbn);


    public String setBookDescription(String description);


    public String setBookGenre(String genre);


    public String setBookSubGenre(String subGenre);


    public String setBookLanguage(String language);


    public Integer setBookAsin(int asin);


    public Integer setBookYear(int year);


    public Integer setBookPageCount(int pageLength);


    public Integer setBookQuantity(int quantity);

}
