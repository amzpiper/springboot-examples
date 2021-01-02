package com.example.springbootjpa.dao;

import com.example.springbootjpa.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface UserDao extends JpaRepository<User, Integer> {

    List<User> getUserByNameStartingWith(String name);

    @Query(value = "select * from t_user where id = (select max(id) from  t_user )", nativeQuery = true)
    User getMaxIdUser();

    @Query(value = "select u from t_user u where u.name=?1")
    List<User> getUserByName(@Param("name") String name);

    @Query(value = "select u from t_user u where u.name=:name and u.password=:password")
    List<User> getUserByNameAndPassword(@Param("name") String name, @Param("password") String password);

}
