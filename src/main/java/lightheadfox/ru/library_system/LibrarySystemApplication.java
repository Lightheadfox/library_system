package lightheadfox.ru.library_system;

import lightheadfox.ru.library_system.config.SpringConfig;
import lightheadfox.ru.library_system.service.BookService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

//@EnableAutoConfiguration
//@ComponentScan
//@EnableJpaRepositories(basePackages = "lightheadfox.ru.library_system")

@SpringBootApplication
@EntityScan ("lightheadfox.ru.library_system")
public class LibrarySystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(LibrarySystemApplication.class, args);

       // AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);





    }

}
