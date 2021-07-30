package com.softserve.team5.entity;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;


@Entity
@Table(name = "journal")
public class Journal {

    @Column(nullable = false)
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "user_id", nullable = false)
    private User userID;

    @ManyToOne(fetch = FetchType.LAZY, optional = false)
    @JoinColumn(name = "book_id", nullable = false)
    private Book bookID;

    @Column(name = "DATE_OF_RENT",nullable = false)
    private LocalDate rentDate;

    @Column(name = "EXPECTED_RETURN_DATE",nullable = false)
    private LocalDate expectedReturnDate;

    @Column(name = "BOOK_RETURN_DATE",nullable = false)
    private LocalDate DateReturnExpired;

    public Journal() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
