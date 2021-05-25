package com.rrong777.dao.impl;

import com.rrong777.dao.UserDao;

/**
 * 数据访问层实现类
 */
public class UserDaoImpl implements UserDao {
    private String username;
    private String password;

    // 我们自己的ioc容器只实现了setter注入，所以要提供一个setter方法
    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserDaoImpl() {
        System.out.println("userDao被创建了");
    }

    @Override
    public void add() {
        System.out.println("UserDao。。。。" + username + "==" + password);
    }
}
