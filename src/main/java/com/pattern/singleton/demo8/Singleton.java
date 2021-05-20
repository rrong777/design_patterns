package com.pattern.singleton.demo8;

/**
 * 懒汉式：双重检查锁方式
 */
public class Singleton {
    private static boolean flag = false;
    private Singleton(){
        synchronized (Singleton.class) {
            // 判断flag的值是否是true，如果是true 说明非第一次访问，直接抛一个异常。抛异常调用构造器也没办法创建对象了
            if(flag){
                throw new RuntimeException("不能创建多个对象！");
            }
            flag = true;
        }
    }


    private static volatile Singleton instance;

    private static Singleton getInstance() {
        if(instance == null) {
            synchronized (Singleton.class) {
                if(instance == null) {
                    instance = new Singleton();
                }
            }
        }

        return instance;
    }
}
