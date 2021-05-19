package com.pattern.singleton.demo5;

/**
 * 懒汉式：静态内部类方式
 */
public class Singleton {
    // 私有构造方法
    private Singleton(){}

    // 定义一个静态内部类
    private static class SingletonHolder {
        // 在内部类中声明并初始化外部类对象.防止外界对这个变量进行修改，写成final的，就无法修改了。无法重新赋值
        // 并且这个静态内部类只会在使用的时候才会加载。所以也是懒汉式
        // 被final修饰了，其实就是一个常量，只有在使用到静态内部类的方法或者属性的时候才会去加载。加载这个类的时候就会对内部类的final静态变量进行初始化。
        private static final Singleton INSTANCE = new Singleton();
    }
    // 提供公共的访问方式
    public static Singleton getInstance() {
        // 调用静态内部类的属性的时候会加载这个类，并且初始化INSTANCE对象，只会初始化一次
        return  SingletonHolder.INSTANCE;
    }
}
