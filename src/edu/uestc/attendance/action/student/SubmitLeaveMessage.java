package edu.uestc.attendance.action.student;

import java.sql.Date;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import edu.uestc.attendance.dao.UserEntity;
import edu.uestc.attendance.dao.common.LeaveMessagesEntity;
import edu.uestc.attendance.impl.StudentSubmitLeaveMessage;
import edu.uestc.attendance.utils.Session;

public class SubmitLeaveMessage extends ActionSupport {
	private LeaveMessagesEntity msg;
	private StudentSubmitLeaveMessage service;
	public StudentSubmitLeaveMessage getService() {
		return service;
	}
	public void setService(StudentSubmitLeaveMessage service) {
		this.service = service;
	}
	public LeaveMessagesEntity getMsg() {
		return msg;
	}
	public void setMsg(LeaveMessagesEntity msg) {
		this.msg = msg;
	}
	
	public String submit(){
		UserEntity user = Session.getStudent();
		if(user == null){
			return Action.LOGIN;
		}
		System.out.println(msg.getContents());
		msg.setStudent_id(user.getId());
		msg.setSubmit_time(new Date(new java.util.Date().getTime()));
		int result = service.submit(msg);
		if(result == 0){
			return Action.ERROR;
		} else {
			return Action.SUCCESS;
		}
	}
	
	public void validateSubmit() {
		clearFieldErrors();
		if(msg.getContents() == null || msg.getContents().length() <10){
			addFieldError("contents", "请假内容长度不够.");
		} else if(msg.getInstructor_id() <= 0 ){
			addFieldError("instructor_id", "所选课程无效.");
		} else if(msg.getTime() == null || msg.getTime().getTime() < new java.util.Date().getTime()){
			addFieldError("instructor_id", "请申请正确可用的时间.");
		} 
	}
}
