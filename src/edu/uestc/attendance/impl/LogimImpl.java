package edu.uestc.attendance.impl;

import edu.uestc.attendance.dao.InitDbConnection;
import edu.uestc.attendance.dao.LoginEntity;
import edu.uestc.attendance.dao.TeacherEntity;
import edu.uestc.attendance.service.LoginService;

public class LogimImpl implements LoginService {
	private InitDbConnection conn;
	private LoginEntity entity = new LoginEntity();
	@Override
	public boolean Exist(String usertype,String username, String password) {
		//—È÷§∑«ø’
		if(password == null ){
			return false;
		}
		entity.setUser(username);
		entity.setPass(password);
		if(usertype.equals("admin")){
			entity.setType("administrators");
		} else if(usertype.equals("teacher")) {
			entity.setType("teachers");
		} else if(usertype.equals("student")) {
			entity.setType("students");
		}
		return conn.Init(entity);
	}

	@Override
	public void setSession() {
		
	}

	public InitDbConnection getConn() {
		return conn;
	}

	public void setConn(InitDbConnection conn) {
		this.conn = conn;
	}
	
}
