package com.softserve.team5.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "book_author")
public class BookAuthor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false,cascade=CascadeType.REMOVE)
    @JoinColumn(name = "author_id", nullable = false)
    private Author authorID;

    @ManyToOne(fetch = FetchType.LAZY, optional = false,cascade=CascadeType.REMOVE)
    @JoinColumn(name = "book_id", nullable = false)
    private Book bookID;

    @Column(name = "AUTHOR_ROLE", nullable = false)
    private Boolean authorRole;

    public BookAuthor() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Author getAuthorID() {
        return authorID;
    }

    public void setAuthorID(Author authorID) {
        this.authorID = authorID;
    }

    public Book getBookID() {
        return bookID;
    }

    public void setBookID(Book bookID) {
        this.bookID = bookID;
    }

    public Boolean getAuthorRole() {
        return authorRole;
    }

    public void setAuthorRole(Boolean authorRole) {
        this.authorRole = authorRole;
    }

    public BookAuthor(Author authorID, Book bookID, Boolean authorRole) {
        this.authorID = authorID;
        this.bookID = bookID;
        this.authorRole = authorRole;
    }
}
