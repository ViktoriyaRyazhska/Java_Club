package com.team4.thebest.services.impl;

import com.team4.thebest.dao.BookDao;
import com.team4.thebest.dao.RentInfoDao;
import com.team4.thebest.models.Book;
import com.team4.thebest.services.BookService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService {

    private final BookDao bookDao;
    private final RentInfoDao rentInfoDao;

    @Override
    public void save(Book book) {
        bookDao.save(book);
    }

    @Override
    public List<Book> getAllBooks() {
        return bookDao.getAllBooks();
    }

    @Override
    public Book getBookById(Long id) {
        return bookDao.getBookById(id);
    }

    @Override
    public void update(Book book) {
        bookDao.update(book);
    }

    @Override
    public void delete(Long id) {
        rentInfoDao.deleteRentByBookId(id);
        bookDao.delete(id);
    }

    @Override
    public List<Book> search(String keyword) {
        return bookDao.findBookByNameOrAuthor(keyword);
    }

    @Override
    public Book findById(Long id) {
        return bookDao.findById(id);
    }

    @Override
    public Integer amountOfReaders(Long id) {
        return bookDao.amountOfReaders(id);
    }

    @Override
    public Integer amountOfUsersReadingBookNow(Long id) {
        return bookDao.amountOfUsersReadingBookNow(id);
    }

    @Override
    public Optional<Long> sumOfBookReadingTime(Long id) {
        return bookDao.sumOfBookReadingTime(id);
    }

    @Override
    public Book getTheMostPopular() {
        return bookDao.getTheMostPopular();
    }

    @Override
    public Book getTheMostUnpopular() {
        return bookDao.getTheMostUnpopular();
    }

    @Override
    public List<Book> timeSearch(LocalDateTime from, LocalDateTime to) {
        return bookDao.timeSearch(from, to);
    }


}
