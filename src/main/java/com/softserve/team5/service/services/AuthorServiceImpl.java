package com.softserve.team5.service.services;

import com.softserve.team5.dao.interfaces.AuthorDao;
import com.softserve.team5.entity.Author;
import com.softserve.team5.entity.Book;
import com.softserve.team5.service.interfaces.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public class AuthorServiceImpl implements AuthorService {

    private final AuthorDao authorDao;

    @Autowired
    public AuthorServiceImpl(AuthorDao authorDao){this.authorDao = authorDao;}

    @Override
    public void create(Author entity) {
        authorDao.create(entity);
    }

    @Override
    public void update(Author entity) {
        authorDao.update(entity);
    }

    @Override
    @Transactional
    public void delete(Long id) {
        authorDao.delete(id);
    }

    @Override
    public Author getById(Long id) {
        return authorDao.getById(id);
    }

    @Override
    public List<Book> findBooksByAuthor(Author author) {

        long authorId = author.getId();
        //find id in table and after add to list
        return null;
    }
}
