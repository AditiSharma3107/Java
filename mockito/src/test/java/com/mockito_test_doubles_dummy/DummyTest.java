package com.mockito_test_doubles_dummy;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collection;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

public class DummyTest {

    @Test
    public void demoDummy(){
        BookRepository bookRepository =  new FakeBookRepository();
        BookService bookService = new BookService(bookRepository);

        bookService.addBook(new Book("777","Mockito In Action", 250, LocalDate.now()));
        bookService.addBook(new Book("778","JUnit5 In Action", 200, LocalDate.now()));

        assertEquals(2, bookService.findNumberOfBooks());
//        BookRepository bookRepository = new FakeBookRepository();
//        EmailService emailService = new DummyEmailService();
//        BookService bookService = new BookService(bookRepository, emailService);
//
//        bookService.addBook(new Book("777","Mockito In Action", 250, LocalDate.now()));
//        bookService.addBook(new Book("778","JUnit5 In Action", 200, LocalDate.now()));
//
//        assertEquals(2, bookService.findNumberOfBooks());
    }

    @Test
    public void demoDummyWithMockito(){

        BookRepository bookRepository = mock(BookRepository.class);
        BookService bookService = new BookService(bookRepository);

        Book book1 = new Book("777","Hello",250,LocalDate.now());
        Book book2 = new Book("778","Hey",400,LocalDate.now());

        Collection<Book> books = new ArrayList<>();
        books.add(book1);
        books.add(book2);

        when(bookRepository.findAll()).thenReturn(books);

        assertEquals(2, bookService.findNumberOfBooks());
    }
}
