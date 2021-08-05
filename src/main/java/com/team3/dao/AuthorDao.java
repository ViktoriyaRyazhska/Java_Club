package com.team3.dao;

import com.team3.entity.Author;

import java.util.List;

public interface AuthorDao {

    Author save(Author author);

    Author findById(int id);

    Author remove(int id);

    List<Author> findAll();

}
