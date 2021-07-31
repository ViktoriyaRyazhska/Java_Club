package com.library.service;

import com.library.entity.Author;

import java.util.List;

public interface AuthorService {

    Author save(Author author);

    Author findById(Long id);

    List<Author> findAll();

    Author remove(Long id);

}
