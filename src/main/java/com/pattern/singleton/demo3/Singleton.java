package com.pattern.singleton.demo3;

/**
 * 懒汉式，同步方法方式（效率低。getInstance大部分是写操作）
 */
public class Singleton {
    // 私有构造方法
    private Singleton(){}
    // 生命Singleton类型变量instance，只是声明变量。并未初始化。
    private static Singleton instance;
    // 对外提供访问方式
    public static synchronized Singleton getInstance(){
        // 如果instance为null  说明还没有初始化instance对象。
        if(instance == null) {
            // 存在一个问题，两个线程，如果线程1判断instance是否为null的时候。instance为null，进入判断，进入判断马上让出cpu执行权，线程2再次判断，此时instance
            // 并没有初始化 线程2 又进来，对instance完成初始化，线程2 结束，线程1继续，在线程2 开始前线程1就进入了，再次对instance重新赋值。这时候两次instance已经是两个对象了。

            // 解决方法，将方法声明为synchronized 同步方法。同步方法，如果有线程执行这个方法，那么就持有这个方法的锁，没有执行完线程就不会释放锁。即使cpu执行权释放，其他线程没有锁也进不来，
            // 只能等待这个方法执行完。
            instance = new Singleton();
        }
        // 如果有 直接返回即可
        return instance;
    }

}
