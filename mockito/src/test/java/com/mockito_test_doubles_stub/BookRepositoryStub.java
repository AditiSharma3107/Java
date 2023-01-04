package com.mockito_test_doubles_stub;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class BookRepositoryStub implements BookRepository {
    @Override
    public List<Book> findNewBooks(int days) {
        List<Book> newBooks = new ArrayList<>();
        Book book1 = new Book("777","Mockito In Action", 500, LocalDate.now());
        Book book2 = new Book("778","JUnit5 In Action", 400, LocalDate.now());

        newBooks.add(book1);
        newBooks.add(book2);

        return newBooks;
    }
}
