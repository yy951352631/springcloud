package com.myrule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Wtq
 * @date 2019/8/1 - 16:06
 */
@Configuration
public class MyselfRule {
    @Bean
    public IRule myRule() {
//        return new RandomRule();
        return new RandomRuleWtq();
    }
}
