package com.softserve.team5.service.services;

import com.softserve.team5.dao.interfaces.BookAuthorDao;
import com.softserve.team5.service.interfaces.BookAuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class BookAuthorServiceImpl implements BookAuthorService {
    private final BookAuthorDao bookAuthorDao;

    @Autowired
    public BookAuthorServiceImpl(BookAuthorDao bookAuthorDao) {
        this.bookAuthorDao = bookAuthorDao;
    }

    @Override
    public void deleteAuthor(Long book_id, Long author_id) {
        bookAuthorDao.deleteAuthor(book_id, author_id);
    }
}
