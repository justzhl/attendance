package edu.uestc.attendance.action;

import com.opensymphony.xwork2.ActionSupport;

import edu.uestc.attendance.dao.TeacherEntity;
import edu.uestc.attendance.service.LoginService;

public class LoginAction extends ActionSupport{
	private String userName;
	private String password;
	private String usertype;
	private LoginService login;

	public String getUsertype() {
		return usertype;
	}
	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public LoginService getLogin() {
		return login;
	}
	public void setLogin(LoginService login) {
		this.login = login;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String execute() throws Exception {
		if(!login.Exist(usertype,userName, password)){
			return ERROR;
		} else {
			login.setSession();
			return SUCCESS;
		}
	}
	
}
