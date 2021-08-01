package com.library.entity;

import lombok.AccessLevel;
import lombok.Data;
import lombok.Setter;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.LinkedList;
import java.util.List;

@Data
@Entity
@Table(name = "book")
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "required")
    @Column(nullable = false)
    private String title;

    @NotBlank(message = "required")
    @Column(nullable = false)
    private String country;

    @NotBlank(message = "required")
    @Column(nullable = false)
    private String genre;

    @Column
    private Integer copies;

    @ManyToOne
    @JoinColumn(name = "author_id")
    private Author mainAuthor;

    @Setter(AccessLevel.PRIVATE)
    @ManyToMany
    @JoinTable(name = "co_author_book",
            joinColumns = @JoinColumn(name = "book_id"),
            inverseJoinColumns = @JoinColumn(name = "author_id")
    )
    private List<Author> co_authors = new LinkedList<>();

}
