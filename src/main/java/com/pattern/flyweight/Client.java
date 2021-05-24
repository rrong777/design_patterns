package com.pattern.flyweight;

public class Client {
    public static void main(String[] args) {
        // 获取I图形对象
        AbstractBox box1 = BoxFactory.getInstance().getShape("I");
        box1.display("灰色");
        // 获取O图形对象
        AbstractBox box2 = BoxFactory.getInstance().getShape("O");
        box1.display("红色");
        // 获取L图形对象
        AbstractBox box3 = BoxFactory.getInstance().getShape("L");
        box1.display("黄色");
        // 获取L图形对象
        AbstractBox box4 = BoxFactory.getInstance().getShape("L");
        box1.display("绿色");
        System.out.println("===========================================================");
        // 颜色不一样，但是对象是同一个对象。  形状是内部状态，共享 不可改变，颜色是外部状态，你随意改变
        System.out.println("两次获取倒的L图形是否是同一个对象：" + (box3 == box4));
    }
}
