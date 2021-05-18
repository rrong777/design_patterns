package com.principles.demo2.after;



public class RectangleDemo {
    public static void main(String[] args) {
        // 创建长方形对象
        Rectangle r = new Rectangle();
        r.setLength(20);
        r.setWidth(10);
        // 扩宽 正方形和长方形没有父子关系了，现在这个方法只能传递长方形
        RectangleDemo.resize(r);
        // 打印
        RectangleDemo.printLengthAndWidth(r);
        System.out.println("==================================");

    }
    /**
     * 拓宽方法
     */
    public static void resize(Rectangle rectangle) {
        // 如果长方形的宽小于等于长，进行拓宽操作
        while (rectangle.getWidth() <= rectangle.getLength()) {
            rectangle.setWidth(rectangle.getWidth() + 1);
        }
    }
    // 打印长宽
    public static void printLengthAndWidth(Quadrilateral quadrilateral) {
        System.out.println("长: " + quadrilateral.getLength());
        System.out.println("宽: " + quadrilateral.getWidth());
    }
}
