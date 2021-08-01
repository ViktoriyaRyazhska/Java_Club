package com.softserve.team5.service.interfaces;

import com.softserve.team5.entity.Author;
import com.softserve.team5.entity.Book;

import java.util.List;

public interface AuthorService extends DefaultServiceOperations<Author> {
    List<Book> findBooksByAuthor(Author author);
}
