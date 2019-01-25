package com.greedystar.springbootdemo.modules.role.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 * Author GreedyStar
 * Date  2019-01-25
 */
public class Role implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String name;
    private Timestamp createTime;

    public Role() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

}