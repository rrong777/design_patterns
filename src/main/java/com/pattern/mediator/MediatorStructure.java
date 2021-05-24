package com.pattern.mediator;

/**
 * 具体的中介者角色类
 */
public class MediatorStructure extends Mediator{
    // 聚合房主和租户
    private HouseOwner houseOwner;
    private Tenant tenant;

    @Override
    public void contact(String message, Person person) {
        // 如果person是房主，肯定和租户沟通 把消息 给租户的getMessage方法，让租户获得消息
        if(person == houseOwner) {
            tenant.getMessage(message);
        } else {
            houseOwner.getMessage(message);
        }
    }

    public HouseOwner getHouseOwner() {
        return houseOwner;
    }

    public void setHouseOwner(HouseOwner houseOwner) {
        this.houseOwner = houseOwner;
    }

    public Tenant getTenant() {
        return tenant;
    }

    public void setTenant(Tenant tenant) {
        this.tenant = tenant;
    }
}
