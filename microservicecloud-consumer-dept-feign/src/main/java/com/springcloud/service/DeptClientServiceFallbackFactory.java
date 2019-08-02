package com.springcloud.service;

import com.springcloud.entities.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @author Wtq
 * @date 2019/8/2 - 10:32
 */
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable throwable) {
        return new DeptClientService() {
            @Override
            public boolean add(Dept dept) {
                return false;
            }
            @Override
            public Dept getById(Long id) {
                Dept errorObj = new Dept();
                errorObj.setDeptno(id);
                errorObj.setDname("该ID:" + id + "没有对应的信息，Consumer客户提供降级信息，此刻服务provide已经关闭");
                errorObj.setMydb("no this database in MySql");
                return errorObj;
            }
            @Override
            public List<Dept> getAll() {
                return null;
            }
        };
    }
}
