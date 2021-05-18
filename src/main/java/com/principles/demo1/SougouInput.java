package com.principles.demo1;

/**
 * 搜狗输入法
 */
public class SougouInput {
    private AbstractSkin skin;

    public void setSkin(AbstractSkin skin) {
        this.skin = skin;
    }
    public void display() {
        skin.display();
    }

    public static void main(String[] args) {
        DefaultSkin skin = new DefaultSkin();
        HeimaSkin skin1 = new HeimaSkin();
        SougouInput sougouInput = new SougouInput();

        sougouInput.setSkin(skin);
        sougouInput.display();

        System.out.println("开始切换皮肤！");

        sougouInput.setSkin(skin1);
        sougouInput.display();

    }
}
