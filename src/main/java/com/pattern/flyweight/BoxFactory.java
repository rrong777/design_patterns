package com.pattern.flyweight;

import java.util.HashMap;

/**
 * 工厂类，将该类设计为单例
 */
public class BoxFactory {
    private HashMap<String, AbstractBox> map;
    private static BoxFactory factory = new BoxFactory();
    // 在构造方法中进行初始化操作
    private BoxFactory() {
        map = new HashMap<>();
        map.put("I", new IBox());
        map.put("L", new LBox());
        map.put("O", new OBox());
        map.put("T", new TBox());
    }
    // 提供一个方法提供该工厂类对象 饿汉式
    public static BoxFactory getInstance() {
        return factory;
    }

    public AbstractBox getShape(String name) {
        return map.get(name);
    }
}
