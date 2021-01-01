package com.example.springbootfileupload.config;

import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;

import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public class GlobalConfig {

    /**
     * 全局数据
     *
     * @return
     */
    @ModelAttribute(value = "info")
    public Map<String, String> userInfo() {
        Map<String, String> userInfo = new HashMap<>();
        userInfo.put("username", "罗贯中");
        userInfo.put("gander", "男");
        return userInfo;
    }

    /**
     * 参数预处理：添加前缀
     * @param binder
     */
    @InitBinder("b")
    public void init(WebDataBinder binder) {
        binder.setFieldDefaultPrefix("b.");
    }

    @InitBinder("a")
    public void init2(WebDataBinder binder) {
        binder.setFieldDefaultPrefix("a.");
    }
}
