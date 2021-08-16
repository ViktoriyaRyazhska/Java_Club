package ua.ilkanych.libraryproject.dao;

import ua.ilkanych.libraryproject.model.Author;
import ua.ilkanych.libraryproject.model.Book;

import java.util.List;

public interface AuthorDao {

    Author create(Author author);

    Author delete(Long id);

    Author getById(Long id);

    List<Author> getAll();

    Author getAuthorBooks(Long id);
}
