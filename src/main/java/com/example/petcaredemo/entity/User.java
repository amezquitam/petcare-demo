package com.example.petcaredemo.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "users", uniqueConstraints = @UniqueConstraint(name = "unique_email", columnNames = {"email"}))
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column
    private String name;

    @Column
    private String email;

    @Column
    private String password;

    @Column
    private String phoneNumber;

    @ManyToMany
    private List<Role> roles;

}
