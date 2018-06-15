package com.zf.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @描述:
 * @author: zf
 * @创建: 2018/6/11-17:19;
 * @版本: V1.0
 **/
@SpringBootApplication
@EnableEurekaServer //EurekaServer 服务器端的启动类 接受其它微服务注册进来
public class EurekaServer7001_App {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServer7001_App.class);
    }
}
