package com.principles.demo2.error;

public class RectangleDemo {
    public static void main(String[] args) {
        // 创建长方形对象
        Rectangle r = new Rectangle();
        // 设置长宽
        r.setLength(20);
        r.setWidth(10);

        // 进行扩宽操作
        RectangleDemo.resize(r);
        RectangleDemo.printLengthAndWidth(r);
        System.out.println("=======================================");
        // 里氏代换原则，这里我传长方形可以，那我传正方形可以不？ 按道理来说是可以的。但是实际这里不行
        // 里氏代换原则是基类可以使用的地方，子类也可以使用。违反了里氏代换原则，在程序中 正方形不是长方形，所以继承关系不成立。
        // 违反了里氏代换原则，我们要对类，还有类和类之间的关系进行重新设计。
        Square s = new Square();
        s.setLength(20);

        // resize 宽小于等于的时候 重新设置宽，但是正方形的宽无论何时都是等于长的。设置长宽任意一个，都会把另一个设置了。死循环
        RectangleDemo.resize(s);
        RectangleDemo.printLengthAndWidth(s);
    }

    /**
     * 拓宽方法
     */
    public static void resize(Rectangle rectangle) {
        // 长方形的长要大于宽
        // 如果长方形的宽小于等于长，进行拓宽操作
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }
    // 打印长宽
    public static void printLengthAndWidth(Rectangle rectangle) {
        System.out.println("长: " + rectangle.getLength());
        System.out.println("宽: " + rectangle.getWidth());
    }
}
