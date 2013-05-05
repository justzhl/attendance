package edu.uestc.attendance.dao;

import java.util.List;

public interface AttendanceMapper {
	//student
	public List<AttendanceEntity> listInterval(long stuid,int start,int end);
	//按照周查询
	public List<AttendanceEntity> listWeek(long stuid,int week);
	//按照老师查询
	public List<AttendanceEntity> listTeacher(long stuid,int teacherid);
	//按照教学班查询
	public List<AttendanceEntity> listInstruct(long stuid,int instruct);
	
	
 }
