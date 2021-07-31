package com.team4.thebest.models;

import javax.persistence.*;
import javax.validation.constraints.Size;

import lombok.Data;
import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "TBL_USERS")
@Data
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_ID")
    private Long id;

    @Column(name = "USER_NAME")
    @Size(max = 20, min = 3, message = "{user.name.invalid}")
    @NotEmpty(message = "Please enter your name")
    private String name;

    @Column(name = "USER_EMAIL", unique = true)
    @Email(message = "{user.email.invalid}")
    @NotEmpty(message = "Please enter your email")
    private String email;
}
