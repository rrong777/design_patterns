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
    // 获取代理对象的方法
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
                // 通过代理工厂获得的SellTickets的对象，调用sell方法还是调用test方法其实都是在执行下面这个invoke方法
                new InvocationHandler() {
                    /**
                     *
                     * @param proxy 和 proxyObject是同一个对象，在invoke方法中基本不用
                     * @param method 对接口中的方法进行封装的method对象。比如SellTickets 有test()和sell()方法
                     *               你通过proxyObject调用哪个方法，这个method就是哪个方法的method对象
                     * @param args 调用方法的实际参数
                     * @return 你实际调用的方法的返回值（你调用sell或者test方法，走的都是invoke()。这里return的就是
                     *          代理对象调用sell或者test完之后的得到的值）
                     * @throws Throwable
                     */
                    @Override
                    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                        System.out.println(method.getName());
//                        System.out.println("invoke方法执行了");
                        // 增强
                        System.out.println("代售点收取一定费用（JDK动态代理）");
                        // 执行目标对象的方法
                        Object obj = method.invoke(trainStation, args);
                        return obj;
                    }
                }
        );
        return proxyObject;
    }
}
