package edu.uestc.attendance.dao;

import java.util.List;

public interface StudentMapper {
	public StudentEntity getItem(int id);
	
	public List<StudentEntity> getLists();
}
