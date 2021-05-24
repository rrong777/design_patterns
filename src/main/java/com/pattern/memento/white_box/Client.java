package com.pattern.memento.white_box;

public class Client {
    public static void main(String[] args) {
        System.out.println("----------------------大战boss前--------------------------");
        // 创建游戏角色对象
        GameRole gameRole = new GameRole();
        gameRole.initState();// 初始化状态
        gameRole.stateDisplay();

        // 将该游戏角色状态进行备份
        // 创建管理者对象，你会发现设计模式对象与对象直接（业务对象）没有直接联系，中间都有一个缓冲，什么管理者什么工厂
        // 充分解耦
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        // 发起人（游戏角色）对象就有一个保存state的方法，这个方法获得的就是一个备忘录对象，直接把这个获得的存起来就行了
        roleStateCaretaker.setRoleStateMomento(gameRole.saveState());
        System.out.println("----------------------大战boss后--------------------------");
        // 损耗严重
        gameRole.fight();// 阵亡了，恢复到最开始的地方
        gameRole.stateDisplay();
        System.out.println("----------------------恢复之前状态--------------------------");
        gameRole.recoverState(roleStateCaretaker.getRoleStateMomento());
        gameRole.stateDisplay();
        // 这是白箱备忘录模式，因为在我们的管理者里面，完全可以对我们的备忘录对象进行访问修改。只是我们现在没有操作而已
    }
}
