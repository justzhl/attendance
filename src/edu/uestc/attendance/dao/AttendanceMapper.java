package edu.uestc.attendance.dao;

import java.util.List;

public interface AttendanceMapper {
	//student
	public List<AttendanceEntity> listInterval(long stuid,int start,int end);
	//�����ܲ�ѯ
	public List<AttendanceEntity> listWeek(long stuid,int week);
	//������ʦ��ѯ
	public List<AttendanceEntity> listTeacher(long stuid,int teacherid);
	//���ս�ѧ���ѯ
	public List<AttendanceEntity> listInstruct(long stuid,int instruct);
	
	
 }
