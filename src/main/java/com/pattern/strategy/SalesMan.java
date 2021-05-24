package com.pattern.strategy;

/**
 * 促销员。环境类 聚合策略类
 */
public class SalesMan {
    // 聚合策略类对象
    private Strategy strategy;

    public SalesMan(Strategy strategy) {
        // 我不知道你到底要用哪种促销策略，所以我提供构造器给你自己聚合
        this.strategy = strategy;
    }
    // 由促销员展示促销活动给普通用户
    public void salesManShow() {
        strategy.show();
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public void setStrategy(Strategy strategy) {
        this.strategy = strategy;
    }
}
