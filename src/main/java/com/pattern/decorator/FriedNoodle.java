package com.pattern.decorator;

/**
 * 炒面类，具体构件角色
 */
public class FriedNoodle extends FastFood{
    public FriedNoodle() {
        super(12, "炒面");
    }

    @Override
    public float cost() {
        return getPrice();
    }
}
