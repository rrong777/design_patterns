package com.rrong777.framework.beans.factory.support;

import com.rrong777.framework.beans.BeanDefinition;

/**
 * 注册表对象
 * 该接口定义了注册表的相关操作
 */
public interface BeanDefinitionRegistry {
    //注册BeanDefinition对象到注册表中
    void registerBeanDefinition(String beanName, BeanDefinition beanDefinition);

    //从注册表中删除指定名称的BeanDefinition对象
    void removeBeanDefinition(String beanName) throws Exception;

    //根据名称从注册表中获取BeanDefinition对象
    BeanDefinition getBeanDefinition(String beanName) throws Exception;

    boolean containsBeanDefinition(String beanName);

    int getBeanDefinitionCount(); String[] getBeanDefinitionNames();
}
