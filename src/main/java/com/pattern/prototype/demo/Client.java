package com.pattern.prototype.demo;

public class Client {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 创建一个原型类对象（具体的
        Realizetype realizetype = new Realizetype();

        // 调用原型类中的clone方法进行克隆
        Realizetype clone = realizetype.clone();

        // 不是一个对象，且构造器只调用了一次（构造器中的文案只输出了一次） 所以这个新对象不是new出来的，是克隆出来的。 jdk已经帮我们实现了一半的克隆
        // JDK已经定义好了抽象原型接口（Cloneable）
        System.out.println("原型对象和克隆出来的对象是否是同一个对象？" + (realizetype == clone));
    }
}
