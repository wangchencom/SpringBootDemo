package com.greedystar.springbootdemo.modules.user.entity;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;

/**
 * Author GreedyStar
 * Date  2019-01-25
 */
public class User implements Serializable {
    private static final long serialVersionUID = 1L;
    private String id;
    private String username;
    private String password;
    private Timestamp createTime;

    public User() {
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setCreateTime(Timestamp createTime) {
        this.createTime = createTime;
    }

    public Timestamp getCreateTime() {
        return createTime;
    }

}