package com.pattern.template;

public class Client {
    public static void main(String[] args) {
        // 炒包菜
        // 1. 创建对象
        ConcreateClass_Baocai baocai = new ConcreateClass_Baocai();
        // 炒菜心
        // 1. 创建对象
        ConcreateClass_Caixin caixin = new ConcreateClass_Caixin();

        // 2. 调用炒菜功能
        baocai.cookProcess();

        System.out.println("===========================");
        caixin.cookProcess();
    }
}
