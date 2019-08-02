package com.springcloud;

import com.myrule.MyselfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @author Wtq
 * @date 2019/7/31 - 14:25
 */
@EnableEurekaClient
@SpringBootApplication(exclude= {DataSourceAutoConfiguration.class})
@RibbonClient(name="STUDY-SPRINGCLOUD-DEPT",configuration = MyselfRule.class)
public class DeptConsumer80_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer80_App.class,args);
    }
}
