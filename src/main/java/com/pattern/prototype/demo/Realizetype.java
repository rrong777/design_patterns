package com.pattern.prototype.demo;

/**
 * Cloneable 抽象原型类
 * Realizetype 具体原型类
 */
public class Realizetype implements Cloneable{
    public Realizetype() {
        System.out.println("具体原型对象创建完成！");
    }

    /**
     * clone()方法在Cloneable接口中声明的是protect的
     * 重写方法 修饰符 不小于 被重写的方法即可
     * 原型模式，实现Cloneable接口，重写clone方法，调用即可实现原型模式
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    public Realizetype clone() throws CloneNotSupportedException {
        System.out.println("具体原型复制成功！");
        return (Realizetype) super.clone();
    }
}
