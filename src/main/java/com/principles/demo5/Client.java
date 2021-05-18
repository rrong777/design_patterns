package com.principles.demo5;

// 测试客户端
public class Client {
    public static void main(String[] args) {
        // 创建经纪人类
        Agent agent = new Agent();
        // 创建明星对象
        Star star = new Star("林青霞");
        agent.setStar(star);
        // 创建粉丝对象
        Fans fans = new Fans("李四");
        agent.setFans(fans);
        // 创建媒体公司对象
        Company company = new Company("黑马媒体公司");
        agent.setCompany(company);

        // 和粉丝见面
        agent.meeting();
        // 和媒体公司洽谈业务
        agent.business();

        // 迪米特法则原则具体示例，主要就是为了降低明星和粉丝 以及明星和媒体公司之间的耦合度。
    }
}
