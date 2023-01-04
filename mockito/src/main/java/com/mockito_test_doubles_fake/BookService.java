package com.mockito_test_doubles_fake;

public class BookService {

    private BookRepository bookRepository;

    public BookService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void addBook(Book book){
        bookRepository.save(book);
    }

    public int  findNumberOfBooks(){
        return bookRepository.findAll().size();
    }
}
