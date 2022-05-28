package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;

import java.util.List;

public interface UserMapper {
    //添加用户信息
    int insertUser();
    //修改用户信息
    void updateUser();
    //删除用户信息
    void deleteUser();
    //查询单个用户信息
    User getUser();
    //查询所有用户信息
    List<User> getAllUser();
}