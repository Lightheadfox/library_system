package lightheadfox.ru.library_system.Entity;

import org.springframework.stereotype.Component;

@Component
public class Language {

    private String language;

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }
}
