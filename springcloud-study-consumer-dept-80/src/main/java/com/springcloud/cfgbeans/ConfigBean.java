package com.springcloud.cfgbeans;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RetryRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author Wtq
 * @date 2019/7/31 - 14:02
 */

@Configuration
public class ConfigBean {//boot -->spring applicationContext.xml  --加了@Configuration注解后，通过注解方式配置

    @Bean
    @LoadBalanced//开启我们的负载均衡
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }

    //将我们的负载均衡算法设置为随机
    @Bean
    public IRule myRule() {
        //return new RoundRobinRule();//轮询的方式进行服务切换
//        return new RandomRule();//随机
        return new RetryRule();//重试方式进行服务切换
    }
}
