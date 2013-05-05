package edu.uestc.attendance.service;

import java.util.List;

import edu.uestc.attendance.dao.student.StudentEntity;

public interface TeacherService {
	public List<StudentEntity> listStudents();
}
