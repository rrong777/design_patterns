package com.pattern.mediator;

/**
 * 具体的同事角色类，租房者
 */
public class Tenant extends Person{
    public Tenant(String name, Mediator mediator) {
        super(name, mediator);
    }
    // 和中介联系（沟通的方法）
    public void contact(String message) {
        // 租户和中介联系 这里的message是租户要给中介的信息
        mediator.contact(message, this);
    }

    // 获取信息的方法
    public void getMessage(String message) {
        // 这里的message是中介反馈房主那边回来的信息
        System.out.println("租房者" + name + "获取倒的信息是：" + message);
    }

}
