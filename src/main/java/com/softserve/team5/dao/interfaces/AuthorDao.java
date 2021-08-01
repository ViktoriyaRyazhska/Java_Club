package com.softserve.team5.dao.interfaces;

import java.util.List;

import com.softserve.team5.entity.Author;
import com.softserve.team5.entity.Book;

public interface AuthorDao extends DefaultDaoOpearations<Author>{
	List<Book> getBooksByAuthor(Author author);
}
