package com.example.nacosconfigexample2.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@NoArgsConstructor
@Entity
@Table(name = "user_model")
public class UserModel {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false, unique = true, updatable = false)
    private Long id;

    @Column(length = 64, unique = true)
    private String username;

    @Column(length = 64)
    private String password;

    @Column(length = 64)
    private String nick;

}
