package com.pattern.factory.before;

/**
 * 问题 CoffeeStore这个类中，依赖具体的AmericanCoffee和LatteCoffee类，如果后期再加卡布奇诺，或者其他咖啡，势必要改变里面的代码
 * 这就违反了开闭原则，对修改关闭，扩展开放。
 * 如果直接new 对象，就会和具体的类耦合，咖啡店根据type直接new美式咖啡或拿铁咖啡，咖啡店和这两种咖啡类耦合。。
 */
public class Client {
    public static void main(String[] args) {
        // 创建咖啡店类
        CoffeeStore coffeeStore = new CoffeeStore();
        // 点咖啡
        Coffee coffee = coffeeStore.orderCoffee("american");
        System.out.println(coffee.getName());
    }
}
