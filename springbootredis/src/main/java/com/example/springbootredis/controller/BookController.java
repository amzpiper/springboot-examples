package com.example.springbootredis.controller;

import com.example.springbootredis.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class BookController {

    @Autowired
    RedisTemplate redisTemplate;

    @Autowired
    StringRedisTemplate stringRedisTemplate;

    @GetMapping("/test")
    public void test() {
        ValueOperations<String, String> opsString = stringRedisTemplate.opsForValue();
        opsString.set("name", "三国演义");
        String name = opsString.get("name");
        System.out.println(name);

        ValueOperations ops = redisTemplate.opsForValue();
        Book book = new Book();
        book.setId(1);
        book.setName("三国演义");
        book.setAuthor("曹雪芹");
        ops.set("name2", book);
        Book book1 = (Book) ops.get("name2");
        System.out.println(book1.toString());
    }
}
