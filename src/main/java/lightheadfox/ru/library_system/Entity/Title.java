package lightheadfox.ru.library_system.Entity;

import org.springframework.stereotype.Component;

@Component
public class Title {

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
