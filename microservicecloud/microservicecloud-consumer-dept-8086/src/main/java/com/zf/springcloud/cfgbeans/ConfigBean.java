package com.zf.springcloud.cfgbeans;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @描述:
 * @author: zf
 * @创建: 2018/6/11-16:34;
 * @版本: V1.0
 **/
@Configuration
public class ConfigBean {
    @Bean
    @LoadBalanced //开启客户端的负载均衡
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }


    //***************自定义负载均衡算法****************************

    /**
     @Bean public IRule myRule() {
     //随机的负载均衡算法 来替代轮询算法
     return new RandomRule();
     }
     */
    /**
     * @Bean public IRule myAvailabilityFilteringRule() {
     * //会先过滤掉由于多次访问故障而处于断路器跳闸状态的服务
     * //还有并发的连接数量超过阈值的服务，然后对剩余的服务列表按照轮询策略进行访问
     * return new AvailabilityFilteringRule();
     * }
     */
    /**
     @Bean public IRule my_RetryRule() {
     return new RetryRule();
     }
     */
    //自定义负载均衡算法（不用默认的七种负载均均衡算法）

    //***************自定义负载均衡算法****************************
}
