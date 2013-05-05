package edu.uestc.attendance.action.teacher;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.HashMap;

import com.opensymphony.xwork2.ActionSupport;

import edu.uestc.attendance.dao.student.StudentEntity;
import edu.uestc.attendance.service.TeacherService;

public class listStudents extends ActionSupport {
	private TeacherService teacher;
	private List<StudentEntity> entity;
	private Map datamap;
	public Map getDatamap() {
		return datamap;
	}

	public void setDatamap(Map datamap) {
		this.datamap = datamap;
	}

	public List<StudentEntity> getEntity() {
		return entity;
	}

	public void setEntity(List<StudentEntity> entity) {
		this.entity = entity;
	}

	public TeacherService getTeacher() {
		return teacher;
	}

	public void setTeacher(TeacherService teacher) {
		this.teacher = teacher;
	}

	@Override
	public String execute() throws Exception {
		setEntity(teacher.listStudents());
		datamap = new HashMap();
		List<String> result = new ArrayList<String>();
		datamap.put("aaData",getEntity());
		return SUCCESS;
	}
	
}
