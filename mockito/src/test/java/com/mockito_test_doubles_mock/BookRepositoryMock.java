package com.mockito_test_doubles_mock;

import com.mockito_test_doubles_spy.Book;
import com.mockito_test_doubles_spy.BookRepository;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BookRepositoryMock implements BookRepository {

    int saveCalled = 0;
    Book lastAddedBook = null;

    @Override
    public void save(Book book) {
        saveCalled++;
        lastAddedBook = book;
    }

    public void verify(Book book, int times){
        assertEquals(times, saveCalled);
        assertEquals(book, lastAddedBook);
    }
}
