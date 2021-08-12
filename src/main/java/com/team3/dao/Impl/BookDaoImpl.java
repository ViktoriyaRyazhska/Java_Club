package com.team3.dao.Impl;

import com.team3.dao.BookDao;
import com.team3.entity.Author;
import com.team3.entity.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Repository
@Transactional
public class BookDaoImpl implements BookDao {
    SessionFactory sessionFactory;

    @Autowired
    public BookDaoImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }

    @Override
    public Book save(Book book) {
        Session session = sessionFactory.getCurrentSession();
        session.save(book);
        return book;
    }

    @Override
    public Book findById(int id) {
        return null;
    }

    @Override
    public Book remove(int id) {
        return null;
    }

    @Override
    public List<Book> findAll() {
        Session session = sessionFactory.getCurrentSession();


        return session.createQuery("select a from Book a").getResultList();
    }
    @Override
    public List<Book> findBooksByTitle(String title){
        Query query= sessionFactory.getCurrentSession().createQuery("from Book where title like :title",Book.class);
        query.setParameter("title",title);
        return query.getResultList();
    }

    @Override
    public List<Book> findBooksByAuthor(String name) {
        Query q= sessionFactory.getCurrentSession()
                .createQuery("select Book.bookId,Book.title,Book.description,Book.genre,Book.count,Author.name,Author.surname FROM Author ,BookAuthor ,Book WHERE Author.id=BookAuthor.author_id AND Book.bookId=BookAuthor.book_id AND Author.name=:name ");
        q.setParameter("name",name);
        return q.getResultList();
    }
}
