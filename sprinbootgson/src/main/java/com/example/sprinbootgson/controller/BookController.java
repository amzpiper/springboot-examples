package com.example.sprinbootgson.controller;

import com.example.sprinbootgson.pojo.Books;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;


@RestController
public class BookController {

    @GetMapping("/books")
    public Books books() {
        Books books = new Books();
        books.setId(1);
        books.setName("OneBook");
        books.setAuthor("OneBookAuthor");
        books.setPublicationDate(new Date());
        return books;
    }
}
