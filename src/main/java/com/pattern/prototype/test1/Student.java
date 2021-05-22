package com.pattern.prototype.test1;

import java.io.Serializable;

public class Student implements Serializable {
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // 学生的姓名
    private String name;
}
