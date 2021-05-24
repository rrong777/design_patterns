package com.pattern.interpreter;

/**
 * 变量类 用于封装变量的类
 */
public class Variable extends AbstractExpression{
    // 声明存储变量名的成员变量
    private String name;

    public Variable(String name) {
        this.name = name;
    }
    // interpret解释，这个方法就是用来计算的
    // 对于变量来说 文法规则就是直接返回变量  每一种文法规则都定义对应的类  。如果要定义一个乘法文法规则，只要让他继承抽象表达式类就可以了。
    @Override
    public int interpret(Context context) {
        // 如果表达式是变量，直接返回变量  解释器模式，就是用解释器解释一系列符合语法规范的表达式。你自己要定义语法。
        // 变量的值是存储在context里面的
        return context.getValue(this);
    }

    @Override
    public String toString() {
        return name; // 返回变量的名称即可
    }
}
