package com.softserve.team5.service.interfaces;

import java.util.List;

import com.softserve.team5.entity.Book;

public interface BookService extends DefaultServiceOperations<Book>{
	List<Book> getAllBooks();

	boolean checkIsAvailable(Long id);

	Book findByTitle(String title);

	void deleteSomeCopies(Long id, int quantity);

	void deleteOneCopy(Long id, int quantity);
}
