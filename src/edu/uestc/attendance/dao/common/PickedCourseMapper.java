package edu.uestc.attendance.dao.common;
import java.util.List;

public interface PickedCourseMapper {
	//ò�ƻ���Ҫѧ�ڵĲ���
	///����ѧ�Ų�����ѡ��Ŀγ̾������
	public List<PickedCourseEntity> listByStuID(long studentid);

	///���ݽ�ʦ��Ų������еĿγ̵ľ������
	public List<PickedCourseEntity> listByTeaID(long teacherid);
	
	
}
