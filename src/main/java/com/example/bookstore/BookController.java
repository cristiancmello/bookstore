package com.example.bookstore;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * O Controller exerce a função de adaptador;
 * Faz uso de um Port de Entrada, sendo bookSearchServiceInterface.
 */
@RestController
@RequestMapping(path = "api/v1/book")
public class BookController {
    private final BookSearchService bookSearchService;

    @Autowired
    public BookController(BookSearchService bookSearchService) {
        this.bookSearchService = bookSearchService;
    }

    @GetMapping("search/author")
    public List<Book> searchByAuthor(@RequestParam(name = "name") String name) {
        return bookSearchService.searchByAuthor(name);
    }
}
