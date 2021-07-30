package com.softserve.team5.entity;


import javax.persistence.*;
import java.time.LocalDate;
import java.util.Date;

@Entity
@Table(name = "user")
public class User {

    @Column(nullable = false)
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Role role;

    @Column(nullable = false)
    private String name;

    @Column(nullable = false)
    private String email;

    @Column(nullable = false)
    private String password;

    @Column(name = "BIRTHDAY_DATE" ,nullable = false)
    private LocalDate birthday;

    @Column(name = "REGISTRATION_DATE",nullable = false)
    private LocalDate registrationDate;

    public User() {
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}

