package com.pattern.decorator;

/**
 * 炒饭类，具体构件角色
 */
public class FriedRice extends FastFood{
    public FriedRice() {
        // 价格和描述是所有快餐都有的，不论你是炒饭还是炒面，直接声明在抽象中大家都有即可
        super(10, "炒饭");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
