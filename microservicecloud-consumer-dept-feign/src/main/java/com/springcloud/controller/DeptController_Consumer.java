package com.springcloud.controller;

import com.springcloud.entities.Dept;
import com.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @author Wtq
 * @date 2019/7/31 - 14:09
 */
@RestController
public class DeptController_Consumer {
    @Autowired
    private DeptClientService deptClientService;

    @RequestMapping(value = "/consumer/add")
    public boolean add(Dept deptEntity) {
        return deptClientService.add(deptEntity);
    }

    @RequestMapping(value = "/consumer/get/{deptNo}")
    public Dept findById(@PathVariable("deptNo") Long deptNo) {
        return deptClientService.getById(deptNo);
    }

    @RequestMapping(value = "/consumer/list")
    public List<Dept> findAll() {
        return deptClientService.getAll();
    }
}
