package edu.uestc.attendance.dao.student;

import java.util.List;

//mybatis�����ӿ�
public interface StudentMapper {
	
	public StudentEntity getItem(int id);
	
	public List<StudentEntity> getLists();
	
	
}
