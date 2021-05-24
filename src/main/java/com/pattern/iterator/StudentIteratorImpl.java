package com.pattern.iterator;

import java.util.List;

/**
 * 具体迭代器角色类
 */
public class StudentIteratorImpl implements StudentIterator{
    // 聚合对象就是一个集合
    private List<Student> list;
    // 用来记录遍历时的位置
    private int position = 0;

    public StudentIteratorImpl(List<Student> list) {
        this.list = list;
    }

    @Override
    public boolean hasNext() {
        return position < list.size();
    }

    @Override
    public Student next() {
        // 从集合中获取指定位置的元素
        Student currentStudent = list.get(position);
        // 位置索引自增
        position++;
        return currentStudent;
    }
}
