package edu.uestc.attendance.impl;

import java.sql.Date;
import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;

import edu.uestc.attendance.dao.UserEntity;
import edu.uestc.attendance.dao.student.TeachMessageEntity;
import edu.uestc.attendance.dao.student.TeachMessageMapper;

public class TeachMessageImpl implements TeachMessageMapper {
	private SqlSessionFactory sqlSessionFactory;
	private TeachMessageEntity entity;
	public TeachMessageEntity getEntity() {
		return entity;
	}

	public void setEntity(TeachMessageEntity entity) {
		this.entity = entity;
	}

	public SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}

	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}


	@Override
	public List<TeachMessageEntity> getAll(long stuid) {	
		TeachMessageMapper mapper = sqlSessionFactory.openSession().getMapper(TeachMessageMapper.class);
		return mapper.getAll(stuid);
	}

	@Override
	public List<TeachMessageEntity> getAllAfterTime(long stuid, Date aftertime) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TeachMessageEntity> getCourseAfterTime(long stuid,
			Date aftertime) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TeachMessageEntity> getCourseAll(long stuid, int instructorid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TeachMessageEntity> getCourseAfterTime(long stuid,
			int instructorid) {
		// TODO Auto-generated method stub
		return null;
	}

}
