package edu.uestc.attendance.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

import edu.uestc.attendance.dao.StudentEntity;
import edu.uestc.attendance.dao.StudentMapper;
import edu.uestc.attendance.service.TeacherService;

public class TeacherImpl implements TeacherService {
	private SqlSessionFactory sqlSessionFactory;


	public SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}


	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}


	@Override
	public List<StudentEntity> listStudents() {
		SqlSession sess = sqlSessionFactory.openSession();
		StudentMapper mapp = sess.getMapper(StudentMapper.class);
		return mapp.getLists();
	}

}
