package com.softserve.team5.dao.interfaces;

import com.softserve.team5.entity.Book;
import com.softserve.team5.entity.Journal;
import com.softserve.team5.entity.JournalStatus;
import com.softserve.team5.entity.User;

import java.time.LocalDate;
import java.util.List;

public interface JournalDao {
	void addRequest(User user, Book book);
	
	void giveBook(Long id);
	
	void returnBook(Long id);
	
	Journal getById(Long id);
	
	List<Journal> getAllRequests();

	List<Book> getMostPopularBooks(LocalDate periodStart, LocalDate periodEnd);

	List<Book> getMostUnPopularBooks(LocalDate periodStart, LocalDate periodEnd);
	
	List<Book> getBooksByUser(Long userId, JournalStatus status);

	double averengeNumberOfRequestsInPeriod(LocalDate start, LocalDate end);
	
	List<User> usersWhoDidNoReturnBookOnTime();
}
