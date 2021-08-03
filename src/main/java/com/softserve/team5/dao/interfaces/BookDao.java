package com.softserve.team5.dao.interfaces;

import java.util.List;

import com.softserve.team5.entity.Book;

public interface BookDao extends DefaultDaoOpearations<Book> {
	boolean checkIsAvailable(Long id);

	Book findByTitle(String title);

	void deleteSomeCopies(Long id, int quantity);

	void deleteOneCopy(Long id, int quantity);

}
