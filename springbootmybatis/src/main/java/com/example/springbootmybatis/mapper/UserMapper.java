package com.example.springbootmybatis.mapper;

import com.example.springbootmybatis.entity.UserEntity;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface UserMapper {

    List<UserEntity> selectAll();

    boolean insertUser(UserEntity userEntity);

    UserEntity findUserById(int id);

    UserEntity findUserByName(String name);

    boolean deleteById(int id);

    boolean updateUser(UserEntity userEntity);

    List<UserEntity> findUserLikeName(String name);

    boolean deleteByIds(String[] ids);

}
