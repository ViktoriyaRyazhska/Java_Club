package com.team3.dao.Impl;

import com.team3.dao.BookDao;
import com.team3.entity.Author;
import com.team3.entity.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class BookDaoImpl implements BookDao {
    SessionFactory sessionFactory;

    @Autowired
    public BookDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Book save(Book book) {
        Session session = sessionFactory.getCurrentSession();
        session.save(book);
        return book;
    }

    @Override
    public Book findById(int id) {
        return null;
    }

    @Override
    public Book remove(int id) {
        return null;
    }

    @Override
    public List<Book> findAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("select a from Book a").getResultList();
    }
}
