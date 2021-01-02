package com.example.springbootaop.service;

import org.springframework.stereotype.Service;

@Service
public class UserService {

    public String getUserById(Integer id) {
        System.out.println("getUserById");
        return "user";
    }

    public void deleteUserById(Integer id) {
        System.out.println("deleteUserById");
    }
}
