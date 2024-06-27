package lightheadfox.ru.library_system.Entity;

import org.springframework.stereotype.Component;

@Component
public class Author {

    private String Name;

    public void NameBean (String name){
        this.Name = name;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }
}
