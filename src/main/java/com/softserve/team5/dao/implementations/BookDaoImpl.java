package com.softserve.team5.dao.implementations;

import com.softserve.team5.dao.interfaces.BookDao;
import com.softserve.team5.entity.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@EnableTransactionManagement
@Transactional
public class BookDaoImpl implements BookDao {

    private final SessionFactory sessionFactory;

    @Autowired
    public BookDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void create(Book book) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(book);
    }

    @Override
    public void update(Book book) {
        Session session = sessionFactory.getCurrentSession();
        session.update(book);
    }

    @Override
    public void delete(Long id) {
        Session session = sessionFactory.getCurrentSession();
        Book book = getById(id);
        if (book != null) session.delete(book);
    }

    @Override
    public Book getById(Long id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Book.class, id);
    }

    @Override
    public List<Book> getAllBooks() {
        Session session = sessionFactory.getCurrentSession();
        return (List<Book>) session.createQuery("from Book").list();
    }

    @Override
    public boolean checkIsAvailable(Long id) {
        return false;
    }

    @Override
    public Book findByTitle(String title) {
        Session session = sessionFactory.getCurrentSession();
        return session.createQuery(
                "select b from Book b where b.title = :title"
                , Book.class)
                .setParameter("title", title)
                .getSingleResult();
    }

    @Override
    public void deleteSomeCopies(Long id, int quantity) {

    }

    @Override
    public void deleteOneCopy(Long id, int quantity) {

    }

}
