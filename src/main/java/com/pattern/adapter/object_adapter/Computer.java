package com.pattern.adapter.object_adapter;

/**
 * 计算机类
 */
public class Computer {
    public String readSD(SDCard sdCard) {
        if(sdCard == null) {
            throw new NullPointerException("sd card is not null!");
        }
        return sdCard.readSD();
    }
}
