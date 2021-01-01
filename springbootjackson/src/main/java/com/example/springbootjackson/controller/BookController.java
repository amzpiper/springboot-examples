package com.example.springbootjackson.controller;

import com.example.springbootjackson.pojo.Books;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@RestController
public class BookController {

    @GetMapping("/books")
    public List<Books> bookList() {
        List<Books> books = new ArrayList<>();
        Books book;
        int count = 1;
        while (count < 5) {
            book = new Books();
            book.setId(count);
            book.setName("name-" + count);
            book.setAuthor("author-" + count);
            book.setPrice((float) count);
            book.setPublicationDate(new Date());
            books.add(book);
            count++;
        }
        return books;
    }
}
