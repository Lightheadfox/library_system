package lightheadfox.ru.library_system.Entity;

import org.springframework.stereotype.Component;

@Component
public class ISBN {

    private int asin;


    public int getAsin() {
        return asin;
    }


    public void setAsin(int asin) {
        this.asin = asin;
    }
}
