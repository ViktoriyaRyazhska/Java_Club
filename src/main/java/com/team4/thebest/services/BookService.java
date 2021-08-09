package com.team4.thebest.services;

import com.team4.thebest.models.Book;

import java.util.List;

public interface BookService {
    void save(Book book);

    List<Book> list();
}
