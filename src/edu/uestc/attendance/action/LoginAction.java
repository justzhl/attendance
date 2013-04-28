package edu.uestc.attendance.action;

import edu.uestc.attendance.service.LoginService;

public class LoginAction {
	private String userName;
	private String passWord;
	private LoginService login;


	public String execute() throws Exception {
		if(login.Exist(userName, passWord)){
			login.setSession();
			return "SUCCESS";
		}
		return "ERROR";
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

	public String getPassWord() {
		return passWord;
	}

	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}


}
