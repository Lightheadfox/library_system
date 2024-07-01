package lightheadfox.ru.library_system;

import lightheadfox.ru.library_system.config.SpringConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

@SpringBootApplication
public class LibrarySystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibrarySystemApplication.class, args);

       // AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);



    }

}
