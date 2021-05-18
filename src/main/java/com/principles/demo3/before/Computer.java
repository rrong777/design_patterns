package com.principles.demo3.before;


/**
 * 使用一个计算机类，将具体的CPU、内存条、硬盘组合进来。
 */
public class Computer {

    // 可以看到已经组装了-台电脑，但是似乎组装的电脑的cpu只能是Inte1的,内存条只能是金士顿的,硬盘只能是希捷的，这对
    // 用户肯定是不友好的，用户有了机箱肯定是想按照自己的喜好，选择自己喜欢的配件。
    // 如果我要换成AMD的CPU或者换成三星的内存，再或者我要把硬盘升级成固态？你就要去修改Computer类，或者你就要抛弃这台电脑，重新买一台。你现在相当于都是焊死的，
    // 修改电脑就要回厂重造了。也违反了开闭原则
    private XiJieHardDisk harddisk;
    private IntelCpu cpu;
    private KingstonMemory memory;

    // 运行计算机的方法。调用硬件类模拟
    public void run() {
        System.out.println("运行计算机！");
        String data = harddisk.get();// 开机需要从硬盘加载数据
        System.out.println("从硬盘获取的数据：" + data);
        cpu.run();
        memory.save();
    }

    // getter /setter
    public XiJieHardDisk getHarddisk() {
        return harddisk;
    }

    public void setHarddisk(XiJieHardDisk harddisk) {
        this.harddisk = harddisk;
    }

    public IntelCpu getCpu() {
        return cpu;
    }

    public void setCpu(IntelCpu cpu) {
        this.cpu = cpu;
    }

    public KingstonMemory getMemory() {
        return memory;
    }

    public void setMemory(KingstonMemory memory) {
        this.memory = memory;
    }
}
