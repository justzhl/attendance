package edu.uestc.attendance.impl;

import java.sql.Date;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSessionFactory;

import edu.uestc.attendance.dao.teacher.TeachMessageEntity;
import edu.uestc.attendance.dao.teacher.TeachMessageMapper;

public class TeachersMessageImpl implements TeachMessageMapper {
	private SqlSessionFactory sqlSessionFactory;
	public SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}

	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public List<TeachMessageEntity> getAll(int teacherid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TeachMessageEntity> getAllAfterTime(int teacherid,
			Date aftertime) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TeachMessageEntity> getCourseAfterTime(int instructid,
			Date aftertime) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<TeachMessageEntity> getCourseAll(int instructorid) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int sendMessage(TeachMessageEntity msg) {
		TeachMessageMapper mapper = sqlSessionFactory.openSession().getMapper(TeachMessageMapper.class);
		return mapper.sendMessage(msg);
	}
	
	public List<String> getMyInstructorId(long id){
		TeachMessageMapper mapper = sqlSessionFactory.openSession().getMapper(TeachMessageMapper.class);
		return mapper.getMyInstructorId(id);
	}

}
