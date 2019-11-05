package com.jaclon.springcloud.microservicecloud.dao;

import com.jaclon.springcloud.microservicecloud.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @author jaclon
 * @date 2019/10/18
 */
@Mapper
public interface DeptDao {

    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}
