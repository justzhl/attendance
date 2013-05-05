package edu.uestc.attendance.impl;

import java.util.Map;

import org.apache.ibatis.session.SqlSessionFactory;

import com.opensymphony.xwork2.ActionContext;

import edu.uestc.attendance.dao.InitDbConnection;
import edu.uestc.attendance.dao.UserEntity;
import edu.uestc.attendance.dao.teacher.TeacherEntity;
import edu.uestc.attendance.service.LoginService;

public class LogimImpl implements LoginService {
	private SqlSessionFactory sqlSessionFactory;
	private UserEntity entity = new UserEntity();
	public SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}

	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}

	public UserEntity getEntity() {
		return entity;
	}

	public void setEntity(UserEntity entity) {
		this.entity = entity;
	}

	@Override
	public boolean Exist(String usertype,String username, String password) {
		//—È÷§∑«ø’
		if(password == null||username ==null||usertype == null){
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
		int result = sqlSessionFactory.openSession().selectOne("edu.uestc.attendance.dao.UserMapper.checkLogin",entity);
		if(0 == result){
			return false;
		}
		UserEntity user = sqlSessionFactory.openSession().selectOne("edu.uestc.attendance.dao.UserMapper.getItem",entity);
		setEntity(user);
		setSession(user);
		//set session
		return true;
	}

	@Override
	public void setSession(UserEntity user) {
		Map session = ActionContext.getContext().getSession();
		session.put("UserInfo", user);
	}
	
}
