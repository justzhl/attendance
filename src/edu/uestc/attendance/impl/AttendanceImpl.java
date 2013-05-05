package edu.uestc.attendance.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;

import edu.uestc.attendance.dao.AttendanceEntity;
import edu.uestc.attendance.dao.AttendanceMapper;
import edu.uestc.attendance.service.AttendanceService;

public class AttendanceImpl implements AttendanceService {
	private SqlSessionFactory sqlSessionFactory;
	@Override
	public List<AttendanceEntity> listInterval(long stuid, int start, int end) {
		AttendanceMapper map = sqlSessionFactory.openSession().getMapper(AttendanceMapper.class);
		return map.listInterval(stuid, start, end);
	}
	public SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}
	
}
