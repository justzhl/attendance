package edu.uestc.attendance.action.student;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import edu.uestc.attendance.dao.UserEntity;
import edu.uestc.attendance.dao.student.TeachMessageEntity;
import edu.uestc.attendance.dao.student.TeachMessageMapper;

public class GetTeachMessageAction extends ActionSupport {
	private TeachMessageMapper mapper;
	private Map dataMap;
	private List<TeachMessageEntity> result;
	
	public TeachMessageMapper getMapper() {
		return mapper;
	}


	public void setMapper(TeachMessageMapper mapper) {
		this.mapper = mapper;
	}


	public Map getDateMap() {
		return dataMap;
	}


	public void setDateMap(Map dataMap) {
		this.dataMap = dataMap;
	}


	public Map getDataMap() {
		return dataMap;
	}


	public void setDataMap(Map dataMap) {
		this.dataMap = dataMap;
	}


	public List<TeachMessageEntity> getResult() {
		return result;
	}


	public void setResult(List<TeachMessageEntity> result) {
		this.result = result;
	}


	///通过session中的id来获取所有的教学通知
	///
	///
	public String execute(){
		Map session = ActionContext.getContext().getSession();
		UserEntity user = (UserEntity)session.get("userinfo");
		if(null == user){
			return Action.LOGIN;
		} else if(user.getUsertype() != user.STUDENTS){
			return Action.ERROR;
		}
		long stuid = user.getId();
		if(stuid == 0){
			return Action.ERROR;
		} else {
			this.result = mapper.getAll(stuid);
			this.dataMap = new HashMap();
			this.dataMap.put("aaData", this.result);
			if(result.size() == 0) {
				System.out.println("null date found");
			} else {
				System.out.println("date found"+ result.get(0).getCourse_name());
			}
			return Action.SUCCESS;
		}
	}
}
