package com.softserve.team5.entity;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import java.io.Serializable;

@Entity
@Table(name = "author")
public class Author implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@NotEmpty(message = "Name should not be empty")
	@Size(min = 2, max = 20, message = "Name should be between 2 and 20 letters")
	@Column(nullable = false)
	private String name;
	
	@NotEmpty(message = "Surname should not be empty")
	@Size(min = 2, max = 20, message = "Surname should be between 2 and 20 letters")
	@Column(nullable = false)
	private String surname;

	public Author() {
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}
}
