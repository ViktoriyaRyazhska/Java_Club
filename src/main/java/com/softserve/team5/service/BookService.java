package com.softserve.team5.service;

import com.softserve.team5.dao.BookDao;
import com.softserve.team5.entity.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private final BookDao bookDao;

    @Autowired
    public BookService(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    void create(Book book) {
        this.bookDao.create(book);
    }

    void delete(Book book) {
        this.bookDao.delete(book);
    }

    Book getById(Long id) {
        return this.bookDao.getById(id);
    }

    void update(Book book) {
        this.bookDao.update(book);
    }
}
