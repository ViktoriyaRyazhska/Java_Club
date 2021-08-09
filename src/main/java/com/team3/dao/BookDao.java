package com.team3.dao;

import com.team3.entity.Book;

import java.util.List;

public interface BookDao {

    Book save(Book book);

    Book findById(int id);

    Book remove(int id);

    List<Book> findAll();
}
