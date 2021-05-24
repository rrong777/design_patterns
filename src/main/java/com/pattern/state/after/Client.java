package com.pattern.state.after;

public class Client {
    // 没有很多if else 后期加状态加一个状态类就行，也只需要修改context环境类
    public static void main(String[] args) {
        // 创建环境角色对象
        Context context = new Context();
        // 设置当前电梯状态 电梯正在运行 无法打开，本身就是关闭，本身就在运行（会打印正在运行），运行可以停止
//        context.setLiftState(new RunningState());
        // 停止状态 可以开门，开门之后可以关门，关门之后可以运行，运行之后可以停止
        context.setLiftState(new StoppingState());

        context.open();
        context.close();
        context.run();
        context.stop();
    }
}
