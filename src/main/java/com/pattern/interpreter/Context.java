package com.pattern.interpreter;

import java.util.HashMap;
import java.util.Map;

/**
 * 环境角色类
 */
public class Context {
    // 定义一个map集合。用来存储变量即对应的值
    private Map<Variable, Integer> map = new HashMap<>();

    // 添加变量的功能
    public void assign(Variable variable, Integer value) {
        map.put(variable,value);
    }

    // 根据变量获取对应的值
    public int getValue(Variable variable) {
        return map.get(variable);
    }
}
