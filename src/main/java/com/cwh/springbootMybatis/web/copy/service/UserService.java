package com.cwh.springbootMybatis.web.copy.service;

import java.util.List;

import com.cwh.springbootMybatis.web.copy.entity.User;


public interface UserService {
    public List<User> getUserInfo();
    
    public void insert(User user);
}
