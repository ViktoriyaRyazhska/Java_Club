package com.softserve.team5.entity;


import org.hibernate.annotations.Table;

import javax.persistence.*;
import java.util.Date;

@Entity
public class User {
    @Column
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    private Role role;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private String password;

    @Column
    private Date birthday;

    @Column
    private Date registrationDate;

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    public Long getId() {
        return id;
    }
}

