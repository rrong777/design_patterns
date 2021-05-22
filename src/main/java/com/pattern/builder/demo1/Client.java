package com.pattern.builder.demo1;

public class Client {
    public static void main(String[] args) {
        // 创建指挥者对象 你要生产什么产品，就传什么bike进去
        Director director = new Director(new MobileBuilder());

        // 指挥者指挥组装自行车
        Bike bike = director.construct();
        // 直接打印  隐藏创建对象的细节。  用户不需要知道我底层构建的过程，也不需要知道我构建的算法。直接调用功能就可以构建一个复杂对象。
        // 没有指挥者 我们不知道构建算法。 Builder只是提供了组件，Director才是提供构建算法的
        System.out.println(bike.getFrame());
        System.out.println(bike.getSeat());
    }
}
