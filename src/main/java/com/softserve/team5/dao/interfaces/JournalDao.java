package com.softserve.team5.dao.interfaces;

import java.time.LocalDate;
import java.util.List;

import com.softserve.team5.entity.Book;
import com.softserve.team5.entity.User;

public interface JournalDao {
	void addRecord();

	List<Book> getMostPopularBooks();

	List<Book> getMostUnPopularBooks();
	
	void setReturnDate(Long id, LocalDate date);
	
	List<Book> getReadedBooksByUser(Long userId);
	
	List<Book> getBooksReadingNowByUser(int userId);
	
	double averengeNumberOfRequestsInPeriod(LocalDate start, LocalDate end);
	
	List<User> usersWhoDidNoReturnBookOnTime();
}
