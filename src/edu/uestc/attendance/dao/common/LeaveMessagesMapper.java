package edu.uestc.attendance.dao.common;

import java.util.List;
public interface LeaveMessagesMapper {
	public List<LeaveMessagesEntity> getMessagesByStuId(long id);
	public List<LeaveMessagesEntity> getMessagesByTeacherId(long id);
}
