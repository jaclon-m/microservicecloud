package com.jaclon.springcloud.microservicecloud.service;

import com.jaclon.springcloud.microservicecloud.entities.Dept;

import java.util.List;

/**
 * @author jaclon
 * @date 2019/10/18
 */
public interface DeptService {

    public boolean add(Dept dept);

    public Dept get(Long id);

    public List <Dept> list();
}
