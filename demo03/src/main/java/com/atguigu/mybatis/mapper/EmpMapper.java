package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Emp;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface EmpMapper {
    //查询所有员工信息
    List<Emp> getAllEmp();

    //通过分布查询查询员工以及员工所对应的部门信息
    //第一步：通过eid查询员工信息
    Emp getEmpAndDeptByStepOne(@Param("eid")Integer eid);
}
