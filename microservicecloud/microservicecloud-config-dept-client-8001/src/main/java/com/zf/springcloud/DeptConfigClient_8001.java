package com.zf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @描述:
 * @author: zf
 * @创建: 2018/6/14-18:21;
 * @版本: V1.0
 **/
@SpringBootApplication
@EnableEurekaClient     //本服务启动后会自动注册到eureka服务中
@EnableDiscoveryClient //服务发现
public class DeptConfigClient_8001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConfigClient_8001.class, args);
    }
}
