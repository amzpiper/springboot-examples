package com.example.springbootaop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.web.servlet.error.ErrorMvcAutoConfiguration;

@SpringBootApplication
//去除自动配置
@EnableAutoConfiguration(exclude = {ErrorMvcAutoConfiguration.class})
public class SpringbootaopApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootaopApplication.class, args);
    }

}
