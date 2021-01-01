package com.example.springbootfileupload.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

@RestController
public class GlobalController {

    /**
     * 获取全局数据userInfo
     * @param model
     * @return
     */
    @GetMapping("/global")
    public void global(Model model) {
        Map<String, Object> userInfo = model.asMap();
        Set<String> keySet = userInfo.keySet();
        Iterator<String> iterator = keySet.iterator();
        while (iterator.hasNext()) {
            String key = iterator.next();
            Object value = userInfo.get(key);
            System.out.println(key + ">>>>>>>>" + value);
        }
    }
}
