package com.pattern.memento.black_box;

public class Client {
    public static void main(String[] args) {
        System.out.println("----------------------大战boss前--------------------------");
        // 创建游戏角色对象
        GameRole gameRole = new GameRole();
        gameRole.initState();// 初始化状态
        gameRole.stateDisplay();

        // 将该游戏角色状态进行备份
        RoleStateCaretaker roleStateCaretaker = new RoleStateCaretaker();
        roleStateCaretaker.setMomento(gameRole.saveState());
        System.out.println("----------------------大战boss后--------------------------");
        // 损耗严重
        gameRole.fight();// 阵亡了，恢复到最开始的地方
        gameRole.stateDisplay();
        System.out.println("----------------------恢复之前状态--------------------------");
        // roleStateCaretaker拿到了Memento 但是只能传递，什么都不能做，因为memento接口什么操作都没有
        gameRole.recoverState(roleStateCaretaker.getMomento());
        gameRole.stateDisplay();
    }
}
