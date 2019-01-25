package com.greedystar.springbootdemo.modules.role.dao;

import com.greedystar.springbootdemo.modules.role.entity.Role;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
* Author GreedyStar
* Date  2019-01-25
*/
public interface RoleDao {

    public Role get(String id);

    public List<Role> findList(Role role);

    public List<Role> findAllList();

    public int insert(Role role);

    public int insertBatch(List<Role> roles);

    public int update(Role role);

    public int delete(Role role);

}