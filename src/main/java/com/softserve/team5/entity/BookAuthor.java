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
