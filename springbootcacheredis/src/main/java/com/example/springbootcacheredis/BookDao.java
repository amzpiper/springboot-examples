package com.example.springbootcacheredis;

import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;

import java.awt.print.Book;

public class BookDao {

    @Cacheable(value = "c1")
    public Book getBookById() {
        return new Book();
    }

    @CachePut(value = "c1")
    public Book updateBook() {
        return new Book();
    }

    @CacheEvict(value = "c1")
    public Book deleteBook() {
        return new Book();
    }


}
