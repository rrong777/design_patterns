package com.principles.demo3.after.firmware.impl;

import com.principles.demo3.after.firmware.Cpu;

public class AmdCpu implements Cpu {
    @Override
    public void run() {
        System.out.println("使用amd-cpu");
    }
}
