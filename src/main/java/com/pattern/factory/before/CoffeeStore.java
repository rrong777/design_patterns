package com.pattern.factory.before;

public class CoffeeStore {
    public Coffee orderCoffee(String type) {
        // 生命Coffee类型的变量，根据不同类型创建不同的Coffee子类对象
        Coffee coffee = null;
        if("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("对不起，您所点的咖啡没有！");
        }
        // 加配料，因为点的肯定是成品的咖啡
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
