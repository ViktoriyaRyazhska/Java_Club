package com.softserve.team5.dao.interfaces;

import java.time.LocalDate;
import java.util.List;

import com.softserve.team5.entity.Book;
import com.softserve.team5.entity.Journal;
import com.softserve.team5.entity.User;

public interface JournalDao {
	void addRequest(User user, Book book);
	
	void giveBook(Long id);
	
	void returnBook(Long id);
	
	Journal getById(Long id);
	
	List<Journal> getAllRequests();

	List<Book> getMostPopularBooks(LocalDate periodStart, LocalDate periodEnd);

	List<Book> getMostUnPopularBooks(LocalDate periodStart, LocalDate periodEnd);
	
	List<Book> getReadedBooksByUser(Long userId);
	
	List<Book> getBooksReadingNowByUser(int userId);
	
	double averengeNumberOfRequestsInPeriod(LocalDate start, LocalDate end);
	
	List<User> usersWhoDidNoReturnBookOnTime();
}
