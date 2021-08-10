package com.softserve.team5.service.services;

import com.softserve.team5.dao.interfaces.JournalDao;
import com.softserve.team5.entity.Book;
import com.softserve.team5.entity.Journal;
import com.softserve.team5.entity.JournalStatus;
import com.softserve.team5.entity.User;
import com.softserve.team5.service.interfaces.JournalService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import java.time.LocalDate;
import java.util.List;

@Service
@EnableTransactionManagement
@Transactional
public class JournalServiceImpl implements JournalService {

	private JournalDao journalDao;

	@Autowired
	public JournalServiceImpl(JournalDao journalDao) {
		this.journalDao = journalDao;
	}

	@Override
	public void addRequest(User user, Book book) {
		journalDao.addRequest(user, book);
	}

	@Override
	public void giveBook(Long id) {
		journalDao.giveBook(id);
	}

	@Override
	public void returnBook(Long id) {
		journalDao.returnBook(id);
	}

	@Override
	public Journal getById(Long id) {
		return journalDao.getById(id);
	}

	@Override
	public List<Journal> getAllRequests() {
		return journalDao.getAllRequests();
	}

	@Override
	public List<Book> getMostPopularBooks(LocalDate periodStart, LocalDate periodEnd) {

		return null;
	}

	@Override
	public List<Book> getMostUnPopularBooks(LocalDate periodStart, LocalDate periodEnd) {

		return null;
	}

	@Override
	public List<Book> getBooksByUser(Long userId, JournalStatus status) {
		return journalDao.getBooksByUser(userId, status);
	}

	@Override
	public double averengeNumberOfRequestsInPeriod(LocalDate start, LocalDate end) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<User> usersWhoDidNoReturnBookOnTime() {
		// TODO Auto-generated method stub
		return null;
	}

}
