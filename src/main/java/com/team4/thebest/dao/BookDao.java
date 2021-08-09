package com.team4.thebest.dao;

import com.team4.thebest.models.Book;

import java.util.List;

public interface BookDao {
    void save(Book book);

    List<Book> list();
}
