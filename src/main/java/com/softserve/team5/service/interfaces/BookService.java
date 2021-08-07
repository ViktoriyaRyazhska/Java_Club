package com.softserve.team5.service.interfaces;

import com.softserve.team5.dto.BookDto;
import com.softserve.team5.entity.Author;
import com.softserve.team5.entity.Book;

import java.util.List;

public interface BookService extends DefaultServiceOperations<Book>{

	void createFromDto(BookDto bookDto);

	void editFromDto(BookDto bookDto, Long id);

	boolean checkIsAvailable(Long id);

	Book findByTitle(String title);

	void deleteSomeCopies(Long id, int quantity);

	void deleteOneCopy(Long id, int quantity);

	Author getMainAuthorByBookId(Long bookId);

	List<Author> getCoAuthorsByBookId(Long bookId);
}
