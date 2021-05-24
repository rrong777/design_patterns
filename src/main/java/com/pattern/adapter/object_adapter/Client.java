package com.pattern.adapter.object_adapter;

/**
 * 客户端 使用tf卡 给电脑（需要用适配器才能使用）  比如人使用电脑，我是typec的口，也需要一个适配器去接屏幕
 */
public class Client {
    public static void main(String[] args) {
        // 创建计算机对象
        Computer computer = new Computer();
        // 读取sd卡中的数据
        String msg = computer.readSD(new SDCardImpl());
        System.out.println(msg);

        // 华丽的分割线
        System.out.println("===============");
        // 使用电脑去读取tf卡中的数据
        String msg1 = computer.readSD(new SDAdapterTF(new TFCardImpl()));
        System.out.println(msg1);
    }
}
