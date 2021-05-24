package com.pattern.proxy.static_proxy;

/**
 * 代售点类
 */
public class ProxyPoint implements SellTickets {
    // 声明火车站类对象
    private TrainStation trainStation = new TrainStation();

    // 代售点卖票其实也是调用了火车站卖票的功能，只不过在调用火车站卖票功能之前进行了一个增强
    @Override
    public void sell() {
        System.out.println("代售点收取服务费用");
        trainStation.sell();
    }
}
