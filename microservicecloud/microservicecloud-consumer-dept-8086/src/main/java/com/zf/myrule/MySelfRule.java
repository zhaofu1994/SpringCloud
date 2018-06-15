package com.zf.myrule;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RoundRobinRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @描述: 自定义负载均衡算法
 * @author: zf
 * @创建: 2018/6/13-12:11;
 * @版本: V1.0
 **/
@Configuration
public class MySelfRule {

    @Bean
    public IRule myRule() {
//        return new RandomRule();
        return new RandomRule_ZY();
    }

}
