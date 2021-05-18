package com.principles.demo2.after;

import com.principles.demo2.before.Rectangle;

/**
 * 正方形
 */
public class Square implements Quadrilateral {
    // 边长
    private double side;

    // getter / setter
    public double getSide() {
        return side;
    }

    public void setSide(double side) {
        this.side = side;
    }

    // 正方形而言 长和宽是相等的，获得长和宽返回边长即可
    @Override
    public double getLength() {
        return this.side;
    }

    @Override
    public double getWidth() {
        return this.side;
    }
}
