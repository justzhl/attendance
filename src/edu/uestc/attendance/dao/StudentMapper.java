package edu.uestc.attendance.dao;

import java.util.List;

//mybatis�����ӿ�
public interface StudentMapper {
	//��¼��������ѯ���ݿ��е����ݣ�ȷ�����ݿ��д��ڴ˼�¼
	public int loginAction(String user,String pass);
	
	public StudentEntity getItem(int id);
	
	public List<StudentEntity> getLists();
}
