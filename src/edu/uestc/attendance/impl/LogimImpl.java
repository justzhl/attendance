package edu.uestc.attendance.impl;

import edu.uestc.attendance.dao.InitDbConnection;
import edu.uestc.attendance.dao.TeacherEntity;
import edu.uestc.attendance.service.LoginService;

public class LogimImpl implements LoginService {

	@Override
	public boolean Exist(String username, String password) {
		InitDbConnection conn = new InitDbConnection();
		TeacherEntity entity = conn.Init();
		if(null==entity){
			return false;
		}
		return true;
	}

	@Override
	public void setSession() {
		
	}

}
