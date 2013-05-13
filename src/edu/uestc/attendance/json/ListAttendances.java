package edu.uestc.attendance.json;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import edu.uestc.attendance.dao.UserEntity;
import edu.uestc.attendance.dao.common.AttendanceEntity;
import edu.uestc.attendance.impl.AttendanceImpl;

public class ListAttendances extends ActionSupport {
	private List<AttendanceEntity> lists;
	private Map dataMap;
	private AttendanceImpl service;
	public AttendanceImpl getService() {
		return service;
	}

	public void setService(AttendanceImpl service) {
		this.service = service;
	}

	public List<AttendanceEntity> getLists() {
		return lists;
	}

	public void setLists(List<AttendanceEntity> lists) {
		this.lists = lists;
	}

	public Map getDataMap() {
		return dataMap;
	}

	public void setDataMap(Map dataMap) {
		this.dataMap = dataMap;
	}

	public String execute(){
		Map session = ActionContext.getContext().getSession();
		UserEntity user = (UserEntity)session.get("userinfo");
		if(null==user){
			return Action.LOGIN;
		} else if(user.getId() == 0){
			return Action.ERROR;
		}
		lists = service.listInterval(user.getId(), 1, 9);
		dataMap = new HashMap();
		dataMap.put("aaData", lists);
		return Action.SUCCESS;
	}
}	
