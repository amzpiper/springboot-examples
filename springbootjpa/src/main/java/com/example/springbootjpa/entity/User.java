package com.example.springbootjpa.entity;

import lombok.Data;

import javax.persistence.*;

@Data
@Entity(name = "t_user")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    @Column(name = "name",nullable = true)
    private String name;

    @Column(name = "password",nullable = true)
    private String password;

    @Transient
    private String description;
}
