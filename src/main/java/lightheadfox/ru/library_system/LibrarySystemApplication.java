package lightheadfox.ru.library_system;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.FilterType;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration;


@SpringBootApplication


public class LibrarySystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibrarySystemApplication.class, args);

    }

}
