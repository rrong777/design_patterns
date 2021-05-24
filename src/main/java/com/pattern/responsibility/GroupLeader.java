package com.pattern.responsibility;

/**
 * 小组长类
 */
public class GroupLeader extends Handler {
    public GroupLeader() {
        // 小组长可以处理一天以内的请假
        super(0, Handler.NUM_ONE);
    }

    @Override
    protected void handleLeave(LeaveRequest leaveRequest) {
        if(leaveRequest.getNum() < numEnd) {
            System.out.println(leaveRequest.getName() + "请假" + leaveRequest.getNum() + "天," + leaveRequest.getContent());
            System.out.println("小组长审批同意");
        }
    }
}
