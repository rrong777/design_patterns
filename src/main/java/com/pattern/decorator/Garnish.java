package com.pattern.decorator;

/**
 * 抽象装饰者角色
 * 装饰类 装饰的就是快餐，所以要继承快餐
 * 你是抽象的，你具体加什么配料你自己是不知道的，不明确价格无法计算，声明成抽象类即可
 */
public abstract class Garnish extends FastFood {
    // 声明快餐类的变量
    private FastFood fastFood;

    public FastFood getFastFood() {
        return fastFood;
    }

    public void setFastFood(FastFood fastFood) {
        this.fastFood = fastFood;
    }

    // 装饰者类，首先你要装饰，就是要往原来的上面加，你要往原来的上面加，你自己也得和原来的类型一样
    // 就像你现在要装饰快餐（FastFood） 你自己必须是快餐，你他妈别最后装饰一坨屎上去，不一样的东西。所以表明你自己是同种类的，继承就好
    // 继承FastFood表示自己也是快餐中的一种，而聚合的FastFood是我要装饰的构件。这里的price和desc是装饰者（鸡蛋）的价格和描述
    public Garnish(FastFood fastFood, float price, String desc) {
        super(price, desc);
        this.fastFood = fastFood;
    }
}
