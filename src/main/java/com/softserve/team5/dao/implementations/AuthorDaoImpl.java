package com.softserve.team5.dao.implementations;

import com.softserve.team5.dao.interfaces.AuthorDao;
import com.softserve.team5.entity.Author;
import com.softserve.team5.entity.Book;
import com.softserve.team5.entity.BookAuthor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
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
    public List<Book> getBooksByAuthor(Long author_id) {
        Session session = sessionFactory.getCurrentSession();
        CriteriaBuilder cb = session.getCriteriaBuilder();

        CriteriaQuery<BookAuthor> cr = cb.createQuery(BookAuthor.class);
        Root<BookAuthor> root = cr.from(BookAuthor.class);
        cr.select(root).where(root.get("authorID").in(author_id));
        Query<BookAuthor> query = session.createQuery(cr);
        List<BookAuthor> books_with_this_author = query.getResultList();

        List<Long> ids = new ArrayList<>();
        for (BookAuthor ba : books_with_this_author){
            ids.add(ba.getId());
        }

        CriteriaQuery<Book> cr2 = cb.createQuery(Book.class);
        Root<Book> root2 = cr2.from(Book.class);
        cr2.select(root2).where(root2.get("id").in(ids));
        Query<Book> query2 = session.createQuery(cr2);

        return query2.getResultList();
    }

    @Override
    public List<Author> getAllAuthors() {
        Session session = sessionFactory.getCurrentSession();
        return (List<Author>) session.createQuery("from Author").list();
    }

}
