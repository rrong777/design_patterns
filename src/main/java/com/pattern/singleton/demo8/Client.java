package com.pattern.singleton.demo8;

import java.lang.reflect.Constructor;

/**
 * 测试反射破坏单例模式
 * 反射是如何破解单例模式的？
 *  通过反射获取私有的构造方法。然后通过私有的构造方法去创建对象。
 *  如何解决？ 如果是第一次调用，我就允许你去创建对象，instance为null的话，就是第一次调用，不为null ，证明之前已经调用过构造器。
 *  这时候在构造器内，抛出异常即可。
 */
public class Client {
    public static void main(String[] args) throws Exception {
        // 1. 获取Singleton的字节码对象
        Class clazz = Singleton.class;
        // 2. 获取无参构造方法 你要获取私有的，都要用getDeclaredXxx();
        Constructor cons = clazz.getDeclaredConstructor();
        // 3. 取消访问检查
        cons.setAccessible(true);
        // 4. 创建Singleton对象
        Singleton instance1 = (Singleton) cons.newInstance();
        Singleton instance2 = (Singleton) cons.newInstance();

        // false 单例模式被破坏
        System.out.println(instance1 == instance2);
    }
}
