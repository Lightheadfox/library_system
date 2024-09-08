package lightheadfox.ru.library_system.domain;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


import java.io.Serializable;
import java.sql.Array;
import java.util.ArrayList;
import java.util.Objects;
import java.util.TreeMap;
import java.util.Vector;

@Entity
@Table(name = "book")
@Data
@NoArgsConstructor
@Getter
@Setter
public class Book implements Serializable {

    private static final long serialVersionUID = 1L;


//TreeMap<String,String> treeMpa = new TreeMap<>();

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
