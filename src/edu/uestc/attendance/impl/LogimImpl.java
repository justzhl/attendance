package edu.uestc.attendance.impl;

import edu.uestc.attendance.service.LoginService;

public class LogimImpl implements LoginService {

	@Override
	public boolean Exist(String username, String password) {
		return false;
	}

	@Override
	public void setSession() {
		
	}

}
