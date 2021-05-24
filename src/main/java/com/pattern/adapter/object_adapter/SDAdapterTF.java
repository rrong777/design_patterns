package com.pattern.adapter.object_adapter;

/**
 * 对象适配器模式，不再继承适配者类 而是改为聚合 但是还是要实现目标接口，如果这时候没有目标接口，而是有一个目标类，那因为适配者类是聚合在
 * 这里面的，我们适配的是适配者类的对象，所以叫对象适配器。之前继承了适配者类，用整个类去适配。如果没有目标接口，因为这里没有继承，
 * 可以直接继承目标类
 */
public class SDAdapterTF implements SDCard {
    // 声明适配者类
    private TFCard tfCard;
    //
    public SDAdapterTF(TFCard tfCard) {
        this.tfCard = tfCard;
    }
    public String readSD() {
        System.out.println("adapter read TFCard");
        return tfCard.readTF();
    }

    public void writeSD(String msg) {
        System.out.println("adapter write tf card");
        tfCard.writeTF(msg);
    }
}
