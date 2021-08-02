package com.library.entity;

import lombok.*;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.util.LinkedList;
import java.util.List;

@NoArgsConstructor
@EqualsAndHashCode(of = "id")
@Getter
@Setter
@ToString(of = "id")
@Entity
@Table(name = "author")
public class Author {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "required")
    @Column(name = "first_name", nullable = false)
    private String firstName;

    @NotBlank(message = "required")
    @Column(name = "last_name", nullable = false)
    private String lastName;

    @Setter(AccessLevel.PRIVATE)
    @OneToMany(mappedBy = "mainAuthor")
    private List<Book> book = new LinkedList<>();

    @Setter(AccessLevel.PRIVATE)
    @ManyToMany(mappedBy = "co_authors")
    private List<Book> coAuthorBooks = new LinkedList<>();

}
