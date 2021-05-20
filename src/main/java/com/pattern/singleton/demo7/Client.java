package com.pattern.singleton.demo7;

import java.io.*;

/**
 * 测试反射破坏单例模式
 */
public class Client {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
//        writeObject2File(); 将这个对象写到本地
        readObjectFromFile(); // 读到本地即可
        readObjectFromFile(); // 读两次。都会打印，你会发现两次读一个 已经不是同一个了。单例模式已经被破坏了
    }

    // 向文件中读数据（对象）
    public static void readObjectFromFile() throws IOException, ClassNotFoundException {
//        1. 创建对象输入流对象
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("C:\\Users\\dell\\Desktop\\a.txt"));
        // 2. 读取对象
        Singleton instance = (Singleton) ois.readObject();
        System.out.println(instance);
        // 3. 释放资源
        ois.close();
    }

    // 向文件中写数据（对象）
    public static void writeObject2File() throws IOException {
        // 1. 获取Singleton对象
        Singleton instance = Singleton.getInstance();
        // 2. 创建对象输出流对象
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("C:\\Users\\dell\\Desktop\\a.txt"));
        // 3. 写对象
        oos.writeObject(instance);
        oos.close();
    }
}
