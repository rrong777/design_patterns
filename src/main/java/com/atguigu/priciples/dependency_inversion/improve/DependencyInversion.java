package com.atguigu.priciples.dependency_inversion.improve;

public class DependencyInversion {
    public static void main(String[] args) {
        // 客户端无需任何改变
        Person person = new Person();
        person.receive(new Email());
        person.receive(new Wechat());
    }
}
interface IReceiver {
    public String getInfo();
}

// 方式2 顶级模块依赖的是抽象，接口没有变化，细节发生变化没有影响。
class Person {
    public void receive(IReceiver receiver) {
        System.out.println(receiver.getInfo());
    }
}
// 增加微信
class Wechat implements IReceiver {
    @Override
    public String getInfo() {
        return "wechat: hello world!";
    }
}

// 电子邮件类
class Email implements IReceiver {
    public String getInfo() {
        return "电子邮件信息： hello! world";
    }
}