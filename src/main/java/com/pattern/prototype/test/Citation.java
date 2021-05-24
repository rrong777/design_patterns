package com.pattern.prototype.test;

/**
 * 奖状类
 * 不用实现Cloneable即可重写clone()方法，因为在Object里面就有clone方法，如果没实现Cloneable接口，调用clone()方法会抛异常
 *  CloneNotSuppertedException
 *
 *  性能和安全要求比较高的程序，可以使用克隆模式，
 *  要这个对象的时候，让他去复制，而不是new  去复制的话可以按照我们自己的逻辑去创建对象。
 */
public class Citation implements Cloneable{
    // 三好学生的姓名
//    private String name;
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
    private Student student;

    public Student getStudent() {
        return student;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    /**
     * 返回值是被重写方法返回值的子类即可
     * @return
     * @throws CloneNotSupportedException
     */
    @Override
    protected Citation clone() throws CloneNotSupportedException {
        return (Citation) super.clone();
    }
    public void show() {
        System.out.println(student.getName() + "同学：在2020学年第一学期中表现优秀，被评为三好学生。特发此状！");
    }
}
