package lightheadfox.ru.library_system.Entity;

import org.springframework.stereotype.Component;

@Component
public class Description {

    private String description;

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
