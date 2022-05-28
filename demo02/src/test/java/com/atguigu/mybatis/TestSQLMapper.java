package com.atguigu.mybatis;

import com.atguigu.mybatis.mapper.SQLMapper;
import com.atguigu.mybatis.pojo.User;
import com.atguigu.mybatis.utils.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import java.util.List;

public class TestSQLMapper {
    @Test
    public void testGetUserByLike(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        List<User> list = mapper.getUserByLike("三");
        list.forEach(System.out::println);
    }
    @Test
    public void testDeleteMore(){
        SqlSession sqlSession = SqlSessionUtil.getSqlSession();
        SQLMapper mapper = sqlSession.getMapper(SQLMapper.class);
        Integer integer = mapper.deleteMore("14,2,5");
        System.out.println(integer);
    }

}
