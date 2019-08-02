package com.springcloud.service;

import com.springcloud.entities.Dept;

import java.util.List;

/**
 * @author Wtq
 * @date 2019/7/31 - 10:05
 */

public interface DeptService {
    public boolean addDept(Dept dept);

    public Dept findById(Long deptno);

    public List<Dept> findAll();
}
