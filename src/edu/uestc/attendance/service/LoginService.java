package edu.uestc.attendance.service;

import edu.uestc.attendance.dao.TeacherEntity;

public interface LoginService {
	//checkout is username with password exist
	public TeacherEntity Exist(String username,String password);
	
	public void setSession();
	
	
}
