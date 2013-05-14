package edu.uestc.attendance.dao.teacher;

import java.sql.Date;
import java.util.List;

public interface TeachMessageMapper {
	public List<edu.uestc.attendance.dao.student.TeachMessageEntity> getAll(long teacherid);
	
	//��ȡaftertime֮���������Ϣ
	public List<TeachMessageEntity> getAllAfterTime(long teacherid,Date aftertime);
	
	//�����������ȡ��Ϣ��Ĭ��Ϊ��ǰʱ��֮��
	public List<TeachMessageEntity> getCourseAfterTime(int instructid,Date aftertime);
	
	//�����������ȡ��Ϣ
	public List<TeachMessageEntity> getCourseAll(int instructorid);
	
	//�ύ��Ϣ
	public int sendMessage(TeachMessageEntity msg);
	
	
	//��ȡ��ʦ�������༶id
	public List<String> getMyInstructorId(long id);
}
