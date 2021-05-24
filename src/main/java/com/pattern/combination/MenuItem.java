package com.pattern.combination;

/**
 * 菜单项类（叶子节点角色）
 */
public class MenuItem extends MenuComponent{
    public MenuItem(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void print() {
        System.out.println(getSpace() + name);
    }
}
