package com.pattern.prototype.test;

public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 1. 创建原型对象
        Citation citation = new Citation();
        // 2. 克隆奖状对象
        Citation clone = citation.clone();
        clone.setName("张三");
        citation.setName("李四");
        clone.show();
        citation.show();
    }
}
