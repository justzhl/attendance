package edu.uestc.attendance.service;

import edu.uestc.attendance.dao.UserEntity;
import edu.uestc.attendance.dao.teacher.TeacherEntity;

public interface LoginService {
	//checkout is username with password exist
	public boolean Exist(String usertype,String username,String password);
	void setSession(UserEntity user);
}
