package com.principles.demo1;

/**
 * 说明：
 *  模拟搜狗换肤这个功能模块，对开闭原则进行理解
 *      AbstractSkin 抽象皮肤类 定义皮肤都有的展示功能
 *          DefaultSkin 默认皮肤类
 *          HeimaSkin   黑马皮肤
 *      SougouInput 搜狗输入法类，可以设置皮肤
 */
public abstract class AbstractSkin {
    public abstract void display();
}
