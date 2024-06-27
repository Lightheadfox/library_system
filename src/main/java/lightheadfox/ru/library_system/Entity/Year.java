package lightheadfox.ru.library_system.Entity;

import org.springframework.stereotype.Component;

@Component
public class Year {

    private int year;

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
}
