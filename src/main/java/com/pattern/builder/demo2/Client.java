package com.pattern.builder.demo2;

public class Client {
    public static void main(String[] args) {
        // 创建手机对象 通过构建者对象获取手机对象。
        // 原始的构建模式，构建的顺序是由指挥者来定，这种构建模式，把构建的顺序交给客户来定。你想怎么构建都可以。
        Phone phone = new Phone.Builder()
                .cpu("Intel")
                .screen("三星屏幕")
                .mainBoard("华硕主板")
                .memory("金士顿内存条")
                .build();
    }
}
