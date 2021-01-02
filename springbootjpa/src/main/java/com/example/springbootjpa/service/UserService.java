package com.example.springbootjpa.service;

import com.example.springbootjpa.dao.UserDao;
import com.example.springbootjpa.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService {

    @Autowired
    UserDao userDao;

    public void addUser(User user) {
        userDao.save(user);
    }

    public Page<User> getUserByPage(Pageable pageable) {
        return userDao.findAll(pageable);
    }

    public List<User> getUserByNameStartingWith(String name) {
        return userDao.getUserByNameStartingWith(name);
    }

    public User getMaxIdUser() {
        return userDao.getMaxIdUser();
    }

    public List<User> getUserByName(String name) {
        return userDao.getUserByName(name);
    }

    public List<User> getUserByNameAndPassword(String name, String password) {
        return userDao.getUserByNameAndPassword(name, password);
    }

}
