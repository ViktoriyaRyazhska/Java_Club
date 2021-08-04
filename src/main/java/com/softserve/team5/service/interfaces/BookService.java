package com.softserve.team5.service.interfaces;

import com.softserve.team5.dto.BookDto;
import com.softserve.team5.entity.Book;

import java.util.List;

public interface BookService extends DefaultServiceOperations<Book>{

	List<Book> getAllBooks();

	void createFromDto(BookDto bookDto);


	boolean checkIsAvailable(Long id);

	Book findByTitle(String title);

	void deleteSomeCopies(Long id, int quantity);

	void deleteOneCopy(Long id, int quantity);
}
