package edu.uestc.attendance.dao.teacher;

import java.sql.Date;
import java.util.List;

public interface TeachMessageMapper {
	public List<edu.uestc.attendance.dao.student.TeachMessageEntity> getAll(long teacherid);
	
	//获取aftertime之后的所有消息
	public List<TeachMessageEntity> getAllAfterTime(long teacherid,Date aftertime);
	
	//根据行政班获取消息，默认为当前时间之后
	public List<TeachMessageEntity> getCourseAfterTime(int instructid,Date aftertime);
	
	//根据行政班获取消息
	public List<TeachMessageEntity> getCourseAll(int instructorid);
	
	//提交信息
	public int sendMessage(TeachMessageEntity msg);
	
	
	//获取老师的行政班级id
	public List<String> getMyInstructorId(long id);
}
