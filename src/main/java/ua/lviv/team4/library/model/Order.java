package ua.lviv.team4.library.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "orders")
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(nullable = false)
    @JsonIgnoreProperties("readerOrders")
    private Reader reader;
    @ManyToOne
    @JoinColumn(nullable = false)
    @JsonIgnoreProperties("bookOrders")
    private Book book;
    private LocalDate bookTaken;
    private LocalDate bookReturned;
    private LocalDate returnDeadline;
}
