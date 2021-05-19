package com.pattern.singleton.demo1;

public class SingletonTest {
    public static void main(String[] args) {
        // 1. 创建Singleton的对象
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        // 2. 判断两个对象是否相等
        System.out.println(instance1 == instance2);
    }
}
