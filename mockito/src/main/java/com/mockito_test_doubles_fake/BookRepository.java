package com.mockito_test_doubles_fake;

import java.util.Collection;

public interface BookRepository {
    void save(Book book);
    Collection<Book> findAll();
}
