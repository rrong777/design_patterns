package com.pattern.command;

import java.util.Map;

/**
 * 具体命令类，下单命令
 */
public class OrderCommand implements Command {
    // 具体命令类持有接收者对象
    private SeniorChef receiver;
    // 持有订单，这个需求需要持有订单，你要下命令得让厨师知道你要做什么
    private Order order;

    public OrderCommand(SeniorChef receiver, Order order) {
        this.receiver = receiver;
        this.order = order;
    }

    @Override
    public void execute() {
        System.out.println(order.getDiningTable() + "桌的订单：");

        // 将订单order交给厨师取做饭
        Map<String, Integer> foodDir = order.getFoodDir();
        for (String foodName : foodDir.keySet()) {
            receiver.makeFood(foodName, foodDir.get(foodName));
        }
        // 做完了
        System.out.println(order.getDiningTable() + "桌的饭做好了");
    }
}
