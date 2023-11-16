package seminars.fourth.book;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class BookServiceTest {
    BookRepository bookRepository;
    BookService bookService;

    @BeforeEach
    void setUp() {
        bookRepository = mock(InMemoryBookRepository.class);
        bookService = new BookService(bookRepository);
    }


    @Test
    void testIdBookService(){

        List <Book> dataTest = new ArrayList<>();

        dataTest.add(new Book("1","Book1", "Author1"));
        dataTest.add(new Book("2","Book2", "Author2"));

        when(bookRepository.findById(anyString())).thenReturn(dataTest.get(1));

        assertEquals(dataTest.get(1), bookService.findBookById("2"));
    }

    @Test
    void testAllBookService(){

        List <Book> dataTest = new ArrayList<>();

        dataTest.add(new Book("1","Book1", "Author1"));
        dataTest.add(new Book("2","Book2", "Author2"));

        when(bookRepository.findAll()).thenReturn(dataTest);

        assertEquals(dataTest, bookService.findAllBooks());
    }

}