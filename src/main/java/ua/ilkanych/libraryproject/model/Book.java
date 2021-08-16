package ua.ilkanych.libraryproject.model;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.PositiveOrZero;
import java.util.HashSet;
import java.util.Set;

@NoArgsConstructor
@Getter
@Setter
@Entity
@Table(name = "books")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String title;

    @Column(nullable = false)
    private String genre;

    @Column(nullable = false)
    @PositiveOrZero
    private Integer copies;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author author;

    @Setter(AccessLevel.PRIVATE)
    @ManyToMany
    @JoinTable(name = "books_co_authors",
            joinColumns = @JoinColumn(name = "books_id"),
            inverseJoinColumns = @JoinColumn(name = "authors_id")
    )
    private Set<Author> authors = new HashSet<>();
}
