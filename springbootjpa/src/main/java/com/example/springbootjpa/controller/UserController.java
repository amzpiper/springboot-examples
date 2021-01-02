package com.example.springbootjpa.controller;

import com.example.springbootjpa.entity.User;
import com.example.springbootjpa.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.awt.print.Book;
import java.util.List;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping("/getAll")
    public Page<User> findAll() {
        PageRequest pageable = PageRequest.of(0, 10);
        Page<User> page = userService.getUserByPage(pageable);
        System.out.println("总页数：" + page.getTotalPages());
        System.out.println("总记录数：" + page.getTotalPages());
        System.out.println("查询结果：" + page.getTotalPages());
        System.out.println("当前页数：" + page.getTotalPages());
        System.out.println("当前页记录：" + page.getTotalPages());
        System.out.println("每页记录数：" + page.getTotalPages());
        return page;
    }

    @GetMapping("/search")
    public void search() {
        List<User> users1 = userService.getUserByName("guoyuhang");
        List<User> users2 = userService.getUserByNameStartingWith("guo");
        List<User> users3 = userService.getUserByNameAndPassword("guodd", "guodd");
        User user = userService.getMaxIdUser();
        System.out.println("users1:" + users1);
        System.out.println("users2:" + users2);
        System.out.println("users3:" + users3);
        System.out.println("user:" + user);
    }

    @GetMapping("/save")
    public void save() {
        User maxUser = userService.getMaxIdUser();
        System.out.println("maxUserId:" + maxUser.getId() + 1);

        User user = new User();
        user.setId(maxUser.getId()+1);
        user.setName("guoxx");
        user.setPassword("guoxx");
        user.setDescription("guoxx");
        userService.addUser(user);
    }
}
