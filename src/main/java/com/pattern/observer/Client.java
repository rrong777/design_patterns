package com.pattern.observer;

public class Client {
    public static void main(String[] args) {
        // 1. 创建公众号对象
        SubscriptionSubject subject = new SubscriptionSubject();
        // 2. 订阅公众号（把观察者加到主题对象的用户集合中）
        subject.attach(new WexinUser("孙悟空"));
        subject.attach(new WexinUser("猪悟能"));
        subject.attach(new WexinUser("沙悟净"));

        // 3. 公众号更新，发出消息给订阅（观察者对象）
        // 你这里通知了，观察者就自动更新了，当然你要提供一个观察者更新的接口让我去调用。
        subject.notify("传智黑马的专栏更新了");
    }
}
