package ua.ilkanych.libraryproject.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import ua.ilkanych.libraryproject.dao.AuthorDao;
import ua.ilkanych.libraryproject.model.Author;
import ua.ilkanych.libraryproject.model.Book;

import java.util.List;


@Transactional
@Repository
@EnableTransactionManagement
public class AuthorDaoImpl implements AuthorDao {

    private final SessionFactory sessionFactory;

    @Autowired
    public AuthorDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Author create(Author author) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(author);
        return author;
    }

    @Override
    public Author delete(Long id) {
        Session session = sessionFactory.getCurrentSession();
        Author author = getById(id);
        session.remove(author);
        return author;
    }

    @Transactional(readOnly = true)
    @Override
    public Author getById(Long id) {
        Session session = sessionFactory.getCurrentSession();

        return session.get(Author.class, id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Author> getAll() {
        Session session = sessionFactory.getCurrentSession();

        return session.createQuery("select a from Author a", Author.class)
                .getResultList();
    }

    @Transactional(readOnly = true)
    @Override
    public Author getAuthorBooks(Long id) {
        Session session = sessionFactory.getCurrentSession();

        return session.createQuery("select a from Author a left join fetch a.books left join a.coAuthorBooks where a.id=:id", Author.class)
                .setParameter("id", id)
                .getSingleResult();
    }
}
