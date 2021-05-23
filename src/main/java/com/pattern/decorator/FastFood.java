package com.pattern.decorator;

/**
 * 快餐类 抽象构件
 */
public abstract class FastFood {
    private float price;// 价格
    private String desc;// 描述
    public FastFood() {}

    public FastFood(float price, String desc) {
        this.price = price;
        this.desc = desc;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getDesc() {
        return desc;
    }

    public void setDesc(String desc) {
        this.desc = desc;
    }
    // 计算价格的方法
    // 抽象类可以有抽象方法可以有具体方法，而接口中全部是public abstarct的方法，所以这两个可以省写。
    public abstract float cost();
}
