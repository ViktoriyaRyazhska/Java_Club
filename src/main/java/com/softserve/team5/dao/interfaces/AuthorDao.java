package com.softserve.team5.dao.interfaces;

import com.softserve.team5.entity.Author;
import com.softserve.team5.entity.Book;

import java.util.List;

public interface AuthorDao extends DefaultDaoOpearations<Author>{
	List<Book> getBooksByAuthor(Long author_id);
}
