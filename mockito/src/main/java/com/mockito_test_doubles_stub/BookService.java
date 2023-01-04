package com.mockito_test_doubles_stub;

import java.util.List;

public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public List<Book> getNewBooksWithAppliedDiscount(int discountRate, int days){
            List<Book> newBooks = bookRepository.findNewBooks(days);
            // See apply 10% -> 10% of 500 -> 50 -> 500 - 50 -> 450

            for(Book book: newBooks){
                int price = book.getPrice();
                int newPrice = price - (discountRate * price / 100);
                book.setPrice(newPrice);
            }

            return newBooks;
    }
}
