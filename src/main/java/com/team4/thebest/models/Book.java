package com.team4.thebest.models;

import javax.persistence.*;

import lombok.*;
import org.hibernate.validator.constraints.NotEmpty;

@Entity
@Table(name = "books")
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    @NotEmpty(message = "Please enter book name")
    private String name;

    @Column(name = "author")
    @NotEmpty(message = "Please enter book author")
    private String author;

    @Column(name = "co_author")
    private String coAuthor;

    @Column
    private Integer copies;
}
