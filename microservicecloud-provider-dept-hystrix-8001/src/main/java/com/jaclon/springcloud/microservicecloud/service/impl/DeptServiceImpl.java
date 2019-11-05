package com.jaclon.springcloud.microservicecloud.service.impl;

import com.jaclon.springcloud.microservicecloud.dao.DeptDao;
import com.jaclon.springcloud.microservicecloud.entities.Dept;
import com.jaclon.springcloud.microservicecloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author jaclon
 * @date 2019/10/18
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao dao ;

    @Override
    public boolean add(Dept dept)
    {
        return dao.addDept(dept);
    }

    @Override
    public Dept get(Long id)
    {
        return dao.findById(id);
    }

    @Override
    public List<Dept> list()
    {
        return dao.findAll();
    }
}
