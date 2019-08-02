package com.springcloud.service;

import com.springcloud.entities.Dept;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import java.util.List;

/**
 * @author Wtq
 * @date 2019/8/1 - 18:03
 */
//@FeignClient(value = "STUDY-SPRINGCLOUD-DEPT")
//将我们的异常信息处理统一的放在    DeptClientServiceFallbackFactory 中处理，解决了业务与异常处理的耦合问题
@FeignClient(value = "STUDY-SPRINGCLOUD-DEPT" , fallbackFactory = DeptClientServiceFallbackFactory.class)
public interface DeptClientService {
    @RequestMapping(value = "/dept/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Dept dept);

    @RequestMapping(value = "/dept/get/{id}", method = RequestMethod.GET)
    public Dept getById(@PathVariable("id") Long id);

    @RequestMapping(value = "/dept/list", method = RequestMethod.GET)
    public List<Dept> getAll();
}
