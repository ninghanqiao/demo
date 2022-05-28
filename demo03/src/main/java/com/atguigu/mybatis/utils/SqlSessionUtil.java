package com.atguigu.mybatis.utils;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionUtil {
    public static SqlSession getSqlSession(){
        SqlSession sqlSession = null;
        //加载配置文件
        InputStream is = null;
        try {
            is = Resources.getResourceAsStream("mybatis-config.xml");
        //获取SqlSessionFactoryBuilder
        SqlSessionFactoryBuilder sqlSessionFactoryBuilder = new SqlSessionFactoryBuilder();
        //获取sqlSessionFactory
       SqlSessionFactory sqlSessionFactory =  sqlSessionFactoryBuilder.build(is);
        //获取sqlSession,开启自动提交事务。
        sqlSession = sqlSessionFactory.openSession(true);
        } catch (IOException e) {
            e.printStackTrace();
        }
        //获取mapper接口对象
        return sqlSession;
    }
}
