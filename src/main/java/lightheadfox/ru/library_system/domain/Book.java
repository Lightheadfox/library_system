package lightheadfox.ru.library_system.domain;


import jakarta.persistence.Column;
import lombok.Data;
import lombok.NoArgsConstructor;
import jakarta.persistence.Entity;



import java.io.Serializable;

@Data
@Entity
@NoArgsConstructor

public class Book implements Serializable {

    private static final long serialVersionUID = 1L;

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


}
