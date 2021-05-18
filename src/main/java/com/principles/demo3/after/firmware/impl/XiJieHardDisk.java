package com.principles.demo3.after.firmware.impl;

import com.principles.demo3.after.firmware.HardDisk;

/**
 * 组装电脑示例
 * 希捷硬盘类
 */
public class XiJieHardDisk implements HardDisk {
    public void save(String data) {
        System.out.println("使用希捷硬盘存储数据：" + data);
    }
    public String get() {
        System.out.println("使用希捷硬盘获取数据");
        return "数据";
    }
}
