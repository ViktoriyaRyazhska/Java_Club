package com.softserve.team5.service.services;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.softserve.team5.dao.interfaces.BookDao;
import com.softserve.team5.dao.interfaces.JournalDao;
import com.softserve.team5.entity.Book;
import com.softserve.team5.entity.Journal;
import com.softserve.team5.entity.JournalStatus;
import com.softserve.team5.entity.User;
import com.softserve.team5.service.interfaces.JournalService;


@Service
@EnableTransactionManagement
@Transactional
public class JournalServiceImpl implements JournalService {

	private JournalDao journalDao;
	private BookDao bookDao;

	@Autowired
	public JournalServiceImpl(JournalDao journalDao, BookDao bookDao) {
		this.journalDao = journalDao;
		this.bookDao = bookDao;
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
	public Map<Book, Long> getMostPopularBooks(LocalDate periodStart, LocalDate periodEnd) {
		Map<Long, Long> map = journalDao.booksInSelectedPeriod(periodStart, periodEnd);
		Map<Book, Long> resultMap = new HashMap<>();
		Long maxNumbeOfRequests = map.entrySet().stream()
				.max((Map.Entry<Long, Long> e1, Map.Entry<Long, Long> e2) -> e1.getValue().compareTo(e2.getValue()))
				.get().getValue();
		map.entrySet().stream().filter((x) -> x.getValue().compareTo(maxNumbeOfRequests) == 0)
				.forEach((x) -> resultMap.put(bookDao.getById(x.getKey()), x.getValue()));
		return resultMap;
	}

	@Override
	public Map<Book, Long> getMostUnPopularBooks(LocalDate periodStart, LocalDate periodEnd) {
		Map<Long, Long> map = journalDao.booksInSelectedPeriod(periodStart, periodEnd);
		Map<Book, Long> resultMap = new HashMap<>();
		Long minNumbeOfRequests = map.entrySet().stream()
				.min((Map.Entry<Long, Long> e1, Map.Entry<Long, Long> e2) -> e1.getValue().compareTo(e2.getValue()))
				.get().getValue();
		map.entrySet().stream().filter((x) -> x.getValue().compareTo(minNumbeOfRequests) == 0)
				.forEach((x) -> resultMap.put(bookDao.getById(x.getKey()), x.getValue()));
		return resultMap;
	}

	@Override
	public List<Book> getBooksByUser(Long userId, JournalStatus status) {
		return journalDao.getBooksByUser(userId, status);
	}

	@Override
	public double averengeNumberOfRequestsInPeriod(LocalDate start, LocalDate end) {
		double requestsInPeriod = journalDao.averengeNumberOfRequestsInPeriod(start, end);
		double daysInPeriod = ChronoUnit.DAYS.between(start, end);
		return requestsInPeriod/daysInPeriod;
	}

	@Override
	public List<Journal> usersWhoDidNoReturnBookOnTime() {
		return journalDao.usersWhoDidNoReturnBookOnTime();
	}

	@Override
	public long numberOfBookGivedInPeriod(LocalDate start, LocalDate end) {
		return journalDao.numberOfBookGivedInPeriod(start, end);
	}

}
