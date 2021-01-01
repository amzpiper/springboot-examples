package com.example.springbootthymeleaf.controller;

import com.example.springbootthymeleaf.pojo.Book;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

@Controller
public class BookController {

    @GetMapping("/books")
    public ModelAndView books() {
        List<Book> books = new ArrayList<Book>();
        Book book;
        int count = 1;
        while (count < 12) {
            book = new Book();
            book.setId(count);
            book.setName("BookName-" + count);
            book.setAuthor("Author-" + count);
            books.add(book);
            count++;
        }

        ModelAndView view = new ModelAndView();
        view.addObject("books", books);
        view.setViewName("books");
        return view;
    }
}
