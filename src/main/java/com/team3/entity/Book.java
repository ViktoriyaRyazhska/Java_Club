package com.team3.entity;

import lombok.*;
import lombok.experimental.FieldNameConstants;

import javax.persistence.*;

@Entity
@Data
@NoArgsConstructor
@Table(name = "book")
public class Book {

    @Id
    @Column(name = "book_id")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int bookId;

    @Column(name = "authorId")
    private int authorId;

    @Column(name = "title")
    private String title;

    @ToString.Exclude
    @Column(name = "description")
    private String description;

    @Column(name = "genre")
    private String genre;

    @Column(name = "count")
    private int count;

    @Override
    public String toString (){
        return getDescription();
    }

   // @ManyToOne
    //@JoinColumn(name = "authorId")
   // private Author author;


}