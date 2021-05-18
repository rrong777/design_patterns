package com.principles.demo3.before;



public class ComputerDemo {
    public static void main(String[] args) {
        // 这是把组装一台计算机到计算机跑起来的过程都抽象了啊

        // 创建组件对象
        XiJieHardDisk hardDisk = new XiJieHardDisk();
        IntelCpu cpu = new IntelCpu();
        KingstonMemory memory = new KingstonMemory();
        // 创建计算机对象
        Computer c = new Computer();

        // 组装计算机
        c.setCpu(cpu);
        c.setHarddisk(hardDisk);
        c.setMemory(memory);

        // 运行计算机
        c.run();
    }
}
