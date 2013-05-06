package edu.uestc.attendance.service;

import edu.uestc.attendance.dao.UserEntity;
import edu.uestc.attendance.dao.teacher.TeacherEntity;

public interface LoginService {
	//checkout is username with password exist
	public boolean Exist(int usertype,long id,String password);
	void setSession(UserEntity user);
}
