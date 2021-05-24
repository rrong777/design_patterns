package com.pattern.memento.white_box;

/**
 * 游戏角色类，发起人角色
 */
public class GameRole {
    // 生命力
    private int vit;
    // 攻击力
    private int atk;
    // 防御力
    private int def;

    // 初始化内部状态的功能
    public void initState() {
        this.vit = 100;
        this.atk = 100;
        this.def = 100;
    }
    // 战斗方法
    public void fight() {
        this.vit = 0;
        this.atk = 0;
        this.def = 0;
    }
    // 保存角色状态功能
    public RoleStateMemento saveState() {
        // 保存的话，肯定要创建一个备忘录，保存的就是当前的状态，所以当前状态要传递过去 封装倒备忘录对象里面进行保存 备忘录对象是由管理者进行保存
        return new RoleStateMemento(vit, atk, def);
    }

    // 恢复角色状态
    public void recoverState(RoleStateMemento roleStateMemento) {
        // 就是把备忘录里面之前存储的状态恢复到游戏角色身上。
        // 将备忘录存储的状态 赋值给当前对象
        this.vit = roleStateMemento.getVit();
        this.atk = roleStateMemento.getAtk();
        this.def = roleStateMemento.getDef();

    }
    // 展示状态功能， 这个我们要看到变化不是，不然你怎么知道恢复没
    public void stateDisplay() {
        System.out.println("角色生命力：" + this.vit);
        System.out.println("角色攻击力：" + this.atk);
        System.out.println("角色防御力：" + this.def);
    }
    public int getVit() {
        return vit;
    }

    public void setVit(int vit) {
        this.vit = vit;
    }

    public int getAtk() {
        return atk;
    }

    public void setAtk(int atk) {
        this.atk = atk;
    }

    public int getDef() {
        return def;
    }

    public void setDef(int def) {
        this.def = def;
    }
}
