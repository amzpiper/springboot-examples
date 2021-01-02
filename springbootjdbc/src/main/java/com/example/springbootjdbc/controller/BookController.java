package com.example.springbootjdbc.controller;

import com.example.springbootjdbc.pojo.Book;
import com.example.springbootjdbc.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/addBook")
    public int addBook() {
        Book book = new Book();
        book.setName("西游记");
        book.setAuthor("王世谱");
        int flag = bookService.addBook(book);
        return flag;
    }

    @GetMapping("/updateBook")
    public int updateBook() {
        Book book = new Book();
        book.setId(3);
        book.setName("西游记");
        book.setAuthor("郭宇航");
        int flag = bookService.updateBook(book);
        return flag;
    }


    @GetMapping("/getBookById")
    public Book getBookById() {
        Book book;
        book = bookService.getBookById(3);
        return book;
    }


    @GetMapping("/deleteBookById")
    public int deleteBookById() {
        Book book;
        int flag = bookService.deleteBookById(3);
        return flag;
    }


    @GetMapping("/getAllBooks")
    public List<Book> getAllBooks() {
        List<Book> books;
        books = bookService.getAllBooks();
        return books;
    }
}
