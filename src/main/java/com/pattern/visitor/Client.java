package com.pattern.visitor;

public class Client {
    public static void main(String[] args) {
        // 创建home对象
        Home home = new Home();
        // 给结构对象（Home）添加元素（给家里买宠物）
        home.add(new Dog());
        home.add(new Cat());

        // 创建主人对象 现在的访问者是主人，去访问了所有结构对象中的元素对象，访问者在结构对象中访问元素对象，元素对象和访问对象直接解耦了。
        Owner owner = new Owner();
        // 让主人喂食所有宠物
        home.action(owner);
    }
}
