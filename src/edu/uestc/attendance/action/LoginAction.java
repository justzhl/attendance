package edu.uestc.attendance.action;

import com.opensymphony.xwork2.ActionSupport;

import edu.uestc.attendance.dao.TeacherEntity;
import edu.uestc.attendance.service.LoginService;

public class LoginAction extends ActionSupport{
	private String userName;
	private String password;
	private LoginService login;
	private TeacherEntity teacher;
	private int id;
	private String name;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String execute() throws Exception {
		teacher = login.Exist(userName, password);
		if(null == teacher){
			return ERROR;
		} else {
			login.setSession();
			id = teacher.getId();
			name = teacher.getName();
			return SUCCESS;
		}
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
		return password;
	}

	public void setPassWord(String passWord) {
		this.password = passWord;
	}


}
