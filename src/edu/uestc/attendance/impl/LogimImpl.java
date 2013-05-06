package edu.uestc.attendance.impl;

import java.util.Map;

import org.apache.ibatis.session.SqlSessionFactory;

import com.opensymphony.xwork2.ActionContext;

import edu.uestc.attendance.dao.UserEntity;
import edu.uestc.attendance.dao.UserMapper;
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
	public boolean Exist(int usertype,long id, String password) {
		//—È÷§∑«ø’
		if(password == null||id == 0){
			return false;
		}
		entity.setId(id);
		entity.setPass(password);
		entity.setUsertype(usertype);
		UserMapper mapper = sqlSessionFactory.openSession().getMapper(UserMapper.class);
		int result = mapper.checkLogin(entity);
		if(0 == result){
			return false;
		}
		UserEntity user = mapper.getItem(entity);
		//set usertype
		setEntity(user);
		setSession(user);
		//set session
		return true;
	}

	@Override
	public void setSession(UserEntity user) {
		Map session = ActionContext.getContext().getSession();
		session.put("userinfo", user);
	}
	
}
