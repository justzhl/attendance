package edu.uestc.attendance.dao;


import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class InitDbConnection {

	String resource = "mybatis-config.xml";
	static SqlSessionFactory sqlSessionFactory;
	
	public TeacherEntity Init(){
		try {
			InputStream is = Resources.getResourceAsStream(resource);
			sqlSessionFactory = new SqlSessionFactoryBuilder().build(is);
			SqlSession session = sqlSessionFactory.openSession();
			TeacherMapper mapper = session.getMapper(TeacherMapper.class);
			TeacherEntity entity = mapper.getItem(1);
			return entity;
		} catch (IOException e) {
			e.printStackTrace();
		} 
		return null;
	}
}
