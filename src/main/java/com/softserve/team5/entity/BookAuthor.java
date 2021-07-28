package com.softserve.team5.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book_author")
public class BookAuthor {

    @Column(name = "AUTHOR_ID",nullable = false)
    private Long authorID;

    @Column(name = "BOOK_ID",nullable = false)
    private Long bookID;

    @Column(name = "AUTHOR_ROLE",nullable = false)
    private Boolean authorRole;

    public void setAuthorID(Long authorID) {
        this.authorID = authorID;
    }

    @Id
    public Long getAuthorID() {
        return authorID;
    }

    @Id
    public Long getBookID() {
        return bookID;
    }

    public void setBookID(Long bookID) {
        this.bookID = bookID;
    }
}
