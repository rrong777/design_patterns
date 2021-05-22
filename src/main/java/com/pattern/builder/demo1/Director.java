package com.pattern.builder.demo1;

/**
 * 指挥者
 */
public class Director {
    // 声明builder类型的变量
    private Builder builder;

    // 什么时候进行赋值，创建Director对象的时候进行赋值
    public Director(Builder builder){
        this.builder = builder;
    }
    // 组装自行车的功能
    public Bike construct() {
        builder.buildFrame();
        builder.buildSeat();
        return builder.createBike();
    }
}
