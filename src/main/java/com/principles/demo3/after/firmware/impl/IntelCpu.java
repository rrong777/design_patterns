package com.principles.demo3.after.firmware.impl;

import com.principles.demo3.after.firmware.Cpu;

/**
 * 因特尔cpu
 */
public class IntelCpu implements Cpu {
    public void run() {
        System.out.println("使用因特尔cpu");
    }
}
