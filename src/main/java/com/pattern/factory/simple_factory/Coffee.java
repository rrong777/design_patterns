package com.pattern.factory.simple_factory;

/**
 * 咖啡类
 */
public abstract class Coffee {
    // 而咖啡的名字是不一样的
    public abstract String getName();
    // 基本所有咖啡都需要加糖和加奶 那就抽取出来当公共的
    /**
     * 加糖
     */
    public void addSugar() {
        System.out.println("加糖");
    }
    /**
     * 加奶
     */
    public void addMilk() {
        System.out.println("加奶");
    }
}
