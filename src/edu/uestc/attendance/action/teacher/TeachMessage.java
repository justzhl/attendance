package edu.uestc.attendance.action.teacher;

import java.nio.charset.Charset;
import java.sql.Date;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import edu.uestc.attendance.dao.UserEntity;
import edu.uestc.attendance.dao.teacher.TeachMessageEntity;
import edu.uestc.attendance.dao.teacher.TeachMessageMapper;
import edu.uestc.attendance.utils.Session;

public class TeachMessage extends ActionSupport {
	private TeachMessageEntity record;
	private TeachMessageMapper service;
	private List<String> myInstructorId;
	private Map jsonMap;
	public Map getJsonMap() {
		return jsonMap;
	}

	public void setJsonMap(Map jsonMap) {
		this.jsonMap = jsonMap;
	}

	public void setMyInstructorId(List<String> myInstructorId) {
		this.myInstructorId = myInstructorId;
	}

	public TeachMessageMapper getService() {
		return service;
	}

	public void setService(TeachMessageMapper service) {
		this.service = service;
	}

	public TeachMessageEntity getRecord() {
		return record;
	}

	public void setRecord(TeachMessageEntity record) {
		this.record = record;
	}
	
	//��ȡ��ʦ�������༶id
	public String getMyInstructorId(){
		UserEntity teacher = Session.getTeacher();
		if(teacher == null){
			System.out.println("error:1");
			return Action.ERROR;
		}
		this.myInstructorId = service.getMyInstructorId(teacher.getId());
		HttpServletRequest mysession = ServletActionContext.getRequest();
		if(mysession !=null){
			mysession.setAttribute("myInstructorId", myInstructorId);
			return Action.SUCCESS;
		}else {
			return Action.ERROR;
		}
	}
	
	//��ѯ��Ӧ��ʦ����Ϣ
	public String getMessage(){
		UserEntity user = Session.getTeacher();
		if(user == null){
			return Action.LOGIN;
		}
		List<edu.uestc.attendance.dao.student.TeachMessageEntity> lists = service.getAll(user.getId());
		jsonMap = new HashMap();
		jsonMap.put("aaData",lists);
		System.out.println(lists.size());
		return Action.SUCCESS;
	}
	
	
	//�ύ��ѧ��Ϣ
	public String sendMessage(){
		UserEntity user = Session.getTeacher();
		if(user == null){
			return Action.ERROR;
		}
		record.setTeacher_id(user.getId());
		record.setSubmit_time(new Date(new java.util.Date().getTime()));
		//String contents = new String(record.getContents().getBytes(),Charset.forName("utf-8"));
		//record.setContents(contents);
		int result = service.sendMessage(record);
		if(result == 1){
			return Action.SUCCESS;
		}else{
			clearFieldErrors();
			addFieldError("error", "����δ֪��������ϵ����Ա.");
			return Action.INPUT;
		}
	}

	public void validateSendMessage() {
		clearFieldErrors();
		if(record.getContents().length() <1){
			addFieldError("record.contents", "����������.");
			return;
		}
		if(record.getTime() == null){
			addFieldError("record.time", "����������,����ʹ����ȷ�ĸ�ʽ.");
			return;
		} else if(record.getTime().getTime() < new java.util.Date().getTime()){
			addFieldError("record.time", "��ѡ������Ч.");
			return;
		}
		if(0>=record.getInstructor_id()){
			
			addFieldError("record.instructor_id", "��ѡ����ȷ�İ༶.");
			return;
		}
	}
	
	
}
