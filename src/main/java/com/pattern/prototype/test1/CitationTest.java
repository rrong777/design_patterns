package com.pattern.prototype.test1;

import java.io.*;

/**
 * 对象流实现深克隆
 */
public class CitationTest {
    public static void main(String[] args) throws Exception {
        // 1. 创建原型对象
        Citation citation = new Citation();
        // 创建张三、李四两个学生
        Student stu = new Student();
        stu.setName("张三");
        citation.setStudent(stu);

        // 创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("src/main/resources/testOos/a.txt"));
        // 写对象 不止Citation需要序列化，Citation中还有学生，你序列化Citation的时候会把学生一起序列化了。学生类也要继承Serializable接口
        oos.writeObject(citation);
        // 释放资源
        oos.close();
        // 创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("src/main/resources/testOos/a.txt"));
        // 读取对象
        Citation citation1 = (Citation) ois.readObject();
        // 释放资源 包装流释放的时候 会释放包装流包裹的流（FileInputStream）
        ois.close();

        Student stu1 = citation1.getStudent();
        stu1.setName("李四");
        citation.show();
        citation1.show();
    }
}
