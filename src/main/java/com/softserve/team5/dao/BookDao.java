package com.softserve.team5.dao;

import com.softserve.team5.entity.Book;

public interface BookDao {
    void create(Book book);
    void delete(Book book);
    Book getById(Long id);
    void update(Book book);
}
