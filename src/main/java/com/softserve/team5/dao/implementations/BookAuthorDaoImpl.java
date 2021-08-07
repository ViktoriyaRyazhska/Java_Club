package com.softserve.team5.dao.implementations;

import com.softserve.team5.dao.interfaces.BookAuthorDao;
import com.softserve.team5.entity.BookAuthor;
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
public class BookAuthorDaoImpl implements BookAuthorDao {

    private final SessionFactory sessionFactory;

    @Autowired
    public BookAuthorDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    public void create(BookAuthor bookAuthor) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(bookAuthor);
    }

    @Override
    public void update(BookAuthor entity, Long id) {
    }

    @Override
    public void delete(Long id) {
    }

    @Override
    public BookAuthor getById(Long id) {
        return null;
    }

    @Override
    public List<BookAuthor> getAllEntities() {
        return null;
    }

    @Override
    public Boolean isAuthor(Long author_id, Long book_id) {
        Session session = sessionFactory.getCurrentSession();
        try {
            BookAuthor ba = session.createQuery(
                    "select ba from BookAuthor ba where (ba.bookID.id = :book_id) and (ba.authorID.id = :author_id)"
                    , BookAuthor.class)
                    .setParameter("book_id", book_id)
                    .setParameter("author_id", author_id)
                    .getSingleResult();
        } catch (Exception e) {
            return false;
        }
        return true;
    }

    @Override
    public void deleteAuthor(Long book_id, Long author_id) {
        Session session = sessionFactory.getCurrentSession();
        BookAuthor ba = session.createQuery(
                "select ba from BookAuthor ba where (ba.bookID.id = :book_id) and (ba.authorID.id = :author_id)"
                , BookAuthor.class)
                .setParameter("book_id", book_id)
                .setParameter("author_id", author_id)
                .getSingleResult();
        if (ba != null) session.delete(ba);
    }
}
