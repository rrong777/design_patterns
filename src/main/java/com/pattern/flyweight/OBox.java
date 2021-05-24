package com.pattern.flyweight;

/**
 * 具体享元角色 O图形类
 */
public class OBox extends AbstractBox{
    @Override
    public String getShape() {
        return "O";
    }
}
