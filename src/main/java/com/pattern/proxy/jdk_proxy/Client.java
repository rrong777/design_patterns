package com.pattern.proxy.jdk_proxy;

public class Client {

    public static void main(String[] args) {
        /**
         * ProxyFactory 是代理工厂，但是不是代理类。
         * 这个工厂提供了一个方法，getProxyObject(); 这个方法获取的是代理对象。不是代理类，代理类是在程序运行过程中动态生成的。
         */
        // 获取代理对象
        // 1. 创建代理工厂对象
        ProxyFactory factory = new ProxyFactory();
        // 2. 使用factory对象啊的方法获取代理对象
        // 多态，这里代理工厂返回的是火车站对象
        SellTickets proxyObject = factory.getProxyObject();
        // 3. 调用卖票的方法  factoru获得代理对象，可以调用sellTickets里面定义的方法。其根本就是调用invoke方法，进行业务逻辑处理
        // 因为代理工厂的getProxyObject() 获得的就是SellTickets的对象。所以只能调用里面的类的方法。
//        proxyObject.test();;
        // 调用代理类对象的sell()方法，对火车站的sell方法进行增强。这个增强在没有修改火车站类的基础上。进行了一个动态的增强。

        // 编译看左边，proxyObject 是SellTickets类型的变量，只要SellTickets里面有声明的
        // proxyObject都能调用，执行看右边。执行看的是右边，获得的是代理类对象，代理类是在内存中的。 执行的是下面动态生成的
        // 代理类对象的sell()方法。 而代理类对象的sell方法调用的又是h.invoke() m4传进去，m4是sell的method对象。
        // 而这个h 又是我们自己定义的。
        proxyObject.sell(); // 你调用sell 调用test 都是执行invoke()方法

        // 代理类的全类名
        System.out.println(proxyObject.getClass());
        // 让程序一直执行。
        while(true) {

        }
    }
}


//// 继承了Proxy 同时实现了SellTickets
//public final class $Proxy0 extends Proxy implements SellTickets {
//    // 其实还有hashCode 、equals、toString三个方法，都是Object里面定义的，删掉了
//    private static Method m3;
//    private static Method m4;
//
//    public $Proxy0(InvocationHandler invocationHandler) {
//        // 把这个invocationHandler直接赋值给了父类。
//        // 这个就是我们在Proxy.newInstance()传进去的第三个参数，InvocationHandler的匿名实现。
//        // 把这个invocationHandler直接赋值给父类的成员变量。
//        super(invocationHandler);
//    }
//
//
//    public final void test() {
//        this.h.invoke(this, m3, null);
//    }
//
//
//
//    public final void sell() {
//        this.h.invoke(this, m4, null);
//    }
//
//
//
//    static {
//        // Class.forName通过反射加载字节码对象，然后获得方法。并且方法对象赋值给静态变量。
//        m3 = Class.forName("com.pattern.proxy.jdk_proxy.SellTickets").getMethod("test", new Class[0]);
//        m4 = Class.forName("com.pattern.proxy.jdk_proxy.SellTickets").getMethod("sell", new Class[0]);
//        return;
//    }
//}
//// 父类
//public class Proxy {
//    protected InvocationHandler h;
//    protected Proxy(InvocationHandler h) {
//        Objects.requireNonNull(h);
//        this.h = h;
//    }
//}