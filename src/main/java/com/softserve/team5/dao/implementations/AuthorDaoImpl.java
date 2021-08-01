package com.softserve.team5.dao.implementations;

import com.softserve.team5.dao.interfaces.AuthorDao;
import com.softserve.team5.entity.Author;
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
public class AuthorDaoImpl implements AuthorDao {

    private final SessionFactory sessionFactory;

    @Autowired
    public AuthorDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public void create(Author author) {
        Session session = sessionFactory.getCurrentSession();
        session.persist(author);
    }

    @Override
    public void update(Author author) {
        // TODO Auto-generated method stub

    }

    @Override
    public void delete(Long id) {
        Session session = sessionFactory.getCurrentSession();
        Author author = getById(id);
        if (author != null) session.delete(author);
    }

    @Override
    public Author getById(Long id) {
        Session session = sessionFactory.getCurrentSession();
        return session.get(Author.class, id);
    }

    @Override
    public List<Book> getBooksByAuthor(Author author) {
        // TODO Auto-generated method stub
        return null;
    }

}
