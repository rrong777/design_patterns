package com.pattern.proxy.jdk_proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 获取代理对象的工厂类
 *  代理类也实现了对应的接口
 */
public class ProxyFactory {
    // 目标对象
    private TrainStation trainStation = new TrainStation();
    public SellTickets getProxyObject() {
        // 返回代理对象即可
        /**
         * newProxyInstance() ; 三个参数
         * ClassLoader loader,  类加载器 用于加载代理类  可以通过目标对象获取类加载器
         * Class<?>[] interfaces,  代理类实现的接口的字节码对象
         * InvocationHandler h 代理对象的调用处理程序
         */
        SellTickets proxyObject = (SellTickets) Proxy.newProxyInstance(
                trainStation.getClass().getClassLoader(),
                trainStation.getClass().getInterfaces(),
                new InvocationHandler() {
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println("invoke方法执行了");
                        return null;
                    }
                }
        );
        return proxyObject;
    }
}
