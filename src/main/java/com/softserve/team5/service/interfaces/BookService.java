package com.softserve.team5.service.interfaces;

import com.softserve.team5.dto.BookDto;
import com.softserve.team5.entity.Book;

public interface BookService extends DefaultServiceOperations<Book>{

	void createFromDto(BookDto bookDto);


	boolean checkIsAvailable(Long id);

	Book findByTitle(String title);

	void deleteSomeCopies(Long id, int quantity);

	void deleteOneCopy(Long id, int quantity);
}
