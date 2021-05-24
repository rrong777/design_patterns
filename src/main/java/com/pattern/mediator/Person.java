package com.pattern.mediator;

/**
 * 抽象同事类
 */
public abstract class Person {
    // 子类都有的，可以复用的 protected，人都有名字。
    protected String name;
    // 中介
    protected Mediator mediator;

    public Person(String name, Mediator mediator) {
        this.name = name;
        this.mediator = mediator;
    }
}
