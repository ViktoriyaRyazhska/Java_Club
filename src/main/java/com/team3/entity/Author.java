package com.team3.entity;


import lombok.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Data
@NoArgsConstructor
@Table(name = "author")
public class Author {


    @Id
    @Column(name = "author_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @Column(name = "name")
    private String name;

    @Column(name = "surname")
    private String surname;

//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "author")
//    private List<Book> books = new ArrayList<>();

    //    public void addBook(Book book){
//        book.setAuthor(this);
//        books.add(book);
//    }
//        @Transient
//        @ManyToMany(mappedBy = "authors")
//        private Set<Book> books = new HashSet<>();
    @Transient
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "author")
    Set<BookAuthor> books = new HashSet<>();
}
