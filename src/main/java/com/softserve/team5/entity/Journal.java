package com.softserve.team5.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.time.LocalDate;

@Entity
@Table(name = "journal")
public class Journal implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "USER_ID", nullable = false)
    private User userID;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "BOOK_ID", nullable = false)
    private Book bookID;

    @Column(name = "DATE_OF_RENT", nullable = false)
    private LocalDate rentDate;

    @Column(name = "EXPECTED_RETURN_DATE", nullable = false)
    private LocalDate expectedReturnDate;

    @Column(name = "BOOK_RETURN_DATE", nullable = false)
    private LocalDate bookReturnDate;

    public Journal() {
    }

    public Long getId() {
        return id;
    }

    public User getUserID() {
        return userID;
    }

    public Book getBookID() {
        return bookID;
    }

    public LocalDate getRentDate() {
        return rentDate;
    }

    public LocalDate getExpectedReturnDate() {
        return expectedReturnDate;
    }

    public LocalDate getBookReturnDate() {
        return bookReturnDate;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setUserID(User userID) {
        this.userID = userID;
    }

    public void setBookID(Book bookID) {
        this.bookID = bookID;
    }

    public void setRentDate(LocalDate rentDate) {
        this.rentDate = rentDate;
    }

    public void setExpectedReturnDate(LocalDate expectedReturnDate) {
        this.expectedReturnDate = expectedReturnDate;
    }

    public void setBookReturnDate(LocalDate bookReturnDate) {
        this.bookReturnDate = bookReturnDate;
    }


}
