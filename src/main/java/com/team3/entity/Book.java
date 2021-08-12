package com.team3.entity;

import lombok.*;
import org.springframework.context.annotation.Lazy;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@Table(name = "book")
public class Book {

    @Id
    @Column(name = "book_id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookId;

    @Column(name = "author_id")
    private int authorId;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "genre")
    private String genre;

    @Column(name = "count")
    private int count;


//    @ManyToMany(cascade = CascadeType.ALL)
//    @JoinTable(name = "books_authors",
//            joinColumns = @JoinColumn(name = "book_id"),
//            inverseJoinColumns = @JoinColumn(name = "author_id"))
//    Set<Author> authors = new HashSet<>();

    //        @ManyToOne(optional = false)
//        @JoinColumn(name = "author_id", referencedColumnName = "author_id", insertable = false, updatable = false)
//        private Author author;
    @Transient
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "book")
    Set<BookAuthor> authors = new HashSet<>();
}