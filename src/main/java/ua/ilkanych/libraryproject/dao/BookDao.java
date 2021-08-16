package ua.ilkanych.libraryproject.dao;

import ua.ilkanych.libraryproject.model.Book;

import java.util.List;

public interface BookDao {

    Book create(Book book);

    Book getById(Long id);

    List<Book> getAll();

    Book delete(Long id);

    Book getByTitle(String title);

    Book getBookAuthors(Long id);

    List<Book> getMostPopularBooksForWeek();
}
