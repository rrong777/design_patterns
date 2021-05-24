package com.pattern.factory.abstract_factory;

public class Client {
    public static void main(String[] args) {
        // 创建意式风味甜品工厂，出来的咖啡就是拿铁 甜品就是提拉米苏

//        DessertFactory factory = new ItalyDessertFactory();
        // 创建美式风味甜品工厂，出来的就是美式咖啡和抹茶慕斯
        DessertFactory factory = new AmericanDessertFactory();
        Coffee coffee = factory.createCoffee();
        Dessert dessert = factory.createDessert();
        System.out.println(coffee.getName());
        dessert.show();
    }
}
