package com.example.springbootcacheehcache;

import lombok.Data;

import java.io.Serializable;

@Data
public class Book implements Serializable {

    private Integer id;
    private String name;
    private String author;

}
