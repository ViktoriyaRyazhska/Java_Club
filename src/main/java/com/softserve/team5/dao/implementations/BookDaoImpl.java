package com.softserve.team5.dao.implementations;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.softserve.team5.dao.interfaces.BookDao;
import com.softserve.team5.entity.Book;

@Repository
@EnableTransactionManagement
@Transactional
public class BookDaoImpl implements BookDao {

	private SessionFactory sessionFactory;

	public BookDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void create(Book book) {
		Session session = sessionFactory.getCurrentSession();
		session.persist(book);
		
	}

	@Override
	public void update(Book book) {
		Session session = sessionFactory.getCurrentSession();
		session.update(book);
	}

	@Override
	public void delete(Long id) {
		Session session = sessionFactory.getCurrentSession();
		Book book = (Book) session.load(Book.class, new Long(id));
		if(book!=null) {
			session.delete(book);
		}
	}

	@Override
	public Book getById(Long id) {
		Session session = sessionFactory.getCurrentSession();
		Book book = (Book) session.load(Book.class, new Long(id));
		return book;
	}

	@Override
	@SuppressWarnings("unchecked")
	public List<Book> getAllBooks() {
		Session session = sessionFactory.getCurrentSession();
		List<Book> bookList = session.createQuery("from Book").list();
		return bookList;
	}

	@Override
	public boolean checkIsAvailable(Long id) {
		return false;
	}

	@Override
	public Book findByTitle(String title) {
		return null;
	}

	@Override
	public void deleteSomeCopies(Long id, int quantity) {

	}

	@Override
	public void deleteOneCopy(Long id, int quantity) {

	}

}
