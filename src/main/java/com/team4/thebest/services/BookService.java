package com.team4.thebest.services;

import com.team4.thebest.models.Book;

import java.util.List;

public interface BookService {
    void save(Book book);

    List<Book> getAllBooks();

    Book getBookById(Long id);

    void update(Book book);

    void delete(Long id);

    List<Book> search(String keyword);
}
