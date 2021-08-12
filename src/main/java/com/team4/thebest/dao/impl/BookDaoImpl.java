package com.team4.thebest.dao.impl;

import com.team4.thebest.dao.BookDao;
import com.team4.thebest.models.Book;
import com.team4.thebest.models.User;
import lombok.AllArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

@Repository
@Transactional
@AllArgsConstructor
public class BookDaoImpl implements BookDao {

    private SessionFactory sessionFactory;

    @Override
    public void save(Book book) {
        final Session session = sessionFactory.getCurrentSession();
        session.save(book);
    }

    @Override
    public List<Book> getAllBooks() {
        final Session session = sessionFactory.getCurrentSession();

        @SuppressWarnings("unchecked")
        final TypedQuery<Book> query = session.createQuery("from Book");
        return query.getResultList();
    }

    @Override
    public Book getBookById(Long id) {
        Session session = sessionFactory.getCurrentSession();

        return session.createQuery("select b from Book b where b.id=:id", Book.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    @Override
    public void update(Book book) {
        Session session = sessionFactory.getCurrentSession();
        session.saveOrUpdate(book);
    }

    @Override
    public void delete(Long id) {
        Session session = sessionFactory.getCurrentSession();
        session.remove(getBookById(id));
    }

    @Override
    public List<Book> findBookByNameOrAuthor(String keyword) {
        Session session = sessionFactory.getCurrentSession();

        String searchKeyword = "%" + keyword + "%";
        return session.createQuery("select b from Book b where lower(b.author) like :keyword or " +
                "lower(b.name) like :keyword", Book.class)
                .setParameter("keyword", searchKeyword)
                .getResultList();
    }

    @Override
    public Book findById(Long id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Book.class, id);
    }
}
