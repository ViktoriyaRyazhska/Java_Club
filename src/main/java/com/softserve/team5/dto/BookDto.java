package com.softserve.team5.dto;

import javax.persistence.Column;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class BookDto {
	@NotBlank(message = "Title should not be empty")
	@Size(min = 2, max = 40, message = "Title should be between 2 and 40 letters")
    private String title;
	@NotNull(message="This value must not be empty")
	@Min(value = 0, message = "Copies should be greater than 0")
	@Column(name = "COPIES", nullable = false)
    private Long copies;
	@NotNull(message="This value must not be empty")
	@Min(value = 1, message = "Must be at least one hour of time")
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
