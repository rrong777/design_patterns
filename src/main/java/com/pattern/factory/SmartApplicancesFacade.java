package com.pattern.factory;

import com.pattern.factory.facade.AirCondition;
import com.pattern.factory.facade.Light;
import com.pattern.factory.facade.TV;

/**
 * 外观类，智能影响，用户主要和该对象交互（提供访问接口，访问内部细节）
 */
public class SmartApplicancesFacade {
    // 聚合电灯对象、电视机对象、空调对象
    private Light light;
    private TV tv;
    private AirCondition airCondition;

    public SmartApplicancesFacade() {
        // 在构造器里面赋值
        light = new Light();
        tv = new TV();
        airCondition = new AirCondition();
    }

    // 通过语音控制
    public void say (String msg) {
        if(msg.contains("打开")) {
            on();
        } else if(msg.contains("关闭")) {
            off();
        } else {
            System.out.println("我还听不懂你说的！！！");
        }
    }
    // 一键打开功能
    private void on() {
        light.on();
        tv.on();
        airCondition.on();
    }
    // 一件关闭功能
    private void off() {
        light.off();
        tv.off();
        airCondition.off();
    }
}
