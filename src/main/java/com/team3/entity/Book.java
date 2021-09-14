package com.team3.entity;

import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.*;
import java.util.Objects;
import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "book")
public class Book {

    @Id
    @Column(name = "book_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookId;

    @Column(name = "title")
    private String title;

    @Column(name = "description")
    private String description;

    @Column(name = "genre")
    private String genre;

    @Column(name = "count")
    private int count;

    public Book(String title, String description, String genre, int count) {
        this.title = title;
        this.description = description;
        this.genre = genre;
        this.count = count;
    }

    public Book(String title, String description, String genre, int count, Set<Author> authors) {
        this.title = title;
        this.description = description;
        this.genre = genre;
        this.count = count;
        this.authors = authors;
    }

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(name="books_authors",
            joinColumns =@JoinColumn(name = "book_id"),
    inverseJoinColumns = @JoinColumn(name = "author_id"))
    private Set<Author> authors;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        Book book = (Book) o;
        return Objects.equals(bookId, book.bookId);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}