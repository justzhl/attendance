package edu.uestc.attendance.action;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import edu.uestc.attendance.dao.UserEntity;
import edu.uestc.attendance.dao.common.AttendanceEntity;
import edu.uestc.attendance.impl.AttendanceImpl;

public class AttendanceAction extends ActionSupport {
	private AttendanceImpl attendance;
	private long stuid;
	private int start;
	private int end;
	private List<AttendanceEntity> entity;
	
	
	public List<AttendanceEntity> getEntity() {
		return entity;
	}


	public void setEntity(List<AttendanceEntity> entity) {
		this.entity = entity;
	}


	public long getStuid() {
		return stuid;
	}


	public void setStuid(long stuid) {
		this.stuid = stuid;
	}


	public int getStart() {
		return start;
	}


	public void setStart(int start) {
		this.start = start;
	}


	public int getEnd() {
		return end;
	}


	public void setEnd(int end) {
		this.end = end;
	}


	public AttendanceImpl getAttendance() {
		return attendance;
	}


	public void setAttendance(AttendanceImpl attendance) {
		this.attendance = attendance;
	}


	public String execute(){
		entity = attendance.listInterval(stuid, start, end);
		Map session = ActionContext.getContext().getSession();
		UserEntity user = (UserEntity)session.get("UserInfo");
		setEntity(entity);
		System.out.println(entity.get(0).getStudent_id());
		System.out.println(entity.get(0).getTeacher_id());
		System.out.println(entity.get(0).getWeek());
		System.out.println(entity.get(0).getTime());
		System.out.println(entity.get(0).getTeacher_name());
		System.out.println(entity.get(0).getStudent_name());
		System.out.println("当前登录用户："+user.getName());
		return Action.SUCCESS;
	}
}
