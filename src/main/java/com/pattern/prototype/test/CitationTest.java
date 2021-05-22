package com.pattern.prototype.test;

public class CitationTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        // 1. 创建原型对象
        Citation citation = new Citation();
        // 创建张三、李四两个学生
        Student stu = new Student();
        stu.setName("张三");
        citation.setStudent(stu);

        // 2. 克隆奖状对象
        Citation clone = citation.clone();
        citation.getStudent().setName("李四");
        // 这里的name是String，也是引用变量，引用变量在浅克隆的时候，是没有被克隆一份的，还是指向原有的引用。相当于重新赋值。
        // 但是包括String Integer在内的引用对象，是final修饰的，无法被重新赋值，每一次赋值相当于是指向堆上的一个新的对象。
        // clone.setName("张三") 之后。citation.show() 出来也是张三。但是这两个 张三字符串 == 是不相同的。
//        clone.setName("张三");
//        citation.setName("李四");
        // 两个show出来的名字是一样的，浅克隆，并没有把Student对象克隆一份。
        clone.show();
        citation.show();
    }
}
