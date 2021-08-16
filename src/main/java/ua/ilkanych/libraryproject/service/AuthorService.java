package ua.ilkanych.libraryproject.service;

import ua.ilkanych.libraryproject.model.Author;

import java.util.List;

public interface AuthorService {

    Author create(Author author);

    Author delete(Long id);

    Author getById(Long id);

    List<Author> getAll();

    Author getAuthorBooks(Long id);
}
