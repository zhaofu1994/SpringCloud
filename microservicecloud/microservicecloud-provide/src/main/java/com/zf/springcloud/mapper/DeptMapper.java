package com.zf.springcloud.mapper;

import com.zf.springcloud.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @描述:
 * @author: zf
 * @创建: 2018/6/11-16:02;
 * @版本: V1.0
 **/
@Mapper
public interface DeptMapper {
    /**
     * 增加实体
     *
     * @param dept
     * @return
     */
    boolean addDept(Dept dept);

    /**
     * 根据编号查询
     *
     * @param id
     * @return
     */
    Dept findById(Long id);

    /**
     * 查询全部
     *
     * @return
     */
    List<Dept> findAll();

}
