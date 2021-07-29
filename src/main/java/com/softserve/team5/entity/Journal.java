package com.softserve.team5.entity;

import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name = "journal")
public class Journal {

    @Column(nullable = false)
    @GeneratedValue (strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "USER_ID",nullable = false)
    private Integer userID;

    @Column(name = "BOOK_ID",nullable = false)
    private Integer bookID;

    @Column(name = "DATE_OF_RENT",nullable = false)
    private Date rentDate;

    @Column(name = "EXPECTED_RETURN_DATE",nullable = false)
    private Date expectedReturnDate;

    @Column(name = "BOOK_RETURN_DATE",nullable = false)
    private Date DateReturnExpired;

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
