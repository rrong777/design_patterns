package com.pattern.visitor;

/**
 * 具体访问者角色类
 * 宠物的所有者
 */
public class Owner implements Person {
    @Override
    public void feed(Cat cat) {
        System.out.println("主人喂食猫");
    }

    @Override
    public void feed(Dog dog) {
        System.out.println("主人喂食狗");

    }
}
