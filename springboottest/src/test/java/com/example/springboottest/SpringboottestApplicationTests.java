package com.example.springboottest;

import com.example.springboottest.entity.Book;
import com.example.springboottest.service.HelloService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

@SpringBootTest
class SpringboottestApplicationTests {

    @Autowired
    HelloService helloService;

    /**
     * 测试Service
     */
    @Test
    void contextLoads() {
        String hello = helloService.sayHello("YuHang");
        System.out.println(hello);
        Assertions.assertThat(hello).isNotNull();
    }

    /**
     * 测试Controller
     */
    @Autowired
    WebApplicationContext wac;
    MockMvc mockMvc;

    @BeforeEach
    public void before() {
        mockMvc = MockMvcBuilders.webAppContextSetup(wac).build();
    }

    @Test
    public void testHello() throws Exception{
        MvcResult mvcResult = mockMvc.perform(
                MockMvcRequestBuilders
                        .get("/hello")
                        .contentType(MediaType.APPLICATION_FORM_URLENCODED)
                        .param("name", "Michael"))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andDo(MockMvcResultHandlers.print())
                .andReturn();
        System.out.println(mvcResult.getResponse().getContentAsString());
    }

    @Test
    public void testBook() throws Exception {
        ObjectMapper objectMapper = new ObjectMapper();
        Book book = new Book();
        book.setId(1);
        book.setName("三国演义");
        book.setAuthor("罗贯中");
        String s = objectMapper.writeValueAsString(book);
        MvcResult mvcResult = mockMvc.perform(
                MockMvcRequestBuilders
                        .post("/book")
                        .contentType(MediaType.APPLICATION_JSON)
                        .content(s))
                .andExpect(MockMvcResultMatchers.status().isOk())
                .andReturn();
        System.out.println(mvcResult.getResponse().getContentAsString());
    }

}
