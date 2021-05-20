package com.pattern.factory.simple_factory;

/**
 * 简单咖啡工厂，提供一个方法，专门用来生产咖啡。
 *
 * 解除了咖啡店和具体咖啡的耦合，但是新增了咖啡工厂和具体咖啡的耦合，后期要增加新的咖啡也要来修改咖啡工厂的代码。
 *
 * 这样和咖啡店和咖啡耦合有什么不同？  因为不止咖啡店可以有咖啡，外卖可以有咖啡，奶茶店可以有咖啡。
 * 这样也降低了耦合。只是工厂耦合，而不是具体的业务耦合，后期扩展业务的时候也是引入简单工厂即可。不需要扩展的业务和咖啡耦合。修改代码也只需要修改一个地方即可
 *
 * 把对象的创建和业务逻辑分开，咖啡店点咖啡是我们的业务逻辑，创建具体咖啡对象是创建对象的过程，这两个解耦了。以后可以避免修改客户代码（咖啡店）
 */
public class SimpleCoffeeFactory {
    public Coffee createCoffee(String type) {
        // 生命Coffee类型的变量，根据不同类型创建不同的Coffee子类对象
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
