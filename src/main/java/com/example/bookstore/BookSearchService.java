package com.example.bookstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Uma Domain Class.
 */
@Service
public class BookSearchService implements BookSearchInterface {
    private final BookRepository bookRepository;

    @Autowired
    public BookSearchService(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    @Override
    public List<Book> searchByAuthor(String author) {
        // Input validation
        if (author.isEmpty()) {
            throw new IllegalStateException("author name cannot empty");
        }
        return bookRepository.findBooksByAuthor(author);
    }
}
