package com.team3.entity;

import lombok.*;

import javax.persistence.*;

@Entity
@Getter
@Setter
@EqualsAndHashCode
@NoArgsConstructor
@Table(name = "roles")
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "role_id")
    private Long id;

    @Column(name = "role_name")
    private String name;

    @Override
    public String toString() {
        return name;
    }

    public Role(String name) {
        this.name = name;
    }
}
