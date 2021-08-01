package com.library.entity;


import lombok.*;
import org.springframework.security.core.GrantedAuthority;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "role")
public class Role implements GrantedAuthority {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Enumerated(EnumType.STRING)
  @Column(name = "role_type", nullable = false)
  private RoleType roleType;

  @OneToMany(mappedBy = "role")
  private List<User> users;

  @Override
  public String getAuthority() {
    return roleType.name();
  }
}
