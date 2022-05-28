package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface ParameterMapper {
    //查询所有信息
    List<User> getAllUser();

    //添加用户信息
    int insertUser(User user);

    //验证登录
    User checkLoginByParam(@Param("username")String username,@Param("password") String password);


}
