package com.pattern.factory.config_factory;

public class Client {
    public static void main(String[] args) {
        CoffeeFactory factory = new CoffeeFactory();
        Coffee ameirican = factory.createCoffee("american");
        System.out.println(ameirican.getName());
        System.out.println("==================================");
        Coffee latte = factory.createCoffee("latte");
        System.out.println(latte.getName());
    }
}
