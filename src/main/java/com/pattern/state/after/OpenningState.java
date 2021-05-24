package com.pattern.state.after;

/**
 * 电梯开启状态类
 */
public class OpenningState extends LiftState {
    @Override
    public void open() {
        // 在Openning状态下 电梯开启
        System.out.println("电梯开启！");
    }

    @Override
    public void close() {
        // 修改状态
        super.context.setLiftState(Context.CLOSING_STATE);
        // 调用当前状态中的context中的close()
        super.context.close();
    }

    @Override
    public void run() {
        // 电梯门开启状态，肯定无法运行 什么都不做
    }

    @Override
    public void stop() {
        // 开门状态本身电梯就是停止的 什么都不做
    }
}
