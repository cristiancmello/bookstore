package com.example.bookstore;

import java.util.List;

/**
 * Um port de entrada.
 */
public interface BookSearchInterface {
    List<Book> searchByAuthor(String author);
}
