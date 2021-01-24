package com.example.springboottest;

import com.example.springboottest.entity.Book;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.json.JsonTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.json.JacksonTester;

import java.io.IOException;

@SpringBootTest
@JsonTest
public class JSONTest {

    /**
     * 测试json序列化与反序列化
     * @throws IOException
     */
    @Autowired
//    JacksonTester<Book> jacksonTester;

    @Test
    public void testSerialize() throws IOException {
        Book book = new Book();
        book.setId(1);
        book.setName("三国演义");
        book.setAuthor("罗贯中");
//        Assertions.assertEquals(jacksonTester.write(book),"book.json");
//        Assertions.assertEquals(jacksonTester.write(book),"book.json");
    }


}
