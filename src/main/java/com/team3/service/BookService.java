package com.team3.service;


import com.team3.entity.Book;

import java.util.List;

public interface BookService {
    Book save(Book book);

    Book findById(int id);

    Book remove(int id);

    List<Book> findAll();

    List<Book> findBooksByTitle(String title);

    List<Book> findBooksByAuthor(String name);
}
