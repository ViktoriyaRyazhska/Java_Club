package com.softserve.team5.service.services;

import com.softserve.team5.dao.interfaces.BookDao;
import com.softserve.team5.entity.Book;
import com.softserve.team5.service.interfaces.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@EnableTransactionManagement
public class BookServiceImpl implements BookService{

    private final BookDao bookDao;

    @Autowired
    public BookServiceImpl(BookDao bookDao) {
        this.bookDao = bookDao;
    }

	@Override
	@Transactional
	public void create(Book entity) {
		bookDao.create(entity);
		
	}

	@Override
	@Transactional
	public void update(Book entity) {
		bookDao.update(entity);
	}

	@Override
	@Transactional
	public void delete(Long id) {
		bookDao.delete(id);
	}

	@Override
	@Transactional
	public Book getById(Long id) {
		return bookDao.getById(id);
	}

	@Override
	@Transactional
	public List<Book> getAllBooks() {
		return bookDao.getAllBooks();
	}

	@Override
	@Transactional
	public boolean checkIsAvailable(Long id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	@Transactional
	public Book findByTitle(String title) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	@Transactional
	public void deleteSomeCopies(Long id, int quantity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	@Transactional
	public void deleteOneCopy(Long id, int quantity) {
		// TODO Auto-generated method stub
		
	}

    
}
