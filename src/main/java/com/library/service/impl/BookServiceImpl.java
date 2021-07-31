package com.library.service.impl;

import com.library.entity.Book;
import com.library.repository.BookRepository;
import com.library.service.BookService;
import org.springframework.stereotype.Service;


import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    private final BookRepository bookRepository;

    public BookServiceImpl(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }


    @Override
    public Book save(Book book) {
        return bookRepository.save(book);
    }

    @Override
    public Book findById(Long id) {
        return bookRepository.findById(id);
    }

    @Override
    public Book findByIdFetchCoAuthors(Long id) {
        return bookRepository.findByIdFetchCoAuthors(id);
    }

    @Override
    public List<Book> findAll() {
        return bookRepository.findAll();
    }

    @Override
    public Book remove(Long id) {
        return bookRepository.remove(id);
    }

    @Override
    public Optional<Double> averageTimeOfReadingBook(String title) {
        return bookRepository.averageTimeOfReadingBook(title);
    }

    @Override
    public Optional<List<Book>> findBooksByAuthorOrTitle(String str) {
        return bookRepository.findBooksByAuthorOrTitle(str);
    }

    @Override
    public List<Book> findMostPopularBooks(LocalDateTime from, LocalDateTime to) {
        return bookRepository.findMostPopularBooks(from, to);
    }

    @Override
    public List<Book> findMostUnpopularBooks(LocalDateTime from, LocalDateTime to) {
        return bookRepository.findMostUnpopularBooks(from, to);
    }

}
