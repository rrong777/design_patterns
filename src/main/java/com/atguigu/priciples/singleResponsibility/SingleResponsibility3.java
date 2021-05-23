package com.atguigu.priciples.singleResponsibility;

public class SingleResponsibility3 {
    public static void main(String[] args) {
        Vehicle2 vehicle2 = new Vehicle2();
        vehicle2.run("汽车");
        vehicle2.runAir("飞机");
        vehicle2.runWater("轮船");
    }
}
// 方式3分析：
// 1. 这种修改方法没有对原来的类做大的修改，只是增加了方法
// 2. 这里虽然没有在类这个级别上遵守单一职责原则，但是在方法级别上，仍然是遵守单一职责原则
// 单一职责原则主要体现各行其职，你干你的，我干我的。分成三个类，成本比较高，方案3虽然在类级别上没有遵守单一职责原则，但是在方法上遵守了。
//
class Vehicle2{
    public void run(String vehicle) {
        // 这样拆分了，比如我单双号现行，针对的是公路上的交通工具，在水里面跑的又有另外的条件，如果全部在一个类 或是一个方法里面，进行
        // 这些条件限制，很容易出现交叉，代码就变得很臃肿，可维护性也变得很低。
        // 只有方法足够简单，才能够在代码上违反单一职责原则，就比如，交通工具的运行，三栖都是一个run，可以在一个类里面用方法实现单一职责。
        // 如果路上用 run ，水中用 一种方式，空中用fly 还有其他方法，你就要更进一步拆分。现在只需要三个方法，就避免了要创建三个类来维护单一职责原则
        // 如果是30个方法才能维护单一职责原则，就要拆分成多个类了。
        System.out.println(vehicle + "在公路上跑！");
    }
    public void runAir(String vehicle) {
        System.out.println(vehicle + "在天空上运行！");
    }
    public void runWater(String vehicle) {
        System.out.println(vehicle + "在水中运行！");
    }
}