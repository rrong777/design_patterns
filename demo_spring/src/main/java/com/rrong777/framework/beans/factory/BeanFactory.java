package com.rrong777.framework.beans.factory;

/**
 * IOC容器父接口
 */
public interface BeanFactory {
    // 根据名称获取bean
    Object getBean(String name) throws Exception;

    // 防止后期进行强制类型转换，所以传了个Class
//    T getBean(String name, Class clazz) throws Exception; 如果这样声明是不行的，接口里面并没有声明泛型，说明这是一个泛型方法 <T>T Class也加上对应的泛型
    // 根据bean对象的名称，并且h获取到对象的Class类型，获取到具体的类型对象，就不用强转了。
    <T>T getBean(String name, Class<? extends T> clazz) throws Exception;

}
