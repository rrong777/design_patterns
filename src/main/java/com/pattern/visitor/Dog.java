package com.pattern.visitor;

/**
 * 具体元素角色类 宠物狗
 */
public class Dog implements Animal {
    @Override
    public void accept(Person person) {
        // person是访问者，访问者喂食当前对象
        person.feed(this);
        System.out.println("好好吃！汪汪汪。。。");
    }
}
