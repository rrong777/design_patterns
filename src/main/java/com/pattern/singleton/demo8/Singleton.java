package com.pattern.singleton.demo8;

/**
 * 懒汉式：双重检查锁方式
 */
public class Singleton {
    // 私有构造方法
    private Singleton(){}

    // 声明Singleton类型的变量
    // volatile 保证可见性；禁止指令重排，禁止指令重排之后就解决了双重检查锁方式可能在多线程环境下引起的空指针问题。
    private static volatile Singleton instance;

    // 对外提供公共的访问方式
    private static Singleton getInstance() {
        // 第一次判断,如果instance的值不为null 不需要抢占锁，直接返回对象，提高效率
        if(instance == null) {
            synchronized (Singleton.class) {
                // 第二次判断，因为进入同步代码块之前，还是有线程安全问题，进来再判断一次，如果 = null 就创建/
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }
}
