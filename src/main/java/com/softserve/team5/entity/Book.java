package com.softserve.team5.entity;

import java.time.LocalTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "TITLE", nullable = false)
	private String title;

	@Column(name = "COPIES", nullable = false)
	private Long copies;

	@Column(name = "AVERENGE_READING_TIME", nullable = false)
	private LocalTime averengeReadingTime;

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

	public LocalTime getAverangeReadingTime() {
		return averengeReadingTime;
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

	public void setAverangeReadingTime(LocalTime averengeReadingTime) {
		this.averengeReadingTime = averengeReadingTime;
	}

}
