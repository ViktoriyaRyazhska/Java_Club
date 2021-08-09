package com.team3.entity;


import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.implementation.bind.annotation.IgnoreForBinding;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Data
@NoArgsConstructor
@Table (name = "books_authors")
public class BookAuthor {

    @Id
    @Column(name = "book_id")
    int book_id;

    @Column(name = "author_id")
    int author_id;

    @Column(name = "is_main")
    boolean is_main;
}
