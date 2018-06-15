package com.zf.springcloud;

import com.zf.myrule.MySelfRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

/**
 * @描述:
 * @author: zf
 * @创建: 2018/6/11-16:51;
 * @版本: V1.0
 **/
@SpringBootApplication
@EnableEurekaClient
//在启动改为服务的时候就能去加载我们自定义Ribbon配置类，从而使配置生效
@RibbonClient(name = "MICROSERVICECLOUD-DEPT", configuration = MySelfRule.class)
public class DeptConsumer8086_App {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumer8086_App.class);
    }

}
