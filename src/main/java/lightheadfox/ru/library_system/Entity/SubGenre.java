package lightheadfox.ru.library_system.Entity;

import org.springframework.stereotype.Component;

@Component
public class SubGenre {

    private String subGenre;

    public String getSubGenre() {
        return subGenre;
    }

    public void setSubGenre(String subGenre) {
        this.subGenre = subGenre;
    }
}
