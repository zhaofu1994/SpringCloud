package com.zf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.context.annotation.ComponentScan;

/**
 * @描述:
 * @author: zf
 * @创建: 2018/6/11-16:51;
 * @版本: V1.0
 **/
@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients(basePackages= {"com.zf.springcloud"})
@ComponentScan("com.zf.springcloud")
public class DeptConsumer8087_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer8087_App.class, args);
    }

}
