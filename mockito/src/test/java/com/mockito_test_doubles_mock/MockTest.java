package com.mockito_test_doubles_mock;

import com.mockito_test_doubles_spy.Book;
import com.mockito_test_doubles_spy.BookService;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class MockTest {

    @Test
    public void demoMock(){
        BookRepositoryMock bookRepositoryMock = new BookRepositoryMock();
        BookService bookService = new BookService(bookRepositoryMock);

        Book book1 = new Book("777","Mockito In Action",500, LocalDate.now());
        Book book2 = new Book("778","JUnit5 In Action",400, LocalDate.now());

        bookService.addBook(book1);
        bookService.addBook(book2);

        bookRepositoryMock.verify(book2, 1);

    }
}
