package com.atguigu.priciples.dependency_inversion;

public class DependencyInversion {
    public static void main(String[] args) {
        Person person = new Person();
        person.receive(new Email());
    }
}
// 完成Person接收消息的功能
// 方式1分析
// 1. 简单，容易想到，容易实现
// 2. 如果我们获取的对象是微信，短信等，则新增类，同时Person也要增加相应的接收方法。要修改原有代码
// 3. 解决思路，引入抽象的接口：IReceiver表示接收者，这样person类与接口发生依赖。
//    因为Email、Wechat都属于接收的范围，各自实现IReceiver接口即可。这样就符合依赖倒转原则
class Person {
    public void receive(Email email) {
        System.out.println(email.getInfo());
    }
}
// 电子邮件类
class Email {
    public String getInfo() {
        return "电子邮件信息： hello! world";
    }
}