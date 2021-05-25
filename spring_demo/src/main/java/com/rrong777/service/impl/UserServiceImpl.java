package com.rrong777.service.impl;

import com.rrong777.dao.UserDao;
import com.rrong777.service.UserService;

/**
 * 业务逻辑层实现类
 */
public class UserServiceImpl implements UserService {
    public UserServiceImpl() {
        System.out.println("userService被创建了");
    }

    // 声明一个UserDao类型的变量
    // 并没有赋值，赋值操作交给Spring去操作
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void add() {
        System.out.println("UserService....");
        userDao.add();
    }
}
