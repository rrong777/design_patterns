package com.pattern.strategy;

/**
 * 具体策略类（促销活动） 封装算法
 */
public class StrategyC implements Strategy{
    @Override
    public void show() {
        System.out.println("满1000 加一元换购价值200产品");
    }
}
