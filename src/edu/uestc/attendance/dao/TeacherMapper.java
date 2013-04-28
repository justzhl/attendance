package edu.uestc.attendance.dao;

import java.util.List;

public interface TeacherMapper {
	public TeacherEntity getItem(int id);
	public List<TeacherEntity> getList();
}	
