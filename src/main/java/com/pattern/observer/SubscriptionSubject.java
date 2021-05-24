package com.pattern.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 具体主题角色类
 */
public class SubscriptionSubject implements Subject{
    // 定义一个集合 用来存储多个观察者对象 公众号是具体主题，微信用户就是观察者，公众号有推新的，微信用户就能接收到
    private List<Observer> weixinUserList = new ArrayList<>();
    @Override
    public void attach(Observer observer) {
        weixinUserList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        weixinUserList.remove(observer);
    }

    @Override
    public void notify(String message) {
        // 公众号内容发生变化的时候，执行这个方法通知所有观察者对象自动调用update方法
        // 遍历结合
        for (Observer observer : weixinUserList) {
            // 调用观察者对象中的update方法
            observer.update(message);
        }
    }
}
