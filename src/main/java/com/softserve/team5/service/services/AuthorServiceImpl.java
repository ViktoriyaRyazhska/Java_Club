package com.softserve.team5.service.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.softserve.team5.dao.interfaces.AuthorDao;
import com.softserve.team5.entity.Author;
import com.softserve.team5.entity.Book;
import com.softserve.team5.service.interfaces.AuthorService;

@Service
@EnableTransactionManagement
public class AuthorServiceImpl implements AuthorService {

	private final AuthorDao authorDao;

	@Autowired
	public AuthorServiceImpl(AuthorDao authorDao) {
		this.authorDao = authorDao;
	}

	@Override
	@Transactional
	public void create(Author entity) {
		authorDao.create(entity);
	}

	@Override
	@Transactional
	public void update(Author entity) {
		authorDao.update(entity);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		authorDao.delete(id);
	}

	@Override
	@Transactional
	public Author getById(Long id) {
		return authorDao.getById(id);
	}

	@Override
	@Transactional
	public List<Book> findBooksByAuthor(Author author) {
		// find id in table and after add to list
		return null;
	}

	@Override
	@Transactional
	public List<Author> getAllAuthors(){
		// TODO Auto-generated method stub
		return authorDao.getAllAuthors();
	}
}
