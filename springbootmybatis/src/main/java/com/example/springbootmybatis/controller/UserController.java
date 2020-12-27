package com.example.springbootmybatis.controller;

import com.example.springbootmybatis.entity.UserEntity;
import com.example.springbootmybatis.service.UserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping("/user")
@RestController
public class UserController {

    @Resource
    private UserService userService;

    /**
     * 查询所有user
     *
     * @return list
     */
    @ResponseBody
    @GetMapping("/get")
    public List<UserEntity> findAll() {
        List<UserEntity> list = userService.findAll();
        return list;
    }

    /**
     * 通过id查询
     *
     * @param id
     * @return user
     */
    @ResponseBody
    @GetMapping("/get/id/{ids}")
    public UserEntity findUserById(@PathVariable("ids") int id) {
        UserEntity user = userService.findUserById(id);
        return user;
    }

    /**
     * 通过name查询user
     *
     * @param name
     * @return user
     */
    @ResponseBody
    @GetMapping("/get/name/{name}")
    public UserEntity findUserById(@PathVariable("name") String name) {
        UserEntity user = userService.findUserByName(name);
        return user;
    }

    /**
     * 模糊查询
     *
     * @param name
     * @return list
     */
    @ResponseBody
    @GetMapping("/get/like/{name}")
    public List<UserEntity> findUserLikeName(@PathVariable("name") String name) {
        List<UserEntity> list = userService.findUserLikeName(name);
        return list;
    }

    /**
     * 插入user
     *
     * @param userEntity
     * @return flag
     */
    @ResponseBody
    @PostMapping("/insert")
    public boolean insert(@RequestBody UserEntity userEntity) {
        boolean flag = userService.insertUser(userEntity);
        return flag;
    }

    /**
     * 修改user通过id
     *
     * @param userEntity
     * @return
     */
    @ResponseBody
    @PostMapping("/update")
    public boolean updateUser(@RequestBody UserEntity userEntity) {
        boolean flag = userService.updateUser(userEntity);
        return flag;
    }

    /**
     * 删除user通过id
     *
     * @param id
     * @return flag
     */
    @ResponseBody
    @GetMapping("/delete/{id}")
    public boolean delectById(@PathVariable("id") int id) {
        boolean flag = userService.deleteById(id);
        return flag;
    }

    /**
     * 删除多个user
     *
     * @param ids
     * @return flag
     */
    @ResponseBody
    @GetMapping("delete/ids")
    public boolean delectByIdList(@RequestParam String[] ids) {
        boolean flag = userService.deleteByIds(ids);
        return flag;
    }

    //[{"id":1,"name":"k1"},{"id":2,"name":"k2"}]
    //    拦截器写登录
    //    aop
    //    redis
}
