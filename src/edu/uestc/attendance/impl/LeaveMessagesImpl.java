package edu.uestc.attendance.impl;

import java.util.List;

import org.apache.ibatis.session.SqlSessionFactory;

import edu.uestc.attendance.dao.common.LeaveMessagesEntity;
import edu.uestc.attendance.dao.common.LeaveMessagesMapper;

public class LeaveMessagesImpl implements LeaveMessagesMapper {
	private SqlSessionFactory sqlSessionFactory;
	public SqlSessionFactory getSqlSessionFactory() {
		return sqlSessionFactory;
	}
	public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
		this.sqlSessionFactory = sqlSessionFactory;
	}
	@Override
	public List<LeaveMessagesEntity> getMessagesByStuId(long id) {
		LeaveMessagesMapper mapper = sqlSessionFactory.openSession().getMapper(LeaveMessagesMapper.class);
		return mapper.getMessagesByStuId(id);
	}

	@Override
	public List<LeaveMessagesEntity> getMessagesByTeacherId(long id) {
		LeaveMessagesMapper mapper = sqlSessionFactory.openSession().getMapper(LeaveMessagesMapper.class);
		return mapper.getMessagesByTeacherId(id);
	}

}
