package com.zf.springcloud.service;

import com.zf.springcloud.entity.Dept;

import java.util.List;

/**
 * @描述:
 * @author: zf
 * @创建: 2018/6/11-16:11;
 * @版本: V1.0
 **/
public interface DeptService {
    /**
     * 增加实体
     *
     * @param dept
     * @return
     */
    boolean add(Dept dept);

    /**
     * 根据编号查询
     *
     * @param id
     * @return
     */
    Dept get(Long id);

    /**
     * 查询全部
     *
     * @return
     */
    List<Dept> list();

}
