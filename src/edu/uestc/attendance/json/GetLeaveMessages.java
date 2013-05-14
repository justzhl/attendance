package edu.uestc.attendance.json;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import edu.uestc.attendance.dao.UserEntity;
import edu.uestc.attendance.dao.common.LeaveMessagesEntity;
import edu.uestc.attendance.dao.common.LeaveMessagesMapper;
import edu.uestc.attendance.utils.Session;

public class GetLeaveMessages extends ActionSupport{
	private LeaveMessagesMapper service;
	private Map jsonMap;
	
	public String getMessageByStuSession(){
		UserEntity user = Session.getStudent();
		if(user== null){
			return Action.ERROR;
		}
		jsonMap = new HashMap();
		List<LeaveMessagesEntity> lists = service.getMessagesByStuId(user.getId());
		jsonMap.put("aaData", lists);
		return Action.SUCCESS;
	}
	
	public String getMessageByTeacherSession(){
		UserEntity user = Session.getTeacher();
		if(user== null){
			return Action.ERROR;
		}
		jsonMap = new HashMap();
		List<LeaveMessagesEntity> lists = service.getMessagesByTeacherId(user.getId());
		jsonMap.put("aaData", lists);
		return Action.SUCCESS;
	}
	
	
	
	public Map getJsonMap() {
		return jsonMap;
	}
	public void setJsonMap(Map jsonMap) {
		this.jsonMap = jsonMap;
	}
	public LeaveMessagesMapper getService() {
		return service;
	}
	public void setService(LeaveMessagesMapper service) {
		this.service = service;
	}
}
