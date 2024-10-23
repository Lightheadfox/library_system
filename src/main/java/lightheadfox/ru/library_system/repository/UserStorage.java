package lightheadfox.ru.library_system.repository;
import lightheadfox.ru.library_system.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserStorage extends JpaRepository<User, Long> {

    void deleteById(Long id);

}
