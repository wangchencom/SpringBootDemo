package com.greedystar.springbootdemo.modules.role.service;

import com.greedystar.springbootdemo.modules.role.dao.RoleDao;
import com.greedystar.springbootdemo.modules.role.entity.Role;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* Author GreedyStar
* Date  2019-01-25
*/
@Service
public class RoleService {
    @Autowired
    private RoleDao roleDao;

    public Role get(String id){
        return roleDao.get(id);
    }

    public List<Role> findList(Role role) {
        return roleDao.findList(role);
    }

    public List<Role> findAllList() {
        return roleDao.findAllList();
    }

    public int insert(Role role) {
        return roleDao.insert(role);
    }

    public int insertBatch(List<Role> roles){
        return roleDao.insertBatch(roles);
    }

    public int update(Role role) {
        return roleDao.update(role);
    }

    public int delete(Role role) {
        return roleDao.delete(role);
    }

}
