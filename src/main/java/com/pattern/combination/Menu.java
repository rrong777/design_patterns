package com.pattern.combination;

import java.util.ArrayList;
import java.util.List;

/**
 * 菜单类（树枝节点角色）
 */
public class Menu extends MenuComponent {
    // 菜单可以有多个子菜单或者菜单项，聚合
    private List<MenuComponent> menuComponentList = new ArrayList<>();

    // 构造方法
    public Menu(String name, int level) {
        this.name = name;
        this.level = level;
    }

    @Override
    public void print() {
        // 每次调用的都是MenuComponent的print()方法，这个print()方法又因为Menu和MenuItem不同而不同。menu的话都会循环遍历子对象，调用子对象的print()方法。
        // 打印菜单名称 递归打印
        System.out.println(getSpace() + name);
        // 打印子菜单或者子菜单项名称
        for (MenuComponent menuComponent : menuComponentList) {
            menuComponent.print();
        }
    }

    @Override
    public void add(MenuComponent menuComponent) {
        menuComponentList.add(menuComponent);
    }

    @Override
    public void remove(MenuComponent menuComponent) {
        menuComponentList.remove(menuComponent);
    }

    @Override
    public MenuComponent getChild(int index) {
        return menuComponentList.get(index);
    }
}
