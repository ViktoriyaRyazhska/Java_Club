package com.team4.thebest.services.impl;

import com.team4.thebest.dao.BookDao;
import com.team4.thebest.models.Book;
import com.team4.thebest.services.BookService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;

@Service
@Transactional
@AllArgsConstructor
public class BookServiceImpl implements BookService {

    private BookDao bookDao;

    public void save(Book book) {
        bookDao.save(book);
    }

    public List<Book> list() {
        return bookDao.list();
    }
}
