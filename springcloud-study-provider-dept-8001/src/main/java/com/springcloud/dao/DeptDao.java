package com.springcloud.dao;

import com.springcloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author Wtq
 * @date 2019/7/31 - 9:31
        */
@Mapper
public interface DeptDao {
    public boolean addDept(Dept dept);

    public Dept findById(Long deptno);

    public List<Dept> findAll();
}
