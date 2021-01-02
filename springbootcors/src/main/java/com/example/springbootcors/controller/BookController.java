package com.example.springbootcors.controller;

import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/book")
public class BookController {

    @CrossOrigin(value = "http://localhost:8080", maxAge = 1800, allowedHeaders = "*")
    @PostMapping("/")
    public String book(String name) {
        return "receive:"+name;
    }

    @CrossOrigin(value = "http://localhost:8080", maxAge = 1800, allowedHeaders = "*")
    @DeleteMapping("/{id}")
    public String delBook(@PathVariable Long id) {
        return "delete:"+String.valueOf(id);
    }
}
