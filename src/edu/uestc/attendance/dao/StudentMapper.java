package edu.uestc.attendance.dao;

import java.util.List;

//mybatis操作接口
public interface StudentMapper {
	//登录操作，查询数据库中的数据，确认数据库中存在此记录
	public int loginAction(String user,String pass);
	
	public StudentEntity getItem(int id);
	
	public List<StudentEntity> getLists();
}
