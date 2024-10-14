package lightheadfox.ru.library_system.domain;

import lightheadfox.ru.library_system.domain.ENUMS.Genres;
import lightheadfox.ru.library_system.domain.ENUMS.Language;
import lightheadfox.ru.library_system.domain.ENUMS.SubGenres;
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


    private Genres genre;


    private SubGenres subGenre;


    private Integer year;


    private Integer isbn;


    private Integer publicationDate;


    private Language language;


    private Integer pageLength;


    private Integer comingSoonDate;


    private Integer quantity;


}
