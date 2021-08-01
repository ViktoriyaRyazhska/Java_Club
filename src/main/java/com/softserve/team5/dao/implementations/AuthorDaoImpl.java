package com.softserve.team5.dao.implementations;

import java.util.List;

import org.hibernate.SessionFactory;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.softserve.team5.dao.interfaces.AuthorDao;
import com.softserve.team5.entity.Author;
import com.softserve.team5.entity.Book;

@Repository
@EnableTransactionManagement
@Transactional
public class AuthorDaoImpl implements AuthorDao {

	private SessionFactory sessionFactory;

	public AuthorDaoImpl(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	public void create(Author entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(Author entity) {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(Long id) {
		// TODO Auto-generated method stub

	}

	@Override
	public Author getById(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Book> getBooksByAuthor(Author author) {
		// TODO Auto-generated method stub
		return null;
	}

}
