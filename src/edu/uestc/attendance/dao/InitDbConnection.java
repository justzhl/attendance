package edu.uestc.attendance.dao;


import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class InitDbConnection {

	private SqlSessionFactory sqlSessionFactory;
	
	
	public boolean Init(UserEntity entity){
		SqlSession session = sqlSessionFactory.openSession();
		UserMapper map = session.getMapper(UserMapper.class);
		int result = map.checkLogin(entity);
		if(0<result){
			return true;
		} else {
			return false;
		}
	}
	
	public SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}

	
}
