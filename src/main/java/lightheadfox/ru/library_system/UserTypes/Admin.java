package lightheadfox.ru.library_system.UserTypes;

public class Admin {

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
