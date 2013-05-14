package edu.uestc.attendance.impl;

import org.apache.ibatis.session.SqlSessionFactory;

import edu.uestc.attendance.dao.common.LeaveMessagesEntity;
import edu.uestc.attendance.dao.student.SubmitLeaveMessageMapper;

public class StudentSubmitLeaveMessage implements SubmitLeaveMessageMapper {
	private SqlSessionFactory sqlSessionFactory;
	@Override
	public int submit(LeaveMessagesEntity msg) {
		SubmitLeaveMessageMapper mapper= sqlSessionFactory.openSession().getMapper(SubmitLeaveMessageMapper.class);
		return mapper.submit(msg);
	}
	public SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}

}
