package com.example.springbootcacheehcache;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringbootcacheehcacheApplicationTests {

    @Autowired
    BookDao bookDao;

    @Test
    void contextLoads() {
        bookDao.getBookById(1);
        bookDao.getBookById(1);
        bookDao.deleteBookById(1);

        Book book = bookDao.getBookById(1);
        System.out.println("book:" + book);

        Book book1 = new Book();
        book1.setId(1);
        book1.setName("三国演义");
        book1.setAuthor("罗贯中");
        bookDao.updateBookById(book1);

        Book book2 = bookDao.getBookById(1);
        System.out.println("book2:" + book2);

    }

}
