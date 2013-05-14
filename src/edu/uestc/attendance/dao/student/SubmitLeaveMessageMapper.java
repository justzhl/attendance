package edu.uestc.attendance.dao.student;

import edu.uestc.attendance.dao.common.LeaveMessagesEntity;

public interface SubmitLeaveMessageMapper {
	public int submit(LeaveMessagesEntity msg);
}
