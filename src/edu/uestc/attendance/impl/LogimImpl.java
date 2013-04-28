package edu.uestc.attendance.impl;

import edu.uestc.attendance.dao.InitDbConnection;
import edu.uestc.attendance.dao.TeacherEntity;
import edu.uestc.attendance.service.LoginService;

public class LogimImpl implements LoginService {

	@Override
	public TeacherEntity Exist(String username, String password) {
		InitDbConnection conn = new InitDbConnection();
		TeacherEntity entity = conn.Init();
		if(null==entity){
			return null;
		}
		return entity;
	}

	@Override
	public void setSession() {
		
	}

}
