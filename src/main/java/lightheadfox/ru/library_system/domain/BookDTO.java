package lightheadfox.ru.library_system.domain;

import jakarta.persistence.Column;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
public class BookDTO {


    private String author;


    private String title;


    private String description;


    private String genre;


    private String subGenre;


    private Integer year;


    private Integer isbn;


    private Integer publicationDate;


    private String language;


    private Integer pageLength;


    private Integer comingSoonDate;


    private Integer quantity;


}
