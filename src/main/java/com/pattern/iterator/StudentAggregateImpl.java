package com.pattern.iterator;

import java.util.ArrayList;
import java.util.List;

public class StudentAggregateImpl implements StudentAggregate{
    private List<Student> list = new ArrayList<>();

    @Override
    public void addStudent(Student student) {
        list.add(student);
    }

    @Override
    public void removeStudent(Student student) {
        list.remove(student);
    }

    // 获取迭代器功能
    @Override
    public StudentIterator getStudentIterator() {
        // 将聚合对象中的list传给迭代器，聚合对象聚合了学生容器和迭代器。
        return new StudentIteratorImpl(list);
    }
}
