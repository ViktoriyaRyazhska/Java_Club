package com.team4.thebest.dao.impl;

import com.team4.thebest.dao.BookDao;
import com.team4.thebest.models.Book;
import lombok.AllArgsConstructor;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.TypedQuery;
import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

import static java.util.Optional.ofNullable;

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

        @SuppressWarnings("unchecked") final TypedQuery<Book> query = session.createQuery("from Book");
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

    @Override
    public Integer getCountOfCopiesByBookId(Long id) {
        Session session = sessionFactory.getCurrentSession();

        return session.createQuery("select b.copies from Book b where b.id=:bookId", Integer.class)
                .setParameter("bookId", id)
                .getSingleResult();
    }

    @Override
    public Integer amountOfReaders(Long id) {
        Session session = sessionFactory.getCurrentSession();

        return session.createQuery("select count(distinct r.user.id) " +
                        "from RentInfo r where r.book.id=:id and r.returnDate is not null", Long.class)
                .setParameter("id", id)
                .getSingleResult()
                .intValue();
    }

    @Override
    public Integer amountOfUsersReadingBookNow(Long id) {
        Session session = sessionFactory.getCurrentSession();

        return session.createQuery("select count(distinct r.user.id) " +
                        "from RentInfo r where r.book.id=:id and r.returnDate is null", Long.class)
                .setParameter("id", id)
                .getSingleResult()
                .intValue();
    }

    @Override
    public Optional<Long> sumOfBookReadingTime(Long id) {
        Session session = sessionFactory.getCurrentSession();

        return ofNullable(session.createQuery(
                        "select round(sum(datediff(r.returnDate, r.rentDate))) " +
                                "from RentInfo r where r.book.id=:id and r.returnDate is not null", Long.class)
                .setParameter("id", id)
                .getSingleResult());
    }

    @Override
    public Book getTheMostPopular() {
        Session session = sessionFactory.getCurrentSession();

        return session.createQuery("select r.book from RentInfo r group by r.book.id order by count(r.book.id) desc", Book.class)
                .setMaxResults(1)
                .getSingleResult();
    }

    @Override
    public Book getTheMostUnpopular() {
        Session session = sessionFactory.getCurrentSession();

        return session.createQuery("select r.book from RentInfo r group by r.book.id order by count(r.book.id)", Book.class)
                .setMaxResults(1)
                .getSingleResult();
    }

    @Override
    public List<Book> timeSearch(LocalDateTime from, LocalDateTime to) {
        Session session = sessionFactory.getCurrentSession();

        return session.createQuery("select b from Book b where b.published between :from and :to", Book.class)
                .setParameter("from", from)
                .setParameter("to", to)
                .getResultList();
    }
}
