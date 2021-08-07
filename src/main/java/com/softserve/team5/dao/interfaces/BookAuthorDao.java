package com.softserve.team5.dao.interfaces;

import com.softserve.team5.entity.BookAuthor;

public interface BookAuthorDao extends DefaultDaoOpearations<BookAuthor> {
    Boolean isAuthor(Long author_id, Long book_id);
    void deleteAuthor(Long book_id, Long author_id);
}
