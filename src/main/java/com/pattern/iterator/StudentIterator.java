package com.pattern.iterator;

/**
 * 抽象迭代器角色接口
 */
public interface StudentIterator {
    // 判断是否还有元素
    boolean hasNext();
    // 获取下一元素 如果你想通用的话，在类上定义泛型即可
    Student next();
}
