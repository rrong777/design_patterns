package com.pattern.interpreter;

/**
 * 加法表达式
 */
public class Plus extends AbstractExpression {
    // +号左边的表达式
    private AbstractExpression left;
    // +号右边的表达式
    private AbstractExpression right;

    public Plus(AbstractExpression left, AbstractExpression right) {
        this.left = left;
        this.right = right;
    }

    // 加法表达式，它的文法规则就是将左边表达式和右边表达式相加 interpret就是文法规则
    @Override
    public int interpret(Context context) {
        // 将左边表达式结果和右边表达式结果进行相加
        // 递归调用啊
        return left.interpret(context) + right.interpret(context);
    }

    // 又是递归
    @Override
    public String toString() {
        return "(" + left.toString() + " + " + right.toString() + ")";
    }
}
