package com.mockito_test_doubles_spy;

import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SpyTest {

    @Test
    public void demoSpy(){
        BookRepositorySpy bookRepositorySpy = new BookRepositorySpy();
        BookService bookService = new BookService(bookRepositorySpy);

        Book book1 = new Book("777","Mockito In Action",500, LocalDate.now());
        Book book2 = new Book("778","JUnit5 In Action",400, LocalDate.now());

        bookService.addBook(book1);
        assertEquals(0, bookRepositorySpy.timesCalled());

        bookService.addBook(book2);
        assertEquals(1, bookRepositorySpy.timesCalled());

        //assertTrue(bookRepositorySpy.calledWith(book2));


    }
}
