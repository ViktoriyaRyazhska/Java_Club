package ua.lviv.team4.library.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.util.List;

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
    private Long id;
    @OneToMany(mappedBy = "book", targetEntity = Order.class)
    @JsonIgnoreProperties("book")
    private List<Book> bookOrders;
    private String title;
    private String mainAuthor;
    private String coAuthor;
    private Integer countOfCopies;
}
