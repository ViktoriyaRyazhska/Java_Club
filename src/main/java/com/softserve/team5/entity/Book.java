package com.softserve.team5.entity;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class Book {
	
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private Long copies;

    @Column(name = "AVERAGE_READING_TIME",nullable = false)
    private Long averageReadingTime;

    public Book() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
