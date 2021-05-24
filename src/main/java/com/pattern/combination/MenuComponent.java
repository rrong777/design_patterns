package com.pattern.combination;

/**
 * 菜单组件，抽象根节点
 * 不论菜单还是菜单项，对外我们希望看成一个东西。那么就需要抽象这两者。而菜单项没有add 那调用的时候抛异常就好了。
 * 抽象可以抽两者有的，一者没有的抛异常即可。一者有的就扩展。默认就抛异常。
 */
public abstract class MenuComponent {
    // 菜单组件的名称,不管菜单项还是菜单都有name，树枝节点和叶子节点都有的 protected 子类可以访问
    protected String name;
    // 菜单组件的层级
    protected int level;
    // 添加子菜单 可以添加菜单也可以添加菜单项，所以这里声明一个抽象
    public void add(MenuComponent menuComponent) {
    // 如果MenuComponent的子类是菜单，菜单下面还可以有菜单项和菜单，如果是菜单项，那么下面不能有其他层级了。所以父类默认实现就是抛出一个异常，如果菜单子类可以去重写扩展。
        throw new UnsupportedOperationException();
    }

    public String getSpace() {
        String space = "";
        for(int i = 1; i < level; i++) {
            space = space + "\t";
        }
        return space;
    }
    // 移除子菜单
    public void remove(MenuComponent menuComponent) {
        throw new UnsupportedOperationException();
    }

    // 获取指定的子菜单
    public MenuComponent getChild(int index) {
        throw new UnsupportedOperationException();
    }

    // 获取菜单或者菜单项的名称
    public String getName() {
        return name;
    }
    // 打印菜单名称的方法（包含子菜单项）
    public abstract void print();
}
