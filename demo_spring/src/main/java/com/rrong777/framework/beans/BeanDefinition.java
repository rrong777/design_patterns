package com.rrong777.framework.beans;

/**
 * 用来封装bean信息，主要包含id（bean的名称）、class（全类名）以及子标签property数据
 */
public class BeanDefinition {
    private String id;
    private String className;
    private MutilablePropertyValues propertyValues;

    public BeanDefinition() {
        // 直接调用构造器初始化。 一切皆对象，可以有多个property属性，那么我们就提供一个property的容器，可遍历。这里主要是要看迭代器模式把。
        propertyValues = new MutilablePropertyValues();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getClassName() {
        return className;
    }

    public void setClassName(String className) {
        this.className = className;
    }

    public MutilablePropertyValues getPropertyValues() {
        return propertyValues;
    }

    public void setPropertyValues(MutilablePropertyValues propertyValues) {
        this.propertyValues = propertyValues;
    }
}
