package com.library.repository.impl;

import com.library.entity.Book;
import com.library.repository.BookRepository;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import static java.util.Optional.ofNullable;

@Transactional
@Repository
public class BookRepositoryImpl implements BookRepository {

    private final SessionFactory sessionFactory;

    public BookRepositoryImpl(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }


    @Override
    public Book save(Book book) {
        Session session = sessionFactory.getCurrentSession();

        session.saveOrUpdate(book);

        return book;
    }

    @Override
    public Book findById(Long id) {
        Session session = sessionFactory.getCurrentSession();
        session.setDefaultReadOnly(true);

        return session.get(Book.class, id);
    }

    @Override
    public Book findByIdFetchCoAuthors(Long id) {
        Session session = sessionFactory.getCurrentSession();
        session.setDefaultReadOnly(true);

        return session
                .createQuery("select b from Book b left join fetch b.mainAuthor left join fetch b.co_authors where b.id=:id", Book.class)
                .setParameter("id", id)
                .getSingleResult();
    }

    @Override
    public List<Book> findAll() {
        Session session = sessionFactory.getCurrentSession();
        session.setDefaultReadOnly(true);

        return session.createQuery("select b from Book b where b.copies > 0", Book.class)
                .getResultList();
    }

    @Override
    public Book remove(Long id) {
        Session session = sessionFactory.getCurrentSession();

        Book book = findById(id);

        session.remove(book);

        return book;
    }

    @Override
    public Optional<Double> averageTimeOfReadingBook(String title) {
        Session session = sessionFactory.getCurrentSession();
        session.setDefaultReadOnly(true);

        return ofNullable((Double) session.createQuery("select round(avg(datediff(r.returnDate, r.rentDate)))" +
                                "from RentInfo r where r.book.title=:title")
                .setParameter("title", title)
                .getSingleResult());
    }

    @Override
    public Optional<List<Book>> findBooksByAuthorOrTitle(String str) {
        Session session = sessionFactory.getCurrentSession();
        session.setDefaultReadOnly(true);

        return ofNullable(
                session.createQuery("select b from Book b where lower(b.mainAuthor.firstName) like :str or " +
                                "lower(b.mainAuthor.lastName) like :str or lower(b.title) like :str", Book.class)
                .setParameter("str", "%" + str.toLowerCase() + "%")
                .getResultList()
        );

    }

    @Override
    public List<Book> findMostPopularBooks(LocalDateTime from, LocalDateTime to) {
        Session session = sessionFactory.getCurrentSession();
        session.setDefaultReadOnly(true);

        return session.createQuery("select r.book from RentInfo r where r.rentDate " +
                        "between :from and :to group by r.book.title order by count(r.book.id) desc", Book.class)
                .setParameter("from", from)
                .setParameter("to", to)
                .getResultList();

    }

    @Override
    public List<Book> findMostUnpopularBooks(LocalDateTime from, LocalDateTime to) {
        Session session = sessionFactory.getCurrentSession();
        session.setDefaultReadOnly(true);

        return session.createQuery("select r.book from RentInfo r where r.rentDate " +
                        "between :from and :to group by r.book.title order by count(r.book.id)", Book.class)
                .setParameter("from", from)
                .setParameter("to", to)
                .getResultList();
    }

}
