package com.mockito_test_doubles_stub;

import java.util.Collection;
import java.util.List;

public interface BookRepository {
    List<Book> findNewBooks(int days);
}
