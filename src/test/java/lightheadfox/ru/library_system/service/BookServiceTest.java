package lightheadfox.ru.library_system.service;

import lightheadfox.ru.library_system.domain.Book;
import lightheadfox.ru.library_system.repository.BookStorage;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.when;

import lightheadfox.ru.library_system.domain.BookDTO;


import java.util.Arrays;

import java.util.Optional;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;


public class BookServiceTest {

    @Mock
    private BookStorage bookRepository;

    @Mock
    private BookStorage bookStorage;

    @InjectMocks
    private BookService bookService;

    @BeforeEach
    public void setUp() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    public void testGetBook() {
        Long bookId = 1L;
        Book book = new Book();
        book.setId(bookId);
        when(bookRepository.findById(bookId)).thenReturn(Optional.of(book));

        Book result = bookService.getBook(bookId);

        assertNotNull(result);
        assertEquals(bookId, result.getId());
        verify(bookRepository, times(1)).findById(bookId);
    }

    @Test
    public void testGetAllBooks() {
        List<Book> books = Arrays.asList(new Book(), new Book());
        when(bookRepository.findAll()).thenReturn(books);

        List<Book> result = bookService.getAllBooks();

        assertEquals(2, result.size());
        verify(bookRepository, times(1)).findAll();
    }

    @Test
    public void testDeleteBook() {
        Long bookId = 1L;

        bookService.deleteBook(bookId);

        verify(bookRepository, times(1)).deleteBookById(bookId);
    }

    @Test
    public void testAddBook() {
        BookDTO bookDTO = new BookDTO();
        bookDTO.setTitle("New Book");
        bookDTO.setAuthor("Author");



        bookService.addBook(bookDTO);


        verify(bookRepository, times(1)).save(any(Book.class));
    }

    @Test
    public void testUpdateBook() {
        Long bookId = 1L;
        Book book = new Book();
        book.setId(bookId);
        when(bookRepository.findById(bookId)).thenReturn(Optional.of(book));

        BookDTO bookDTO = new BookDTO();
        bookDTO.setTitle("Updated Title");
        bookDTO.setAuthor("Updated Author");

        bookService.updateBook(bookId, bookDTO);




        verify(bookRepository, times(1)).save(book);
        assertEquals("Updated Title", book.getTitle());
        assertEquals("Updated Author", book.getAuthor());
    }

    @Test
    public void testFuzzySearchBooks() {
        String searchTerm = "Harry";
        List<Book> books = Arrays.asList(new Book(), new Book());
        when(bookStorage.fuzzySearchBooks(searchTerm)).thenReturn(books);

        List<Book> result = bookService.fuzzySearchBooks(searchTerm);

        assertEquals(2, result.size());
        verify(bookStorage, times(1)).fuzzySearchBooks(searchTerm);
    }
}