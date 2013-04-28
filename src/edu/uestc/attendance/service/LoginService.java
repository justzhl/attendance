package edu.uestc.attendance.service;

public interface LoginService {
	//checkout is username with password exist
	public boolean Exist(String username,String password);
	
	public void setSession();
	
	
}
