package com.team3.dao.Impl;

import com.team3.dao.BookDao;
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
    private final SessionFactory sessionFactory;

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
    public Book findById(Long id) {
        return sessionFactory.getCurrentSession().get(Book.class,id);
    }

    @Override
    public Book remove(int id) {
        return null;
    }

    @Override
    public List<Book> findAll() {
        return sessionFactory.getCurrentSession().createQuery("select a from Book a join fetch a.authors", Book.class).getResultList();
    }

    @Override
    public List<Book> findBooksByTitle(String title) {
        Query query = sessionFactory.getCurrentSession().createQuery("from Book where title like :title", Book.class);
        query.setParameter("title", title);
        return query.getResultList();
    }

    @Override
    public List<Book> findBooksByAuthor(String name) {
        Query q = sessionFactory.getCurrentSession().createQuery("SELECT b\n" +
                "FROM Book b\n" +
                "          JOIN fetch b.authors" +
                "          JOIN fetch BookAuthor pa ON pa.bookId = b.bookId\n" +
                "          JOIN fetch Author a ON a.id = pa.authorId\n" +
                "WHERE a.surname LIKE :name\n" +
                "   OR a.name LIKE :name " +
                "   OR b.title LIKE :name");
        // Query q = sessionFactory.getCurrentSession().createQuery("select b from Book b join fetch Author a where a.name like :name and BookAuthor.authorId =a.id ");
        //Query q = sessionFactory.getCurrentSession().createQuery("select b from book b where  b.book_id IN(select pa.book_id from books_authors as pa,author as a where pa.author_id=a.author_id && (a.name= 'emily' or a.surname='asd'))\n");
        // .createQuery("select Book.bookId,Book.title,Book.description,Book.genre,Book.count,Author.name,Author.surname FROM Author ,BookAuthor ,Book WHERE Author.id=BookAuthor.author_id AND Book.bookId=BookAuthor.book_id AND Author.name=:name ");
        q.setParameter("name", name);
        return q.getResultList();
    }
}
