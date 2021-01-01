package com.example.springbooterror.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ErrorController {

    /**
     * error文件下创建500.html文件展示静态错误页面
     * 无法显示完整的错误信息
     * @return
     */
    @GetMapping("/hello")
    public String hello() {
        int i = 1 / 0;
        return "hello";
    }
}
