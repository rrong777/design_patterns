package com.pattern.responsibility;

/**
 * 总经理类
 */
public class GeneralManager extends Handler {
    public GeneralManager() {
        // 总经理可以处理3-7的请假。超过七天，自己离职把
        super(3, Handler.NUM_SEVEN);
    }

    @Override
    protected void handleLeave(LeaveRequest leaveRequest) {
        if(leaveRequest.getNum() < this.numEnd) {
            System.out.println(leaveRequest.getName() + "请假" + leaveRequest.getNum() + "天," + leaveRequest.getContent());
            System.out.println("总经理审批同意");
        }
    }
}
