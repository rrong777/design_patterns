package com.pattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * 对象结构类，家
 */
public class Home {
    // 声明一个集合用来存储元素对象
    private List<Animal> nodeList = new ArrayList<>();

    // 添加元素的功能
    public void add(Animal animal) {
        nodeList.add(animal);
    }

    // 对象结构类，家，接收访问者访问
    public void action(Person person) {
        // 遍历集合获取每一个元素对象让访问者访问每一个元素
        for (Animal animal : nodeList) {
            animal.accept(person);
        }
    }
}
