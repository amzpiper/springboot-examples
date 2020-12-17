package top.guoyuhang.springbootmybatis.service.impl;

import org.springframework.stereotype.Service;
import top.guoyuhang.springbootmybatis.entity.UserEntity;
import top.guoyuhang.springbootmybatis.mapper.UserMapper;
import top.guoyuhang.springbootmybatis.service.UserService;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    @Resource
    UserMapper userMapper;

    @Override
    public List<UserEntity> findAll() {
        List<UserEntity> list = userMapper.selectAll();
        return list;
    }

    @Override
    public boolean insertUser(UserEntity userEntity) {
        return userMapper.insertUser(userEntity);
    }

    @Override
    public UserEntity findUserByName(String name) {
        UserEntity user = userMapper.findUserByName(name);
        return user;
    }

    @Override
    public boolean deleteById(int id) {
        boolean flag = userMapper.deleteById(id);
        return flag;
    }

    @Override
    public boolean updateUser(UserEntity userEntity) {
        boolean flag = userMapper.updateUser(userEntity);
        return flag;
    }

    @Override
    public List<UserEntity> findUserLikeName(String name) {
        List<UserEntity> list = userMapper.findUserLikeName(name);
        return list;
    }

    @Override
    public boolean deleteByIds(String[] ids) {
        boolean flag = userMapper.deleteByIds(ids);
        return flag;
    }

    @Override
    public UserEntity findUserById(int id) {
        UserEntity user = userMapper.findUserById(id);
        return user;
    }

}
