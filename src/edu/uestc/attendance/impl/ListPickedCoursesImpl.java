package edu.uestc.attendance.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;

import edu.uestc.attendance.dao.common.PickedCourseEntity;
import edu.uestc.attendance.dao.common.PickedCourseMapper;

public class ListPickedCoursesImpl implements PickedCourseMapper {
	private SqlSessionFactory sqlSessionFactory;
	public SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}

	@Override
	public List<PickedCourseEntity> listByStuID(long studentid) {
		PickedCourseMapper mapper = sqlSessionFactory.openSession().getMapper(PickedCourseMapper.class);
		return mapper.listByStuID(studentid);
	}

	@Override
	public List<PickedCourseEntity> listByTeaID(long teacherid) {
		PickedCourseMapper mapper = sqlSessionFactory.openSession().getMapper(PickedCourseMapper.class);
		return mapper.listByTeaID(teacherid);
	}

}
