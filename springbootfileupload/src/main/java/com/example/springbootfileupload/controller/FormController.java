package com.example.springbootfileupload.controller;

import com.example.springbootfileupload.pojo.Author;
import com.example.springbootfileupload.pojo.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FormController {

    @GetMapping("/bookauthor")
    public String book(@ModelAttribute("b") Book book,@ModelAttribute("a") Author author) {
        return book.toString() + ">>>>" + author.toString();
    }

}
