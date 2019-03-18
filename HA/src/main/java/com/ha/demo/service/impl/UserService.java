package com.ha.demo.service.impl;

import com.ha.demo.entity.User;
import com.ha.demo.entity.UserDao;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service("userService")
public class UserService implements com.ha.demo.service.UserService {
    @Resource
    private UserDao userDao;
    @Override
    public User getUserById(int userId) {
        return userDao.selectByPrimaryKey(userId);
    }
    @Override
    public boolean addUser(User record) {
        boolean result = false;
        try {
            userDao.insertSelective(record);
            result = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return result;
    }
    @Override
    public List<User> allUser(){
       return userDao.selectAll();
    }
}
