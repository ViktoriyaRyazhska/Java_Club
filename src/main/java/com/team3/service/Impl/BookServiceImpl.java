package com.team3.service.Impl;

import com.team3.dao.BookDao;
import com.team3.entity.Book;
import com.team3.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class BookServiceImpl implements BookService {
    BookDao bookDao;

    @Autowired
    public BookServiceImpl(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public Book save(Book book) {
        return bookDao.save(book);
    }

    @Override
    public Book findById(Long id) {
        return bookDao.findById(id);
    }

    @Override
    public Book remove(int id) {
        return bookDao.remove(id);
    }

    @Override
    public List<Book> findAll() {
        return bookDao.findAll();
    }

    @Override
    public List<Book> findBooksByTitle(String title) {
        return bookDao.findBooksByTitle(title);
    }

    @Override
    public List<Book> findBooksByAuthor(String name) {
        return bookDao.findBooksByAuthor(name);
    }
}
