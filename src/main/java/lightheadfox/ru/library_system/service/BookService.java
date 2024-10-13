package lightheadfox.ru.library_system.service;

import lightheadfox.ru.library_system.domain.Book;

import lightheadfox.ru.library_system.domain.BookDTO;
import lightheadfox.ru.library_system.repository.BookStorage;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Service;


import java.awt.print.Pageable;
import java.util.List;
import java.util.Optional;

@Service


public class BookService implements BookInterface {


    @Autowired
    BookStorage bookRepository;
    @Autowired
    private BookStorage bookStorage;





    @Override
    public Book getBook(Long id) {
        Optional<Book> book = bookRepository.findById(id);

        return book.get();
    }

    @Override
    public List<Book> getAllBooks() {

        List<Book> books = bookRepository.findAll();
        return books;
    }

    @Override
    public List<Book> getAllBooksPaginated(Optional<String> page,Optional<String>size) {
        int intPage = Integer.parseInt(page.orElse("0"));
        int intSize = Integer.parseInt(size.orElse("10"));


        Page books = bookRepository.findAll(PageRequest.of(intPage, intSize));

        return books.stream().toList();
    }

    @Override
    public void deleteBook(Long id) {
        bookRepository.deleteBookById(id);
    }

    @Override
    public void addBook(BookDTO bookDTO) {


        Book newBook = new Book(bookDTO);
        bookRepository.save(newBook);


    }

    public void updateBook(Long id, BookDTO bookDTO) {
        Book patchBook = getBook(id);
        patchBook.setAuthor(bookDTO.getAuthor());
        patchBook.setTitle(bookDTO.getTitle());
        patchBook.setIsbn(bookDTO.getIsbn());
        patchBook.setPublicationDate(bookDTO.getPublicationDate());
        patchBook.setQuantity(bookDTO.getQuantity());
        patchBook.setGenre(bookDTO.getGenre());
        patchBook.setLanguage(bookDTO.getLanguage());
        patchBook.setQuantity(bookDTO.getQuantity());
        patchBook.setSubGenre(bookDTO.getSubGenre());
        patchBook.setComingSoonDate(bookDTO.getComingSoonDate());
        patchBook.setYear(bookDTO.getYear());
        bookRepository.save(patchBook);
    }

    @Override
    public List<Book> fuzzySearchBooks(String searchTerm) {
        return bookStorage.fuzzySearchBooks(searchTerm);
    }


}
