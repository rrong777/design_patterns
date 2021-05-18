package com.principles.demo5;

/**
 * 经纪人类
 */
public class Agent {
    // 把三个类聚合进来了。
    private Star star;
    private Fans fans;
    private Company company;

    // 和粉丝见面的方法
    public void meeting() {
        System.out.println(star.getName() + "和粉丝" + fans.getName() + "见面");
    }
    public void business () {
        System.out.println(star.getName() + "和" + company.getName() + "公司洽谈");
    }
    // 和媒体公司洽谈的方法

    public void setStar(Star star) {
        this.star = star;
    }

    public void setFans(Fans fans) {
        this.fans = fans;
    }

    public void setCompany(Company company) {
        this.company = company;
    }
}
