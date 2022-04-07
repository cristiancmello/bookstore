package com.example.bookstore;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Esta Interface é responsável pelo acesso aos dados.
 * Se comporta como um Adapter "dentro-fora" e ao mesmo tempo é uma Porta de Saída.
 * Eu considero como uma Porta de Saída caso fique somente como uma interface.
 * Mas devido ao Spring, é também um Adapter "magro".
 * */
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
    List<Book> findBooksByAuthor(String author);
}
