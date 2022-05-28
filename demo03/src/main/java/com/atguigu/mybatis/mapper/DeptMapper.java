package com.atguigu.mybatis.mapper;

import com.atguigu.mybatis.pojo.Dept;
import org.apache.ibatis.annotations.Param;

public interface DeptMapper {
    //通过分布查询查询员工以及员工所对应的部门信息
    //第er步：通过did查询员工所对应的部门信息
    Dept getEmpAndDeptByStepTwo(@Param("did") Integer did);
}
