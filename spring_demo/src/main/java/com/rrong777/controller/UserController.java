package com.rrong777.controller;

import com.rrong777.framework.context.ApplicationContext;
import com.rrong777.framework.context.support.ClassPathXmlApplicationContext;
import com.rrong777.service.UserService;


public class UserController {
    public static void main(String[] args) throws Exception {
        // 1. 创建Spring的容器对象
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
        // 2. 从容器对象中获取UserService对象
        UserService userService = applicationContext.getBean("userService", UserService.class);
        // 3. 调用userService的方法进行业务逻辑处理
        userService.add();;
    }
}
