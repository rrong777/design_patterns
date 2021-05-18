package com.principles.demo1;

/**
 * 搜狗输入法
 *  聚合了一个AbstractSkin再SougouInput内部
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
        // 创建默认皮肤对象
        DefaultSkin skin = new DefaultSkin();
        // 创建黑马皮肤对象
        HeimaSkin skin1 = new HeimaSkin();
        // 创建搜狗输入法对象
        SougouInput sougouInput = new SougouInput();

        // 设置皮肤
        sougouInput.setSkin(skin);
        // 皮肤展示
        sougouInput.display();

        System.out.println("开始切换皮肤！");

        // 重新设置皮肤
        sougouInput.setSkin(skin1);
        sougouInput.display();

    }
}
