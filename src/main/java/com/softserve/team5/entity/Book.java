package com.softserve.team5.entity;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name = "book")
public class Book implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "TITLE", nullable = false)
    private String title;

    @Column(name = "COPIES", nullable = false)
    private Long copies;

    @Column(name = "AVERENGE_READING_TIME", nullable = false)
    private Long averageReadingHours;


    public Book() {
    }

    public Long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public Long getCopies() {
        return copies;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCopies(Long copies) {
        this.copies = copies;
    }

    public Long getAverageReadingHours() {
        return averageReadingHours;
    }

    public void setAverageReadingHours(Long averageReadingHours) {
        this.averageReadingHours = averageReadingHours;
    }

    public Book(String title, Long copies, Long averageReadingHours) {
        this.title = title;
        this.copies = copies;
        this.averageReadingHours = averageReadingHours;
    }
}
