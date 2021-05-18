package com.principles.demo3.after;

import com.principles.demo3.after.firmware.Cpu;
import com.principles.demo3.after.firmware.HardDisk;
import com.principles.demo3.after.firmware.Memory;

public class Computer {
    private HardDisk hardDisk;
    private Cpu cpu;
    private Memory memory;

    /**
     * 运行计算机
     */
    public void run(){
        System.out.println("运行计算机！");
        String data = hardDisk.get();// 开机需要从硬盘加载数据
        System.out.println("从硬盘获取的数据：" + data);
        cpu.run();
        memory.save();
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public void setCpu(Cpu cpu) {
        this.cpu = cpu;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }
}
