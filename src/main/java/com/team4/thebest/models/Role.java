package com.team4.thebest.models;

import lombok.*;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;

@Entity
@NoArgsConstructor
@Table(name = "roles")
@Getter
@Setter
@ToString
@EqualsAndHashCode
public class Role implements GrantedAuthority {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Enumerated(EnumType.STRING)
    @Column(name = "role_type", nullable = false)
    private RoleType roleType;

    public Role(RoleType roleType) {
        this.roleType = roleType;
    }

    @Override
    public String getAuthority() {
        return roleType.name();
    }
}
