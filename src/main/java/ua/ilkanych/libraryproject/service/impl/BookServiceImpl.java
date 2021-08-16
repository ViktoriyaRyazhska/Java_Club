package ua.ilkanych.libraryproject.service.impl;

import org.springframework.stereotype.Service;
import ua.ilkanych.libraryproject.dao.BookDao;
import ua.ilkanych.libraryproject.model.Book;
import ua.ilkanych.libraryproject.service.BookService;

import java.util.List;

@Service
public class BookServiceImpl implements BookService {

    private final BookDao bookDao;

    public BookServiceImpl(BookDao bookDao) {
        this.bookDao = bookDao;
    }

    @Override
    public Book create(Book book) {
        return bookDao.create(book);
    }

    @Override
    public Book getById(Long id) {
        return bookDao.getById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookDao.getAll();
    }

    @Override
    public Book delete(Long id) {
        return bookDao.delete(id);
    }

    @Override
    public Book getByTitle(String title) {
        return bookDao.getByTitle(title);
    }

    @Override
    public Book getBookAuthors(Long id) {
        return bookDao.getBookAuthors(id);
    }


    @Override
    public List<Book> getMostPopularBooksForWeek() {
        return bookDao.getMostPopularBooksForWeek();
    }
}
