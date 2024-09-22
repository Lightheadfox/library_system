package lightheadfox.ru.library_system.repository;

import lightheadfox.ru.library_system.domain.Book;

import org.springframework.data.jpa.repository.JpaRepository;

public interface BookStorage extends JpaRepository<Book, Long> {


    void deleteBookById(Long id);
}
