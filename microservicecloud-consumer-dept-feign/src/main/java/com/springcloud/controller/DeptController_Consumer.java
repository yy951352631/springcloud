package com.springcloud.controller;

import com.springcloud.entities.Dept;
import com.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Wtq
 * @date 2019/7/31 - 14:09
 */
@RestController
@RequestMapping(value = "/")
public class DeptController_Consumer {
    @Autowired
    private DeptClientService deptClientService;

    @RequestMapping(method = RequestMethod.POST)
    public boolean add(@RequestBody Dept deptEntity) {
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
