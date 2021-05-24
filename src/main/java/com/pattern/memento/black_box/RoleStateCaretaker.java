package com.pattern.memento.black_box;

/**
 * 备忘录对象管理对象
 */
public class RoleStateCaretaker {
    // 声明备忘录类型的变量 管理者是持有一个窄接口
    private Memento momento;

    public Memento getMomento() {
        return momento;
    }

    public void setMomento(Memento momento) {
        this.momento = momento;
    }
}
