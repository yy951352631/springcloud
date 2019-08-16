package com.springcloud.service.impl;

import com.springcloud.dao.DeptDao;
import com.springcloud.entities.Dept;
import com.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Wtq
 * @date 2019/7/31 - 10:07
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao dao;

    @Override
    public boolean addDept(Dept dept) {
        return dao.addDept(dept);
    }

    @Override
    public Dept findById(Long deptno) {
        return dao.findById(deptno);
    }

    @Override
    public List<Dept> findAll() {
        return dao.findAll();
    }
}
