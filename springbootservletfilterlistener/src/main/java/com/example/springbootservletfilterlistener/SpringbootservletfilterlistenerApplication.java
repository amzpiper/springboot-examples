package com.example.springbootservletfilterlistener;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;

@SpringBootApplication
//实现对servlet、filter、listener扫描
@ServletComponentScan
public class SpringbootservletfilterlistenerApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootservletfilterlistenerApplication.class, args);
    }

}
