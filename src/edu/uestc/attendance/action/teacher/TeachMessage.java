package edu.uestc.attendance.action.teacher;

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

public class TeachMessage extends ActionSupport {
	private TeachMessageEntity record;
	private TeachMessageMapper service;
	private List<String> myInstructorId;
	
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
	
	//获取老师的行政班级id
	public void getMyInstructorId(){
		Map session = ActionContext.getContext().getSession();
		UserEntity user = (UserEntity)session.get("userinfo");
		HttpServletRequest request = ServletActionContext.getRequest();
		List<String> mytest = new ArrayList<String>();
		mytest.add("111111");
		mytest.add("22222222222");
		mytest.add("33333333333");
		mytest.add("44444444444");
		request.setAttribute("mytest",mytest);
		System.out.println("runing");
	}
	
	
	public String sendMessage(){
		System.out.println("step:1"+record.getContents());
		Map session = ActionContext.getContext().getSession();
		UserEntity user = (UserEntity)session.get("userinfo");
		if(UserEntity.TEACHERS != user.getUsertype()){
			return Action.ERROR;
		} else if(0>= user.getId()){
			return Action.ERROR;
		}
		record.setTeacher_id(user.getId());
		java.util.Date submit = new java.util.Date();
		record.setSubmit_time(new Date(submit.getTime()));
		if(record.getContents().length() <1){
			addFieldError("contents", "请输入内容.");
			return Action.INPUT;
		}
		if(record.getTime() == null){
			addFieldError("time", "请输入日期.");
			return Action.INPUT;
		}
		if(0>=record.getInstructor_id()){
			addFieldError("time", "请选择正确的班级.");
			return Action.INPUT;
		}
		int result = service.sendMessage(record);
		if(result == 1){
			System.out.println("contents:"+record.getContents());
			return Action.SUCCESS;
		}else{
			
		}
		return Action.SUCCESS;
	}
}
