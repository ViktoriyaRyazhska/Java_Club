package com.softserve.team5.entity;

import javax.persistence.*;

@Entity
@Table(name = "book_author")
public class BookAuthor {

	@Column(nullable = false)
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "author_id", nullable = false)
	private Author authorID;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	@JoinColumn(name = "book_id", nullable = false)
	private Book bookID;

	@Column(name = "AUTHOR_ROLE", nullable = false)
	private Boolean authorRole;

	public BookAuthor() {
	}

	@Id
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
