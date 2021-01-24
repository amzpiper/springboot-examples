package com.example.springboottest;

import com.example.springboottest.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.http.ResponseEntity;

@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.DEFINED_PORT)
public class SpringboottestApplicationTests2 {

    /**
     * TestRestTemplate类测试
     */
    @Autowired
    TestRestTemplate restTemplate;

    @Test
    public void useTestRestTemplate() {
        String hello = restTemplate.getForObject("/hello?name={0}", String.class,"Michael");
        System.out.println(hello);
    }

    @Test
    public void useTestRestTemplate2() {
        Book book = new Book();
        book.setId(1);
        book.setName("三国演义");
        book.setAuthor("罗贯中");
        String s = restTemplate.postForObject("/book",book, String.class);
        System.out.println(s);
    }
}
