package com.team3.entity;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@Table(name = "book")
public class Book {

    @Id
    @Column(name = "book_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int book_id;

    @Column(name = "authorId")
    private int author_id;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "genre")
    private String genre;

    @Column(name = "count")
    private int count;


}