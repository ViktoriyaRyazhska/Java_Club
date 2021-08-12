package com.team4.thebest.dao;

import com.team4.thebest.models.Book;

import java.util.List;
import java.util.Optional;

public interface BookDao {
    void save(Book book);

    List<Book> getAllBooks();

    Book getBookById(Long id);

    void update(Book book);

    void delete(Long id);

    List<Book> findBookByNameOrAuthor(String keyword);

    Book findById(Long id);

    Integer getCountOfCopiesByBookId(Long id);

    Integer amountOfReaders(Long id);

    Integer amountOfUsersReadingBookNow(Long id);

    Optional<Long> sumOfBookReadingTime(Long id);
}
