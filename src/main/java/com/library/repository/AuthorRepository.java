package com.library.repository;

import com.library.entity.Author;

import java.util.List;

public interface AuthorRepository {

    Author save(Author author);

    Author findById(Long id);

    Author findByIdFetchBooks(Long id);

    List<Author> findAll();

    Author remove(Long id);

}
