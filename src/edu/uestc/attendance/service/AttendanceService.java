package edu.uestc.attendance.service;

import java.util.List;

import edu.uestc.attendance.dao.AttendanceEntity;

public interface AttendanceService {
	//student
	public List<AttendanceEntity> listInterval(long stuid,int start,int end);
}
