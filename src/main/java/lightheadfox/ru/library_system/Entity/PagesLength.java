package lightheadfox.ru.library_system.Entity;

import org.springframework.stereotype.Component;

@Component
public class PagesLength {

    private int pages;

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }
}
