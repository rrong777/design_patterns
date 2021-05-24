package com.pattern.mediator;

public class Client {
    public static void main(String[] args) {
        // 创建中介者对象
        MediatorStructure mediator = new MediatorStructure();
        // 创建租房者对象
        Tenant tenant = new Tenant("里斯", mediator);
        HouseOwner houseOwner = new HouseOwner("张三", mediator);

        // 中介者要知道具体的房主和租客
        mediator.setTenant(tenant);
        mediator.setHouseOwner(houseOwner);

        // 租户跟中介沟通  tenant 和houseOwner是没有任何关系的  是通过中介去关联的。租房者的需求发生变化后，只需要告知对应额中介者。
        tenant.contact("我要租三居室");
        houseOwner.contact("我这里有三居室，你要嘛");
    }
}
