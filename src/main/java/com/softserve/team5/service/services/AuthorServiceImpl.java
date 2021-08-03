package com.softserve.team5.service.services;

import com.softserve.team5.dao.interfaces.AuthorDao;
import com.softserve.team5.entity.Author;
import com.softserve.team5.entity.Book;
import com.softserve.team5.service.interfaces.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
@EnableTransactionManagement
public class AuthorServiceImpl implements AuthorService {

	private final AuthorDao authorDao;

	@Autowired
	public AuthorServiceImpl(AuthorDao authorDao) {
		this.authorDao = authorDao;
	}

	@Override
	public void create(Author entity) {
		authorDao.create(entity);
	}

	@Override
	public void update(Author entity) {
		authorDao.update(entity);
	}

	@Override
	public void delete(Long id) {
		authorDao.delete(id);
	}

	@Override
	public Author getById(Long id) {
		return authorDao.getById(id);
	}

	@Override
	public List<Book> getBooksByAuthor(Long author_id) {
		return authorDao.getBooksByAuthor(author_id);
	}

	@Override
	public List<Author> getAllEntities(){
		return authorDao.getAllEntities();
	}
}
