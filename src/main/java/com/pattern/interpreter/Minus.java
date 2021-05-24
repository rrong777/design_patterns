package com.pattern.interpreter;

/**
 * 减法表达式
 * 表达式中 继承了抽象表达式 又聚合了抽象表达式 ，就是递归递归必须有出口，出口就是变量，如果抽象表达式是变量，就调用getValue的值出去。如果是非终结表达式，又调用了其他表达式的interpret方法。
 */
public class Minus extends AbstractExpression {
    // -号左边的表达式
    private AbstractExpression left;
    // -号右边的表达式
    private AbstractExpression right;

    public Minus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }
    // 减法表达式，它的文法规则就是将左边表达式和右边表达式相减 interpret就是文法规则
    @Override
    public int interpret(Context context) {
        // 将左边表达式结果和右边表达式结果进行相减
        // 递归调用啊
        return left.interpret(context) - right.interpret(context);
    }

    // 又是递归
    @Override
    public String toString() {
        return "(" + left.toString() + " - " + right.toString() + ")";
    }
}
