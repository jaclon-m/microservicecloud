package com.jaclon.springcloud.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author jaclon
 * @date 2019/10/20
 */
@Configuration
public class MySelfRule {
    @Bean
    public IRule myRule()
    {
        //Ribbon默认是轮询，我自定义为随机
        //return new RandomRule();
        return new MyRandomRole();
    }
}
