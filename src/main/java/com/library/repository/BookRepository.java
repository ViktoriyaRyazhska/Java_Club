package com.library.repository;

import com.library.entity.Book;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

public interface BookRepository {

    Book save(Book book);

    Book findById(Long id);

    Book findByIdFetchCoAuthors(Long id);

    List<Book> findAll();

    Book remove(Long id);

    Optional<Double> averageTimeOfReadingBook(String title);

    Optional<List<Book>> findBooksByAuthorOrTitle(String str);

    List<Book> findMostPopularBooks(LocalDateTime from, LocalDateTime to);

    List<Book> findMostUnpopularBooks(LocalDateTime from, LocalDateTime to);
}
