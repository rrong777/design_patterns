package com.pattern.adapter.object_adapter;

/**
 * 目标接口 需要把适配者类对象适配成目标接口对象
 */
public interface SDCard {
    // 从SD卡中读数据
    String readSD();
    // 往SD卡中写数据
    void writeSD(String msg);
}
