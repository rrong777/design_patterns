package com.pattern.proxy.static_proxy;

public class Client {
    public static void main(String[] args) {
        // 创建代售点对象
        ProxyPoint proxyPoint = new ProxyPoint();
        // 调用方法进行买票
        proxyPoint.sell();; // 最终还是火车站卖票。只不过代售点收取一些代理费用。客户最终还是买的火车站的票。
        // 客户端访问的是代理类的对象，而不是目标类（火车站）的对象。
        // 我们这里增强只是打印了一句话，你想怎么增强都可以，比如说对参数进行增强，对方法体进行增强啊，对返回值进行增强。
    }
}
