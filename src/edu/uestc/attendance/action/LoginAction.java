package edu.uestc.attendance.action;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import edu.uestc.attendance.dao.teacher.TeacherEntity;
import edu.uestc.attendance.service.LoginService;

public class LoginAction extends ActionSupport{
	private long id;
	private String password;
	private int usertype;
	private LoginService login;
	private Map session;
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public Map getSession() {
		return session;
	}
	public void setSession(Map session) {
		this.session = session;
	}
	public int getUsertype() {
		return usertype;
	}
	public void setUsertype(int usertype) {
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


	public String execute() throws Exception {
		if(!login.Exist(usertype,id, password)){
			return ERROR;
		} else {
			return SUCCESS;
		}
	}
	
}
