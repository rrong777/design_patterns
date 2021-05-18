package com.principles.demo3.after;

import com.principles.demo3.after.firmware.Cpu;
import com.principles.demo3.after.firmware.HardDisk;
import com.principles.demo3.after.firmware.Memory;
import com.principles.demo3.after.firmware.impl.AmdCpu;
import com.principles.demo3.after.firmware.impl.IntelCpu;
import com.principles.demo3.after.firmware.impl.KingstonMemory;
import com.principles.demo3.after.firmware.impl.XiJieHardDisk;

public class ComputerDemo {
    public static void main(String[] args) {
        // 创建计算机对象，刚创建出来只有机箱
        Computer c = new Computer();

        // 创建计算机组件对象
        HardDisk hardDisk = new XiJieHardDisk();
        Memory memory = new KingstonMemory();
        Cpu cpu = new IntelCpu();

        // 组装计算机
        c.setCpu(cpu);
        c.setMemory(memory);
        c.setHardDisk(hardDisk);

        // 运行计算机
        c.run();
        System.out.println("=====================================");
        // 不修改原有的代码 是不去修改原有的实体，流程，你要拓展肯定要有业务代码

        // 此时我要扩展，只要实现了cpu接口，然后我有这个cpu对象（新买一条amd - cpu）
        AmdCpu amdCpu = new AmdCpu();
        c.setCpu(amdCpu);
        c.run();
    }}
