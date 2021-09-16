package com.team3.entity;


import lombok.*;
import org.hibernate.Hibernate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Getter
@Setter
@ToString
@NoArgsConstructor
@Table(name = "books_authors")
public class BookAuthor {

    @Id
    @Column(name = "book_id")
    int bookId;

    @Column(name = "author_id")
    int authorId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || Hibernate.getClass(this) != Hibernate.getClass(o)) return false;
        BookAuthor that = (BookAuthor) o;
        return Objects.equals(bookId, that.bookId);
    }

    @Override
    public int hashCode() {
        return 0;
    }
}
