package com.pattern.command;

import java.util.HashMap;
import java.util.Map;

/**
 * 订单类
 */
public class Order {
    // 餐桌号
    private int diningTable;
    // 所下的餐品及份数
    private Map<String, Integer> foodDir = new HashMap<>();

    public int getDiningTable() {
        return diningTable;
    }

    public void setDiningTable(int diningTable) {
        this.diningTable = diningTable;
    }

    public Map<String, Integer> getFoodDir() {
        return foodDir;
    }

    /**
     * name 餐品名称
     * num 数量
     * @param name
     * @param numm
     */
    public void setFood(String name, int num) {
        foodDir.put(name, num);
    }
}
