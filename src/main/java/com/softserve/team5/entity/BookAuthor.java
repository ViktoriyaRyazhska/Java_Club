package com.softserve.team5.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "book_author")
public class BookAuthor {

	@Column(nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "AUTHOR_ID", nullable = false)
	private Long authorID;

	@Column(name = "BOOK_ID", nullable = false)
	private Long bookID;

	@Column(name = "AUTHOR_ROLE", nullable = false)
	private Boolean authorRole;

	@Id
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
