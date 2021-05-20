package com.pattern.factory.simple_factory;

/**
 * 咖啡店已经不依赖于具体的咖啡产品了。解除了咖啡店和具体产品对象的耦合
 */
public class CoffeeStore {
    public Coffee orderCoffee(String type) {
        SimpleCoffeeFactory factory = new SimpleCoffeeFactory();
        // 调用生产咖啡的方法
        Coffee coffee = factory.createCoffee(type);
        // 加配料，因为点的肯定是成品的咖啡
        coffee.addMilk();
        coffee.addSugar();
        return coffee;
    }
}
