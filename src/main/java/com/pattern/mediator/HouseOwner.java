package com.pattern.mediator;

/**
 * 房主类 具体的同事角色类，
 */
public class HouseOwner extends Person {
    public HouseOwner(String name, Mediator mediator) {
        super(name, mediator);
    }

    // 和中介联系（沟通的方法）
    public void contact(String message) {
        // 房主和中介联系 这里的message是房主要给中介的信息（最终给租客）
        mediator.contact(message, this);
    }

    // 获取信息的方法
    public void getMessage(String message) {
        // 这里的message是中介反馈给房主的租户信息
        System.out.println("房主" + name + "获取倒的信息是：" + message);
    }
}
