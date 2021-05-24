package com.pattern.responsibility;

/**
 * 部门经理类
 */
public class Manager extends Handler {
    public Manager() {
        // 部门经理可以处理1-3天的请假
        super(1, Handler.NUM_THREE);
    }

    @Override
    protected void handleLeave(LeaveRequest leaveRequest) {
        if(leaveRequest.getNum() < numEnd) {
            System.out.println(leaveRequest.getName() + "请假" + leaveRequest.getNum() + "天," + leaveRequest.getContent());
            System.out.println("经理审批同意");
        }

    }
}
