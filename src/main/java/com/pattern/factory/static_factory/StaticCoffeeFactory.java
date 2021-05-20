package com.pattern.factory.static_factory;

/**
 * 静态工厂只是将创建对象的方法设置为静态的。
 * 这样的话，其他客户就不用创建工厂对象，直接通过类名.createCoffee()即可
 */
public class StaticCoffeeFactory {
    public static Coffee createCoffee(String type) {
        Coffee coffee = null;
        if("american".equals(type)) {
            coffee = new AmericanCoffee();
        } else if("latte".equals(type)) {
            coffee = new LatteCoffee();
        } else {
            throw new RuntimeException("对不起，您所点的咖啡没有！");
        }
        return coffee;
    }
}
