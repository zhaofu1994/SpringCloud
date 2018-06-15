package com.zf.springcloud.service;

import com.zf.springcloud.entity.Dept;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

/**
 * @描述:
 * @author: zf
 * @创建: 2018/6/13-15:55;
 * @版本: V1.0
 **/
// 不要忘记添加，不要忘记添加
@Component
public class DeptClientServiceFallbackFactory implements FallbackFactory<DeptClientService> {
    @Override
    public DeptClientService create(Throwable cause) {
        return new DeptClientService() {
            @Override
            public Dept get(@PathVariable("id") long id) {
                return new Dept().setDeptno(id).setDname("该ID" + id + "没有对应的信息,Consumer客户端提供的降级信息,此时服务Provide已经关闭").
                        setDb_source("no this database in MySQL");
            }

            @Override
            public List<Dept> list() {
                return null;
            }

            @Override
            public boolean add(Dept dept) {
                return false;
            }
        };
    }
}
