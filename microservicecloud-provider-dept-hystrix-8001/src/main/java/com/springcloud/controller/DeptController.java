package com.springcloud.controller;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.springcloud.entities.Dept;
import com.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Wtq
 * @date 2019/7/31 - 10:31
 */
@RestController
public class DeptController {
    @Autowired
    private DeptService service;

    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept) {
        return service.addDept(dept);
    }

    //定义我们的熔断处理方法
    @HystrixCommand(fallbackMethod = "processHystrix_Get")
    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept getById(@PathVariable("id") Long id) {

        Dept dept = service.findById(id);
        if (null == dept) {
            throw new RuntimeException("该ID" + id + "没有对应信息");
        }
        return dept;
    }

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> getAll() {
        return service.findAll();
    }

    public Dept processHystrix_Get(@PathVariable("id") Long id) {
        Dept errorObj = new Dept();
        errorObj.setDeptno(id);
        errorObj.setDname("ID:" + id + "没有对应信息 ---Hystrix-null");
        errorObj.setMydb("no Database in MySql");
        return errorObj;
    }

}
