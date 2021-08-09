package com.team4.thebest.dao.impl;

import com.team4.thebest.dao.BookDao;
import com.team4.thebest.models.Book;
import lombok.AllArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;

import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
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
    public List<Book> list() {
        final Session session = sessionFactory.getCurrentSession();

        @SuppressWarnings("unchecked")
        final TypedQuery<Book> query = session.createQuery("from Book");
        return query.getResultList();
    }
}
