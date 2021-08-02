package com.library.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Getter
@Setter
@ToString(of = "id")
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
    private Set<Author> co_authors = new HashSet<>();

}
