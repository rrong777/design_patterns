package com.pattern.observer;

/**
 * 具体观察者角色类
 */
public class WexinUser implements Observer {
    private String name;// 微信用户名

    public WexinUser(String name) {
        this.name = name;
    }

    @Override
    public void update(String message) {
        // 谁接收到了消息
        System.out.println(name + "-" + message);
    }
}
