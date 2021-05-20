package com.pattern.factory.factory_method;

/**
 * 咖啡工厂接口  抽象工厂角色
 */
public interface CoffeeFactory {
    // 创建咖啡对象的方法
    Coffee createCoffee();
}
