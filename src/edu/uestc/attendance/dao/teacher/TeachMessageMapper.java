package edu.uestc.attendance.dao.teacher;

import java.sql.Date;
import java.util.List;
import java.util.Map;

public interface TeachMessageMapper {
	public List<TeachMessageEntity> getAll(int teacherid);
	
	//��ȡaftertime֮���������Ϣ
	public List<TeachMessageEntity> getAllAfterTime(int teacherid,Date aftertime);
	
	//�����������ȡ��Ϣ��Ĭ��Ϊ��ǰʱ��֮��
	public List<TeachMessageEntity> getCourseAfterTime(int instructid,Date aftertime);
	
	//�����������ȡ��Ϣ
	public List<TeachMessageEntity> getCourseAll(int instructorid);
	
	//�ύ��Ϣ
	public int sendMessage(TeachMessageEntity msg);
	
	
	//��ȡ��ʦ�������༶id
	public List<String> getMyInstructorId(long id);
}
