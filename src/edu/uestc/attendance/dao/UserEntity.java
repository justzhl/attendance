package edu.uestc.attendance.dao;

public class UserEntity {
	private String user;
	private String pass;
	
	private String name;
	private int usertype;
	private String im;
	private String email;
	private String telphone;
	private long id;
	
	public final static int TEACHERS = 2;
	public final static int STUDENTS = 1;
	public final static int ADMINISTRATORS = 0;
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getUsertype() {
		return usertype;
	}
	public void setUsertype(int usertype) {
		this.usertype = usertype;
	}
	public String getIm() {
		return im;
	}
	public void setIm(String im) {
		this.im = im;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getTelphone() {
		return telphone;
	}
	public void setTelphone(String telphone) {
		this.telphone = telphone;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUser() {
		return user;
	}
	public void setUser(String user) {
		this.user = user;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	
}
