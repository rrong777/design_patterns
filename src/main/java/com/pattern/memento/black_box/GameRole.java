package com.pattern.memento.black_box;

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
    public Memento saveState() {
        return new RoleStateMomento(vit, atk, def);
    }

    // 恢复角色状态
    public void recoverState(Memento momento) {
        RoleStateMomento roleStateMomento = (RoleStateMomento) momento;
        // 我知道你这个接口里面装了什么，但是外界拿到并不能操作。她拿到的就是一个空的，但是运行的时候我可以拿到的是装在Memento里面的RoleStateMomento，直接强转
        this.vit = roleStateMomento.getVit();
        this.atk = roleStateMomento.getAtk();
        this.def = roleStateMomento.getDef();

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

    // Memento这个接口是对外标识，虽然什么都没有，但是外界要拿到这个，外界的窄接口，内部的宽接口。细节定义在内部
    private class RoleStateMomento implements Memento {
        // 生命力
        private int vit;
        // 攻击力
        private int atk;
        // 防御力
        private int def;

        public RoleStateMomento() {
        }

        public RoleStateMomento(int vit, int atk, int def) {
            this.vit = vit;
            this.atk = atk;
            this.def = def;
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

}
