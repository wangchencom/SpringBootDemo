package com.greedystar.springbootdemo.modules.user.service;

import com.greedystar.springbootdemo.modules.user.dao.UserDao;
import com.greedystar.springbootdemo.modules.user.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
* Author GreedyStar
* Date  2019-01-25
*/
@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public User get(String id){
        return userDao.get(id);
    }

    public List<User> findList(User user) {
        return userDao.findList(user);
    }

    public List<User> findAllList() {
        return userDao.findAllList();
    }

    public int insert(User user) {
        return userDao.insert(user);
    }

    public int insertBatch(List<User> users){
        return userDao.insertBatch(users);
    }

    public int update(User user) {
        return userDao.update(user);
    }

    public int delete(User user) {
        return userDao.delete(user);
    }

}
