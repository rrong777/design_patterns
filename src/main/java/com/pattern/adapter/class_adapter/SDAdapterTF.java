package com.pattern.adapter.class_adapter;

/**
 * 类适配器模式
 * 违反了合成服用原则，如果SDCard没有这个接口，而是有一个SDCardImpl具体类，Java无法多继承。
 * sd卡适配tf卡的适配器。适配器类。
 * 适配器类需要实现目标类（目标接口） 我需要把适配者类适配成目标接口的实现，那我这个适配器类最后出来的也是目标接口子类，那我自己实现就可以了
 * 目标接口就是业务接口
 * 并且继承现有组件库中已经存在的组件（我现在有一张TF卡，并且是具体的TF卡，我要把这张具体的TF卡转换为SDCard 给电脑用）
 * 而SDCardImpl只是我们用来测试的，跟适配器模式无关的角色
 */
public class SDAdapterTF extends TFCardImpl implements SDCard {
    @Override
    public String readSD() {
        System.out.println("adapter read TFCard");
        return readTF(); // 给你包了一层皮，实际上我还是调用适配者类的方法，但是我确是实现了目标类，用目标类的方式调用。
    }

    @Override
    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        writeTF(msg);
    }
}
