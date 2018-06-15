package com.zf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @描述:
 * @author: zf
 * @创建: 2018/6/14-18:21;
 * @版本: V1.0
 **/
@SpringBootApplication
@EnableEurekaServer
public class EurekaConfigClient_7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaConfigClient_7001.class, args);
    }
}
