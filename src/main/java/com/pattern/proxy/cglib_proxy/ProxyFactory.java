package com.pattern.proxy.cglib_proxy;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * 代理对象工厂 用来获取代理对象
 */
public class ProxyFactory implements MethodInterceptor {
    private TrainStation trainStation = new TrainStation();
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
//        System.out.println("方法执行了");
        System.out.println("代售点收取一定费用CGLIB");
        Object obj = method.invoke(trainStation, objects);
        // obj就是目标方法的返回值
        return obj;
    }

    // 定义一个方法获取代理对象。 代理对象是目标类的子类对象。TrainStation是目标类，我们的代理对象肯定是他的子类。
    public TrainStation getProxyObject() {
        // c创建Enhancer对象，类似jdk代理中的，Proxy对象。就是用来获取代理对象的一个类。
        Enhancer enhancer = new Enhancer();
        // 设置父类（目标类）的字节码对象，CGLIB的代理类是目标类的子类， 设置代理类的对象，代理类是动态生成的，你要根据什么动态生成。父类
        enhancer.setSuperclass(TrainStation.class);
        // 设置回调函数 这个方法的参数是MethodInterceptor的子实现类对象。就让这个代理工厂实现一下就好了。
        enhancer.setCallback(this);
        // 创建代理对象
        TrainStation proxyObject = (TrainStation) enhancer.create();// 代理对象是TrainStation的子类
        return proxyObject;
    }
}
