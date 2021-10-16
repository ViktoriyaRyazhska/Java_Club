package com.team3.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;
import java.util.Objects;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id")
    private Long id;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "userId")
    private User user;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "bookId")
    private Book book;

    @Column(name = "reserveDate")
    private Date reserveDate;

    @Column(name = "takeBook")
    private Date takeBook;

    @Column(name = "returnBook")
    private Date returnBook;

    @Column(name = "deadline")
    private Date deadline;

    @Column(name = "isReturned")
    private boolean isReturned;

    @Column(name = "status")
    @Enumerated(EnumType.STRING)
    private OrderStatus orderStatus;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return isReturned == order.isReturned && Objects.equals(id, order.id) && Objects.equals(user, order.user) && Objects.equals(book, order.book) && Objects.equals(reserveDate, order.reserveDate) && Objects.equals(takeBook, order.takeBook) && Objects.equals(returnBook, order.returnBook) && Objects.equals(deadline, order.deadline) && orderStatus == order.orderStatus;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, user, book, reserveDate, takeBook, returnBook, deadline, isReturned, orderStatus);
    }
}