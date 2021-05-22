package com.pattern.builder.demo1;

public abstract class Builder {
    // 声明Bike类型的引用变量并赋值。提高代码复用性
    // MobileBuilder和OfoBuilder里面都要构建自行车，你肯定有一个自行车变量 定义在父类中 提高复用性
    // 这只是一个空壳，还没组装
    protected Bike bike = new Bike();

    // 构建车架
    public abstract void buildFrame();

    // 构建车架
    public abstract void buildSeat();

    public abstract Bike createBike();
}
