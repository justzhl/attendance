package edu.uestc.attendance.dao;

import java.util.List;

public interface TeacherMapper {
	//��ʦ��¼��֤
	public int teacherLogin(TeacherEntity entity);
	public TeacherEntity getItem(int id);
	public List<TeacherEntity> getList();
}	
