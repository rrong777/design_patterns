package com.principles.demo2.error;

/**
 * 正方形
 */
public class Square extends Rectangle {
    /**
     * 重写父类的setLength()和setWidth(); 正方形长宽一样，这里设置长设置宽把两个都设置一下就可以了
     * @param length
     */
    @Override
    public void setLength(double length) {
        super.setLength(length);
        super.setWidth(length);
    }

    @Override
    public void setWidth(double width) {
        super.setLength(width);
        super.setWidth(width);
    }
}
