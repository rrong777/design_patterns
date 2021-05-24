package com.pattern.command;

public class Client {
    public static void main(String[] args) {
        // 创建订单对象
        Order order1 = new Order();
        // 点餐桌号
        order1.setDiningTable(1);
        // 点餐
        order1.setFood("西红柿鸡蛋面", 1);
        order1.setFood("瓶装可乐", 2);

        Order order2 = new Order();
        // 点餐桌号
        order2.setDiningTable(2);
        order2.setFood("尖椒肉丝盖饭", 1);
        order2.setFood("瓶装雪碧", 1);

        // 创建接收者（厨师）对象
        SeniorChef receiver = new SeniorChef();
        // 包含了订单和命令对象
        OrderCommand command1 = new OrderCommand(receiver, order1);
        OrderCommand command2 = new OrderCommand(receiver, order2);

        // 创建调用者（服务员对象）
        Waitor invoke = new Waitor();
        invoke.setCommand(command1);
        invoke.setCommand(command2);

        // 让服务员发起命令
        invoke.orderUp();
    }
}
