package ua.ilkanych.libraryproject.dao.impl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;
import ua.ilkanych.libraryproject.dao.BookDao;
import ua.ilkanych.libraryproject.model.Author;
import ua.ilkanych.libraryproject.model.Book;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;


@Transactional
@EnableTransactionManagement
@Repository
public class BookDaoImpl implements BookDao {

    private final SessionFactory sessionFactory;

    public BookDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    public Book create(Book book) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(book);

        return book;
    }

    @Transactional(readOnly = true)
    @Override
    public Book getById(Long id) {
        Session session = sessionFactory.getCurrentSession();

        return session.get(Book.class, id);
    }

    @Transactional(readOnly = true)
    @Override
    public List<Book> getAll() {
        Session session = sessionFactory.getCurrentSession();

        return session.createQuery("select b from Book b", Book.class)
                .getResultList();
    }

    @Override
    public Book delete(Long id) {
        Session session = sessionFactory.getCurrentSession();
        Book book = getById(id);
        session.remove(book);
        return book;
    }

    @Transactional(readOnly = true)
    @Override
    public Book getByTitle(String title) {
        Session session = sessionFactory.getCurrentSession();

        return session.createQuery("select b from Book b where lower(b.title) = :title", Book.class)
                .setParameter("title", title.toLowerCase())
                .getSingleResult();
    }

    @Transactional(readOnly = true)
    @Override
    public Book getBookAuthors(Long id) {
        Session session = sessionFactory.getCurrentSession();

        return session.createQuery("select b from Book b left join fetch b.author left join fetch b.authors " +
                "where b.id =:id", Book.class)
                .setParameter("id", id)
                .getSingleResult();
    }


    @Transactional(readOnly = true)
    @Override
    public List<Book> getMostPopularBooksForWeek() {
        Session session = sessionFactory.getCurrentSession();


        return session.createQuery("select o.book from Order o where o.rentDate < :date " +
                        "group by o.book.title order by count(o.book.id) desc", Book.class)
                .setParameter("date", LocalDateTime.now().minusDays(7))
                .getResultList();
    }
}
