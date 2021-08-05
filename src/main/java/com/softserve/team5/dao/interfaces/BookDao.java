package com.softserve.team5.dao.interfaces;

import com.softserve.team5.entity.Author;
import com.softserve.team5.entity.Book;

public interface BookDao extends DefaultDaoOpearations<Book> {
	boolean checkIsAvailable(Long id);

	Book findByTitle(String title);

	void deleteSomeCopies(Long id, int quantity);

	void deleteOneCopy(Long id, int quantity);

	Author getMainAuthorByBookId(Long bookId);

}
