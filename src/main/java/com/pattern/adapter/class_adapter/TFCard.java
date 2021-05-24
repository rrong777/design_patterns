package com.pattern.adapter.class_adapter;

/**
 * 适配者接口
 */
public interface TFCard {
    // 从tf卡中读取数据
    String readTF();
    // 往tf卡中写数据
    void writeTF(String msg);
}
