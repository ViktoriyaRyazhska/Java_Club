package com.team4.thebest.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

import lombok.*;
import org.hibernate.validator.constraints.NotEmpty;

import java.time.LocalDateTime;

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
    @NotEmpty(message = "Required")
    private String name;

    @Column(name = "author")
    @NotEmpty(message = "Required")
    private String author;

    @Column(name = "co_author")
    private String coAuthor;

    @Column
    @NotNull(message = "Required")
    private Integer copies;

    @Column(name = "published")
    private LocalDateTime published;
}
