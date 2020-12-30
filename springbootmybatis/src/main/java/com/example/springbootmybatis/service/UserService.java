package com.example.springbootmybatis.service;


import com.example.springbootmybatis.entity.UserEntity;

import java.util.List;

public interface UserService {

    /**
     * @return
     */
    List<UserEntity> findAll();

    /**
     * @param id
     * @return
     */
    UserEntity findUserById(int id);

    /**
     * @param userEntity
     * @return
     */
    boolean insertUser(UserEntity userEntity);

    /**
     * @param name
     * @return
     */
    UserEntity findUserByName(String name);

    /**
     * @param userEntity
     * @return
     */
    boolean updateUser(UserEntity userEntity);

    /**
     * @param id
     * @return
     */
    boolean deleteById(int id);

    /**
     * @param name
     * @return
     */
    List<UserEntity> findUserLikeName(String name);

    /**
     * @param ids
     * @return
     */
    boolean deleteByIds(String[] ids);
}
