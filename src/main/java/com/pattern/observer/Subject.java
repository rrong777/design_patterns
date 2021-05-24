package com.pattern.observer;

/**
 * 抽象主题接口
 */
public interface Subject {
    // 添加订阅者（观察者）对象
    void attach(Observer observer);

    // 删除订阅者
    void detach(Observer observer);

    // 通知订阅者更新消息
    void notify(String message);
}
