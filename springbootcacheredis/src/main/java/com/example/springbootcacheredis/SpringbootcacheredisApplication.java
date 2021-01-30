package com.example.springbootcacheredis;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;

@SpringBootApplication
@EnableCaching
public class SpringbootcacheredisApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootcacheredisApplication.class, args);
    }

}
