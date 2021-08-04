package com.softserve.team5.dto;

public class BookDto {
    private String title;
    private Long copies;
    private Long averageReadingHours;
    private Long author_id;

    public BookDto() {
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setCopies(Long copies) {
        this.copies = copies;
    }

    public void setAverageReadingHours(Long averageReadingHours) {
        this.averageReadingHours = averageReadingHours;
    }

    public void setAuthor_id(Long author_id) {
        this.author_id = author_id;
    }

    public String getTitle() {
        return title;
    }

    public Long getCopies() {
        return copies;
    }

    public Long getAverageReadingHours() {
        return averageReadingHours;
    }

    public Long getAuthor_id() {
        return author_id;
    }
}
