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
    public void update(BookAuthor entity) {

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
}
