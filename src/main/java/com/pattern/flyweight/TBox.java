package com.pattern.flyweight;

/**
 * 具体享元角色 T图形类
 */
public class TBox extends AbstractBox{
    @Override
    public String getShape() {
        return "T";
    }
}
