package com.softserve.team5.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Past;
import javax.validation.constraints.Size;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name = "user")
public class User implements Serializable {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Enumerated(EnumType.STRING)
	private Role role;

	@NotBlank(message = "Name should not be blank")
	@Size(min = 2, max = 30, message = "Name should be between 2 and 30 letters")
	@Column(nullable = false)
	private String name;

	@NotEmpty(message = "Email should not be empty")
	@Email(message = "Must be valid")
	@Column(nullable = false)
	private String email;

	@NotBlank(message = "Password should not be blank")
	@Size(min = 5, max = 30, message = "Password should be between 2 and 30 letters")
	@Column(name = "password", nullable = false)
	private String password;

	@Past(message = "Enter right birthday date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	@Column(name = "BIRTHDAY_DATE", nullable = false)
	private Date birthday;

	@Column(name = "REGISTRATION_DATE", nullable = false)
	private Date registrationDate;

	public User() {
	}

	public Long getId() {
		return id;
	}

	public Role getRole() {
		return role;
	}

	public String getName() {
		return name;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	public Date getBirthday() {
		return birthday;
	}

	public Date getRegistrationDate() {
		return registrationDate;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public void setRole(Role role) {
		this.role = role;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public void setRegistrationDate(Date registrationDate) {
		this.registrationDate = registrationDate;
	}

}
