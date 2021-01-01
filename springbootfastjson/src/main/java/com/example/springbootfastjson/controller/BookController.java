package com.example.springbootfastjson.controller;

import com.example.springbootfastjson.pojo.Books;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@RestController
public class BookController {
    @GetMapping("/books")
    public Books books() {
        Books books = new Books();
        books.setId(1);
        books.setName("姓名");
        books.setAuthor("author");
        books.setPublicationDate(new Date());
        return books;
    }
}
