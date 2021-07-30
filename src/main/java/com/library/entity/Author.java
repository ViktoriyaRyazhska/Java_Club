package com.library.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import javax.persistence.*;
import java.util.LinkedList;
import java.util.List;

@Data
@Entity
@Table(name = "author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "first_name")
    private String firstName;

    @Column(name = "last_name")
    private String lastName;

//    @Setter(AccessLevel.PRIVATE)
//    @OneToMany(mappedBy = "mainAuthor")
//    private List<Book> book = new LinkedList<>();

//    @Setter(AccessLevel.PRIVATE)
//    @ManyToMany(mappedBy = "co_authors")
//    private List<Book> coAuthorBooks = new LinkedList<>();

}
