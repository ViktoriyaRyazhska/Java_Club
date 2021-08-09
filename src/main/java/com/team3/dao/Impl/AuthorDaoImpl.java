package com.team3.dao.Impl;

import com.team3.dao.AuthorDao;
import com.team3.entity.Author;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class AuthorDaoImpl implements AuthorDao {

    private final SessionFactory sessionFactory;

    @Autowired
    public AuthorDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Author save(Author author) {
        Session session = sessionFactory.getCurrentSession();
        session.save(author);
        return author;
    }

    @Override
    public Author findById(int id) {
        Session session = sessionFactory.getCurrentSession();
        session.setDefaultReadOnly(true);
        return session.get(Author.class, id);
    }

    @Override
    public Author remove(int id) {
        Session session = sessionFactory.getCurrentSession();
        Author author = findById(id);
        session.remove(author);
        return author;
    }

    @Override
    public List<Author> findAll() {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery("select a from Author a",Author.class).getResultList();
    }
}
