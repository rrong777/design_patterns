package com.atguigu.priciples;

/**
 * 单一职责原则
 * 方案2 遵守了单一职责原则
 */
public class SingleResponsibility2 {
    public static void main(String[] args) {
        RoadVehicle vehicle = new RoadVehicle();
        vehicle.run("摩托车");
        vehicle.run("汽车");
        AirVehicle airVehicle = new AirVehicle();
        airVehicle.run("飞机");
    }
}
// 方案2的分析
// 首先遵守了单一职责原则，
// 2. 但是这样做的改动很大，即 需要将类分解，同时改动客户端，
// 3. 改进，直接修改Vehicle类，改动的代码比较少

// 陆上交通工具
class RoadVehicle{
    public void run(String vehicle) {
        System.out.println(vehicle + "在公路上跑！");
    }
}

// 空中交通工具
class AirVehicle{
    public void run(String vehicle) {
        System.out.println(vehicle + "在天上跑！");
    }
}
// 水中交通工具
class WaterVehicle{
    public void run(String vehicle) {
        System.out.println(vehicle + "在水上跑！");
    }
}