package com.softserve.team5.entity;

import javax.persistence.*;

@Entity
@Table(name = "book")
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(nullable = false)
	private String title;

	@Column(nullable = false)
	private Long copies;

	@Column(name = "AVERAGE_READING_TIME", nullable = false)
	private Long averageReadingTime;

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

	public Long getAverageReadingTime() {
		return averageReadingTime;
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

	public void setAverageReadingTime(Long averageReadingTime) {
		this.averageReadingTime = averageReadingTime;
	}

	
}
