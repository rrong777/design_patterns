package com.rrong777.framework.context;

import com.rrong777.framework.beans.factory.BeanFactory;

/**
 * 定义非延时加载功能， 这个context容器主要就是这个功能
 * 主要用于非延时加载 使用在在创建这个容器对象的时候，就会去加载配置文件，并且会对bean进行初始化。存储到容器对象里面。
 */
public interface ApplicationContext extends BeanFactory {
    void refresh() throws Exception;
}
