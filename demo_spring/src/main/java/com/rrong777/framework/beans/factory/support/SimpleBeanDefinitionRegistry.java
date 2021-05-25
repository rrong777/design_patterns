package com.rrong777.framework.beans.factory.support;

import com.rrong777.framework.beans.BeanDefinition;

import java.util.HashMap;
import java.util.Map;

/**
 * 注册表接口实现类
 */
public class SimpleBeanDefinitionRegistry implements BeanDefinitionRegistry{
    // 定义一个容器，用来存储beanDefinition对象
    private Map<String, BeanDefinition> beanDefinitionMap = new HashMap<>();
    // 注册，两个参数一个key一个value 直接put到map中
    @Override
    public void registerBeanDefinition(String beanName, BeanDefinition beanDefinition) {
        beanDefinitionMap.put(beanName, beanDefinition);
    }

    @Override
    public void removeBeanDefinition(String beanName) throws Exception {
        beanDefinitionMap.remove(beanName);
    }

    @Override
    public BeanDefinition getBeanDefinition(String beanName) throws Exception {
        return beanDefinitionMap.get(beanName);
    }

    @Override
    public boolean containsBeanDefinition(String beanName) {
        return beanDefinitionMap.containsKey(beanName);
    }

    @Override
    public int getBeanDefinitionCount() {
        return beanDefinitionMap.size();
    }

    @Override
    public String[] getBeanDefinitionNames() {
        return beanDefinitionMap.keySet().toArray(new String[0]);
    }
}
