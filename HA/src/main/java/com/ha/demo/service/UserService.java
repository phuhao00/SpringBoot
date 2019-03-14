package com.ha.demo.service;
import com.ha.demo.entity.User;
public interface UserService {
    public User getUserById(int userId);
    boolean addUser(User record);
}
