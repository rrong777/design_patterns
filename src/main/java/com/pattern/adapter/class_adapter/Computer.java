package com.pattern.adapter.class_adapter;

/**
 * 计算机类
 */
public class Computer {
    // 从sd卡中读取数据 ，假设电脑只能从sd卡中读取数据，但是现在却有一张tf卡。适配器模式把tf卡（适配者类，需要适配的类
    // ）转为sd卡（目标类）  SDCard 传的是抽象，使用的地方尽量传抽象，后面好扩展。
    public String readSD(SDCard sdCard) {
        if(sdCard == null) {
            throw new NullPointerException("sd card is not null!");
        }
        return sdCard.readSD();
    }
}
