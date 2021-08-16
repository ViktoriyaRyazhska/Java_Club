package ua.ilkanych.libraryproject.service.impl;

import org.springframework.stereotype.Service;
import ua.ilkanych.libraryproject.dao.AuthorDao;
import ua.ilkanych.libraryproject.model.Author;
import ua.ilkanych.libraryproject.model.Book;
import ua.ilkanych.libraryproject.service.AuthorService;

import java.util.List;

@Service
public class AuthorServiceImpl implements AuthorService {

    private final AuthorDao authorDao;

    public AuthorServiceImpl(AuthorDao authorDao) {
        this.authorDao = authorDao;
    }

    @Override
    public Author create(Author author) {
        return authorDao.create(author);
    }

    @Override
    public Author delete(Long id) {
        return authorDao.delete(id);
    }

    @Override
    public Author getById(Long id) {
        return authorDao.getById(id);
    }

    @Override
    public List<Author> getAll() {
        return authorDao.getAll();
    }

    @Override
    public Author getAuthorBooks(Long id) {
        return authorDao.getAuthorBooks(id);
    }
}
