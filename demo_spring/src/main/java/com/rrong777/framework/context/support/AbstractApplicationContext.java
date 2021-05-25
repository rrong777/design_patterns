package com.rrong777.framework.context.support;

import com.rrong777.framework.beans.factory.support.BeanDefinitionReader;
import com.rrong777.framework.beans.factory.support.BeanDefinitionRegistry;
import com.rrong777.framework.context.ApplicationContext;

import java.util.HashMap;
import java.util.Map;

/**
 * applicationContext接口的子实现类。用于立即加载。
 */
public abstract class AbstractApplicationContext implements ApplicationContext {
    // 声明解析器变量，具体对象让子类实现去初始化，你不一样的子类可以去读取不一样的配置文件。
    protected BeanDefinitionReader beanDefinitionReader;

    // 定义用于存储bean对象的map容器。 这里不考虑线程安全，直接用hashMap
    protected Map<String, Object> singletonObjects = new HashMap<>();

    // 声明配置文件路径的变量
    protected String configLocation;

    // 重写父类的refresh() 立即加载
    @Override
    public void refresh() throws Exception {
        // 加载beanDefinition对象 beanDefinitionReader就是一个工具啊。
        beanDefinitionReader.loadBeanDefinitions(configLocation);
        // 初始化bean
        finishBeanInitialization();
    }
    // bean的初始化
    private void finishBeanInitialization() throws Exception {
        // 获取注册表对象
        BeanDefinitionRegistry registry = beanDefinitionReader.getRegistry();
        // 获取BeanDefinition对象，里面提供了bean相关的信息。拿到这些信息才能创建对象
        String[] beanDefinitionNames = registry.getBeanDefinitionNames();
        for (String beanName : beanDefinitionNames) {
            // bean的初始化
            getBean(beanName);
        }
    }
}
