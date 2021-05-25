package com.rrong777.framework.beans;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * 用户用来存储和管理多个PropertyValue的对象
 * 一个bean标签可以有多个property标签，每一个property标签会被封装成一个PropertyValue对象，多个的话就是多个PropertyValue对象
 * 这里就定义一个MutilablePropertyValues 对PropertyValue对象进行管理。迭代器模式，管理多个PropertyValue对象，可以迭代的。
 */
public class MutilablePropertyValues implements Iterable<PropertyValue>{
    // 定义list集合对象用来存储PropertyValue对象
    private final List<PropertyValue> propertyValueList;

    // 无参构造器直接new 一个
    public MutilablePropertyValues() {
        propertyValueList = new ArrayList<>();
    }

    // 有参 构造，你可以传一个list集合进来。传进来的可能是null
    public MutilablePropertyValues(List<PropertyValue> propertyValueList) {
        if(propertyValueList == null) {
           this.propertyValueList = new ArrayList<>();
        } else {
            this.propertyValueList = propertyValueList;
        }
    }
    // 获取所有的PropertyValue
    public PropertyValue[] getPropertyValues() {
        // 直接将集合转化为数组返回即可
//        return (PropertyValue[]) propertyValueList.toArray(); // toArray返回的是一个Object[]
        return propertyValueList.toArray(new PropertyValue[0]); // 可以在参数传一个你最后要的数组，长度无所谓 0也可以，这个像泛型
    }

    // 根据name属性值，获取PropertyValue对象
    public PropertyValue getPropertyValue(String propertyName) {
        for (PropertyValue propertyValue : propertyValueList) {
            if(propertyValue.getName().equals(propertyName)) {
                return propertyValue;
            }
        }
        // 说明里面没有这个名字的propertyValue
        return null;
    }
    // 判断集合是否为空
    public boolean isEmpty() {
        return propertyValueList.isEmpty();
    }

    // 添加propertyValue对象
    public MutilablePropertyValues addPropertyValue(PropertyValue propertyValue) {
        // 判断集合中存储的propertyValue对象是否和传递进来的重复了，如果重复了就覆盖
        for (int i = 0; i < propertyValueList.size(); i++) {
            // 获取集合中每一个propertyValue对象
            PropertyValue currentPv = propertyValueList.get(i);
            if(currentPv.getName().equals(propertyValue.getName())) {
                propertyValueList.set(i, propertyValue); // list的set方法，在i索引位置设置一个新的值
                return this;// 目的就是实现链式编程，你这个操作把当前类对象返回回去，操作完了之后还能拿到这个对象进行别的操作
            }
        }
        // for循环走到这里，证明没有重复的
        this.propertyValueList.add(propertyValue);
        return this;
    }

    // 判断是否有指定name属性值的对象
    public boolean contains(String name) {
        // 如果!=null。那么证明包含。如果=null那么证明不包含/
        return getPropertyValue(name) != null;
    }

    // 获取迭代器对象
    @Override
    public Iterator<PropertyValue> iterator() {
        // 用final修饰的成员变量，必须在构造器结束之前对他进行初始化
        return propertyValueList.iterator();
    }
}
