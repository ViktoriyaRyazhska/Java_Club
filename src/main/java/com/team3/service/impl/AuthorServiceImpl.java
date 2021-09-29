package com.team3.service.impl;

import com.team3.dao.AuthorDao;
import com.team3.entity.Author;
import com.team3.service.AuthorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Transactional
@Service
public class AuthorServiceImpl implements AuthorsService {

    AuthorDao authorDao;

    @Autowired
    public AuthorServiceImpl(AuthorDao authorDao) {
        this.authorDao = authorDao;
    }


    @Override
    public Author save(Author author) {
        return authorDao.save(author);
    }

    @Override
    public Author findById(int id) {
        return authorDao.findById(id);
    }

    @Override
    public Author remove(int id) {
        return authorDao.remove(id);
    }

    @Override
    public List<Author> findAll() {
        return authorDao.findAll();
    }
}
