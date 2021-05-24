package com.atguigu.priciples.liskov;

public class Liskov {
    public static void main(String[] args) {
        A a = new A();
        System.out.println("11-3=" + a.func1(11, 3));
        System.out.println("1-8=" + a.func1(1, 8));
        System.out.println("--------------------------------------");
        B b = new B();
        // 无意间把父类的func重写了，但是有可能没意识到。 前两个本意是调用父类的func1  因为你不小心重写了
        // 这种重写可能是无意识的。甚至有些傻逼以为你调用的还是父类的。牵强。
        System.out.println("11-3=" + b.func1(11, 3));
        System.out.println("1-8=" + b.func1(1, 8));
        System.out.println("11+3+9=" + b.func2(11, 3));
    }
}
// A类
class A {
    // 返回两个数的差
    public int func1(int num1, int num2) {
        return num1 - num2;
    }
}
// B类
// 增加了一个新的功能，完成两个数相加，然后和9求和。
class B extends A {
    // 无意间把父类的func重写了，但是有可能没意识到。
    public int func1(int a, int b) {
        return a + b;
    }
    public int func2(int a, int b) {
        return func1(a, b) + 9;
    }
}
