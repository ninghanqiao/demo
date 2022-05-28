package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.User;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface SQLMapper {

    //模糊查询
    List<User> getUserByLike(@Param("username")String username);

    //批量删除
    Integer deleteMore(@Param("ids")String ids);
}
