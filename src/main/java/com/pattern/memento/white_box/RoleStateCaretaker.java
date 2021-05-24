package com.pattern.memento.white_box;

/**
 * 备忘录对象管理对象
 */
public class RoleStateCaretaker {
    // 声明备忘录类型的变量
    private RoleStateMemento roleStateMemento;

    public RoleStateMemento getRoleStateMomento() {
        return roleStateMemento;
    }

    public void setRoleStateMomento(RoleStateMemento roleStateMemento) {
        this.roleStateMemento = roleStateMemento;
    }
}
