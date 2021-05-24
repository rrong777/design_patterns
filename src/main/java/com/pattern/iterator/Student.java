package com.pattern.iterator;

public class Student {
    private String name;// 姓名
    private String num;//学号

    public Student(String name, String num) {
        this.name = name;
        this.num = num;
    }

    public Student() {
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", num='" + num + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNum() {
        return num;
    }

    public void setNum(String num) {
        this.num = num;
    }
}
