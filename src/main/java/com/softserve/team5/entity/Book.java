package com.softserve.team5.entity;

import javax.persistence.*;

@Entity
@Table(name = "bppk")
public class Book {
	
    @Column(nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private Integer copies;

    @Column(name = "AVERAGE_READING_TIME",nullable = false)
    private Integer averageReadingTime;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}
