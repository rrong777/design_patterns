package com.pattern.factory.factory_method;

/**
 * 具体工厂角色，拿铁咖啡工厂。专门用来生产拿铁咖啡
 */
public class LatteCoffeeFactory implements CoffeeFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }
}
