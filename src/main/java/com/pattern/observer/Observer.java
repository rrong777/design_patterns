package com.pattern.observer;

/**
 * 抽象观察者接口
 */
public interface Observer {
    // msg更新的内容，或者说主题推送的内容
    void update(String message);
}
