package com.example.bookstore;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class BookConfig {
    @Bean
    CommandLineRunner commandLineRunner(BookRepository repository) {
        return args -> {
            Book book1 = new Book("Engenharia de Software Moderna", "1234-23", "Valente");
            Book book2 = new Book("Estruturas de Dados", "3561-23", "Valente");
            Book book3 = new Book("Algoritmos", "1362-23", "T. Cormen");

            repository.saveAll(List.of(book1, book2, book3));
        };
    }
}
