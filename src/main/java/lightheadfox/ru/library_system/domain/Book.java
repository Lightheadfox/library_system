package lightheadfox.ru.library_system.domain;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.io.Serializable;
import java.sql.Array;
import java.util.*;

@Entity
@Table(name = "book")
@Data
@NoArgsConstructor
@Getter
@Setter
public class Book {

    //private static final long serialVersionUID = 1L;


    public Book(BookDTO bookDTO) {
        this.author = bookDTO.getAuthor();
        this.title = bookDTO.getTitle();
        this.language = bookDTO.getLanguage();
        this.isbn = bookDTO.getIsbn();
        this.publicationDate = bookDTO.getPublicationDate();
        this.quantity = bookDTO.getQuantity();
        this.genre = bookDTO.getGenre();
        this.subGenre = bookDTO.getSubGenre();
        this.comingSoonDate = bookDTO.getComingSoonDate();
        this.year = bookDTO.getYear();
        this.description = bookDTO.getDescription();

    }

    @Id
    @GeneratedValue
    private Long id;

    @Column(nullable = false)
    private String author;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String description;

    @Column(nullable = false)
    private String genre;

    @Column(nullable = false)
    private String subGenre;

    @Column
    private Integer year;

    @Column
    private Integer isbn;

    @Column
    private Integer publicationDate;

    @Column(nullable = false)
    private String language;

    @Column
    private Integer pageLength;

    @Column
    private Integer comingSoonDate;

    @Column
    private Integer quantity;




    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Objects.equals(id, book.id) && Objects.equals(author, book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, author);
    }
}
