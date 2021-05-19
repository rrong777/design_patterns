package com.pattern.singleton.demo1;

/**
 * 单例模式，某个类只有一个实例，那么就要求构造器私有，外界无法通过构造器创建对象，在类中自己初始化这个对象，因为单例的，所有人共享的，所以是静态的
 * 提供一个共有的方法获取这个对象
 * 饿汉式：静态成员变量方式
 */
public class Singleton {
    // 1.私有构造方法，外界无法创建对象
    private Singleton() {}

    // 2. 在本类中提供一个对象
    private static Singleton instance = new Singleton();

    // 3. 提供一个公共的访问方式，让外界获取这个方法。
    public static Singleton getInstance() {
        return instance;
    }
}
