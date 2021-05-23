package com.pattern.decorator;

/**
 * 具体的装饰者类 培根类
 */
public class Bacon extends Garnish {
    public Bacon(FastFood fastFood) {
        super(fastFood, 3, "培根");
    }

    /**
     * 计算价格
     * @return
     */
    @Override
    public float cost() {
        // 我要计算我的价格，再计算快餐的价格
        return getPrice() + getFastFood().cost();
    }

    @Override
    public String getDesc() {
        // 自己的描述，还有聚合进来的快餐（被装饰者）的描述
        return super.getDesc() + getFastFood().getDesc();
    }
}
