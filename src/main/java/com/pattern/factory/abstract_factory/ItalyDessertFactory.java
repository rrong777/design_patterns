package com.pattern.factory.abstract_factory;

/**
 * 意式风味甜品工厂，具体工厂，生产拿铁咖啡和提拉米苏甜品
 */
public class ItalyDessertFactory implements DessertFactory{
    @Override
    public Coffee createCoffee() {
        return new LatteCoffee();
    }

    @Override
    public Dessert createDessert() {
        return new TiramisuDessert();
    }
}
