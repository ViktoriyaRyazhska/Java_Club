package com.team4.thebest.dao.impl;

import com.team4.thebest.dao.BookDao;
import com.team4.thebest.models.Book;
import lombok.AllArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import java.util.List;

@Repository
@AllArgsConstructor
public class BookDaoImpl implements BookDao {

    private SessionFactory sessionFactory;

    @Override
    public void save(Book book) {
        final Session session = sessionFactory.getCurrentSession();
        final Transaction transaction = session.beginTransaction();
        session.save(book);
        transaction.commit();
    }

    @Override
    public List<Book> list() {
        final Session session = sessionFactory.getCurrentSession();
        final Transaction transaction = session.beginTransaction();

        try {
            @SuppressWarnings("unchecked")
            final TypedQuery<Book> query = session.createQuery("from Book");
            return query.getResultList();
        } finally {
            transaction.commit();
        }
    }
}
