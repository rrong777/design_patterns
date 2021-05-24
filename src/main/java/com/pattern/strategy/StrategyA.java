package com.pattern.strategy;

/**
 * 具体策略类（促销活动） 封装算法
 */
public class StrategyA implements Strategy{
    @Override
    public void show() {
        System.out.println("买一送一！");
    }
}
