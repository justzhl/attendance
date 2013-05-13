package edu.uestc.attendance.dao.student;

import java.sql.Date;
import java.util.List;

public interface TeachMessageMapper {
	public List<TeachMessageEntity> getAll(long stuid);
	
	//��ȡaftertime֮���������Ϣ
	public List<TeachMessageEntity> getAllAfterTime(long stuid,Date aftertime);
	
	//�����������ȡ��Ϣ��Ĭ��Ϊ��ǰʱ��֮��
	public List<TeachMessageEntity> getCourseAfterTime(long stuid,Date aftertime);
	
	//�����������ȡ��Ϣ
	public List<TeachMessageEntity> getCourseAll(long stuid,int instructorid);
	
	//���ݽ�ʦ��ȡ��Ϣ
	public List<TeachMessageEntity> getCourseAfterTime(long stuid,int instructorid);
}
