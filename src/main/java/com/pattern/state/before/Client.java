package com.pattern.state.before;

public class Client {
    public static void main(String[] args) {
        Lift lift = new Lift();
        lift.setState(ILift.STOP_STATE);// 初始状态事停止状态
//        lift.setState(ILift.RUNNING_STATE);// 初始状态事运行状态，只会执行下面的关门
        lift.open();//开门
        lift.close();//关门
        lift.run();//运行
        lift.stop();//停止
    }
}
