package edu.uestc.attendance.dao.teacher;

import java.util.List;

public interface TeacherMapper {
	//教师登录验证
	public int teacherLogin(TeacherEntity entity);
	public TeacherEntity getItem(int id);
	public List<TeacherEntity> getList();
}	
