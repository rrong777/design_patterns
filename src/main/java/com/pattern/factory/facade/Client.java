package com.pattern.factory.facade;

import com.pattern.factory.SmartApplicancesFacade;

/**
 * 框架底层提供了很多很多封装，但是我门去用这个框架的话，很简单。
 */
public class Client {
    public static void main(String[] args) {
        // 创建智能音箱对象  只需要和智能音箱进行交互，对外暴露的只有一个对象。
        SmartApplicancesFacade facade = new SmartApplicancesFacade();
        // 控制家电
        facade.say("打开家电");
        System.out.println("====================");
        facade.say("关闭家电");
    }
}
