package com.pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * 服务员类（属于请求者角色）
 */
public class Waitor {
    // 持有多个命令对象（你一个服务员可以给很多桌客人点餐啊）
    private List<Command> commands = new ArrayList<>();
    
    public void setCommand(Command command) {
        // 将command对象存储倒list集合中
        commands.add(command);
    }

    // 发起命令功能 ，订单来了
    public void orderUp() {
        System.out.println("美女服务员说：大厨，新订单来了！");
        // 遍历list集合，给厨师发起命令
        for (Command command : commands) {
            // 健壮性，健壮的程序是没有异常的。
            if(command != null) {
                command.execute();
            }
        }
    }
}
