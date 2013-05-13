package edu.uestc.attendance.dao.student;

import java.sql.Date;
import java.util.List;

public interface TeachMessageMapper {
	public List<TeachMessageEntity> getAll(long stuid);
	
	//获取aftertime之后的所有消息
	public List<TeachMessageEntity> getAllAfterTime(long stuid,Date aftertime);
	
	//根据行政班获取消息，默认为当前时间之后
	public List<TeachMessageEntity> getCourseAfterTime(long stuid,Date aftertime);
	
	//根据行政班获取消息
	public List<TeachMessageEntity> getCourseAll(long stuid,int instructorid);
	
	//根据教师获取消息
	public List<TeachMessageEntity> getCourseAfterTime(long stuid,int instructorid);
}
