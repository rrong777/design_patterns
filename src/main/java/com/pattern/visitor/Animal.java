package com.pattern.visitor;

/**
 * 抽象元素角色接口
 */
public interface Animal {
    // j接受访问者访问的功能
    void accept(Person person);
}
