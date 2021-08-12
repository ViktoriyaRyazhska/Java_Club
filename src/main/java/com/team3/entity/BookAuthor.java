package com.team3.entity;


import lombok.Data;
import lombok.NoArgsConstructor;
import net.bytebuddy.implementation.bind.annotation.IgnoreForBinding;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.*;
import java.io.Serializable;
import java.security.SecureRandomParameters;

@Entity
@Data
@NoArgsConstructor
@Transactional
@Table(name = "books_authors")
public class BookAuthor implements Serializable {
    @Id
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "book_id")
    Book book;

    @Id
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "author_id")
    Author author;

    @Column(name = "is_main")
    boolean is_main;
}
