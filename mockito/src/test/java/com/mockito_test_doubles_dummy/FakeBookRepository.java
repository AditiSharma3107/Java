package com.mockito_test_doubles_dummy;

import com.mockito_test_doubles_fake.Book;
import com.mockito_test_doubles_fake.BookRepository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

public class FakeBookRepository implements BookRepository {
    //In memory database, HashMap or  List
    Map<String, com.mockito_test_doubles_fake.Book> bookStore = new HashMap<>();

    @Override
    public void save(com.mockito_test_doubles_fake.Book book) {

        bookStore.put(book.getBookId(), book);
    }

    @Override
    public Collection<Book> findAll() {
        return bookStore.values();
    }
}
