package com.softserve.team5.dao.implementations;

import java.util.List;

import javax.persistence.NoResultException;

import com.softserve.team5.dao.interfaces.BookDao;
import com.softserve.team5.entity.Author;
import com.softserve.team5.entity.Book;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

@Repository
@EnableTransactionManagement
@Transactional
public class BookDaoImpl implements BookDao {

	private final SessionFactory sessionFactory;

	@Autowired
	public BookDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void create(Book book) {
		Session session = sessionFactory.getCurrentSession();
		session.persist(book);
	}

	@Override
	public void update(Book book, Long id) {
		Session session = sessionFactory.getCurrentSession();
		session.update(book);
	}

	@Override
	public void delete(Long id) {
		Book book = getById(id);
		if (book != null) {
			book.setIsAvailable(false);
			book.setCopies(0L);
		}
	}

	@Override
	public Book getById(Long id) {
		Session session = sessionFactory.getCurrentSession();
		return session.get(Book.class, id);
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Book> getAllEntities() {
		Session session = sessionFactory.getCurrentSession();
		return (List<Book>) session.createQuery("from Book").list();
	}

	@Override
	public boolean checkIsAvailable(Long id) {
		return false;
	}

	@Override
	public Book findByTitle(String title) {
		Session session = sessionFactory.getCurrentSession();
		try {
			return session.createQuery("select b from Book b where b.title = :title", Book.class)
					.setParameter("title", title).getSingleResult();
		} catch (NoResultException ex) {
			return null;
		}
	}

	@Override
	public void deleteSomeCopies(Long id, int quantity) {

	}

	@Override
	public void deleteOneCopy(Long id, int quantity) {

	}

	@Override
	public Author getMainAuthorByBookId(Long bookId) {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery(
				"select a from Author a inner join BookAuthor ba on a.id = ba.authorID.id where (ba.bookID.id = :bookId) and (ba.authorRole = true)",
				Author.class).setParameter("bookId", bookId).getSingleResult();
	}

	@Override
	public List<Author> getCoAuthorsByBookId(Long bookId) {
		Session session = sessionFactory.getCurrentSession();
		return session.createQuery(
				"select a from Author a inner join BookAuthor ba on a.id = ba.authorID.id where (ba.bookID.id = :bookId) and (ba.authorRole = false)",
				Author.class).setParameter("bookId", bookId).getResultList();
	}

}
