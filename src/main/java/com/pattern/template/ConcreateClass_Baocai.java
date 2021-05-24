package com.pattern.template;

/**
 * 炒包菜类
 */
public class ConcreateClass_Baocai extends AbstractClass{
    @Override
    public void pourVegetable() {
        System.out.println("下锅的蔬菜是包菜！");
    }

    @Override
    public void pourSauce() {
        System.out.println("下锅的酱料是辣椒！");
    }
}
