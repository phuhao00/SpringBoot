package com.ha.demo.service;
import com.ha.demo.entity.User;

import java.util.List;

public interface UserService {
    public User getUserById(int userId);
    boolean addUser(User record);
    List<User> allUser();
}
