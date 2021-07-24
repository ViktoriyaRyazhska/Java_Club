package ua.lviv.team4.library.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.Period;
import java.util.List;

@Entity
@Table(name = "readers")
@NoArgsConstructor
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Reader {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @OneToMany(mappedBy = "reader", targetEntity = Order.class)
    @JsonIgnoreProperties("reader")
    private List<Reader> readerOrders;
    private String phoneNumber;
    private String email;
    private String userName;
    @Column(name = "`password`")
    private String password;
    private LocalDate dob;
    private LocalDate registrationTime;

    public Integer getAge() {
        return Period.between(dob, LocalDate.now()).getYears();
    }
}
