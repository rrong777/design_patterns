package com.principles.demo3.after.firmware.impl;

import com.principles.demo3.after.firmware.Memory;

/**
 * 金士顿内存条
 */
public class KingstonMemory implements Memory {
    public void save() {
        System.out.println("使用金士顿内存条！");
    }
}
