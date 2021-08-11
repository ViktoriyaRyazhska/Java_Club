package com.softserve.team5.dao.interfaces;

import com.softserve.team5.entity.Book;
import com.softserve.team5.entity.Journal;
import com.softserve.team5.entity.JournalStatus;
import com.softserve.team5.entity.User;

import java.time.LocalDate;
import java.util.List;
import java.util.Map;

public interface JournalDao {
	void addRequest(User user, Book book);
	
	void giveBook(Long id);
	
	void returnBook(Long id);
	
	Journal getById(Long id);
	
	List<Journal> getAllRequests();
		
	Map<Long, Long> booksInSelectedPeriod(LocalDate periodStart, LocalDate periodEnd);

	List<Book> getBooksByUser(Long userId, JournalStatus status);

	List<Journal> usersWhoDidNoReturnBookOnTime();
	
	long numberOfBookGivedInPeriod(LocalDate start, LocalDate end);
	
	double averengeNumberOfRequestsInPeriod(LocalDate start, LocalDate end);
}
