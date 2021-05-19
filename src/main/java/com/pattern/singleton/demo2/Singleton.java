package com.pattern.singleton.demo2;

/**
 * 饿汉式实现方式2：静态代码块
 * 和方式1差别只是instance初始化的地方不一样，两种方式没什么区别
 */
public class Singleton {
    // 1.私有构造方法，外界无法创建对象
    private Singleton() {}

    // 2. 生命Singleton类型变量 并未显式初始化。初始值null
    private static Singleton instance;

    // 3. 静态代码块中初始化instance对象
    static {
        instance = new Singleton();
    }
    // 3. 提供一个公共的访问方式，让外界获取这个方法。
    public static Singleton getInstance() {
        return instance;
    }
}
