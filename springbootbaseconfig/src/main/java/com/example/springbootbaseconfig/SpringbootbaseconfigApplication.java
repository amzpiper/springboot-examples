package com.example.springbootbaseconfig;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringbootbaseconfigApplication {

    public static void main(String[] args) {
        //SpringApplication.run(SpringbootbaseconfigApplication.class, args);

        // 关闭banner
        SpringApplicationBuilder builder = new SpringApplicationBuilder(SpringbootbaseconfigApplication.class);
        builder.bannerMode(Banner.Mode.OFF).run(args);
    }

}
