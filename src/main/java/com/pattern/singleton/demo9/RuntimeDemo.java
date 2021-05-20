package com.pattern.singleton.demo9;

import java.io.IOException;
import java.io.InputStream;

public class RuntimeDemo {
    public static void main(String[] args) throws IOException {
        // 获取Runtime类的对象 Runtime也是单例模式
        Runtime runtime = Runtime.getRuntime();
        // 调用runtime的exec()方法，参数是一个命令；
        Process process = runtime.exec("ipconfig");
        // 调用Process对象的获取输入流的方法
        InputStream is = process.getInputStream();
        byte[] arr = new byte[1024 * 1024 * 100];
        // 读取数据
        int len = is.read(arr); // InputStream的read方法，会将内容读取到arr中，返回读取的长度
        // 将字节数组转化u你为字符串输出到控制台   控制台默认用的是GBK这样的字符集
        System.out.println(new String(arr, 0, len, "GBK"));

    }
}
