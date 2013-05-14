package edu.uestc.attendance.utils;

import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import edu.uestc.attendance.dao.UserEntity;

public class Session extends ActionSupport {
	public static Map getTeacherSession(){
		Map session = ActionContext.getContext().getSession();
		UserEntity teacher = (UserEntity)session.get("userinfo");
		if(teacher == null){
			return null;
		}else if(teacher.getUsertype()!=UserEntity.TEACHERS){
			return null;
		} else if(teacher.getId()<=0){
			return null;
		} else {
			return session;
		}
	}
	
	public static UserEntity getTeacher(){
		Map session = getTeacherSession();
		return session == null?null:(UserEntity)session.get("userinfo");
	}
	
	
	public static Map getStudentSession(){
		Map session = ActionContext.getContext().getSession();
		UserEntity student = (UserEntity)session.get("userinfo");
		if(student == null){
			return null;
		}else if(student.getUsertype()!=UserEntity.STUDENTS){
			return null;
		} else if(student.getId()<=0){
			return null;
		} else {
			return session;
		}
		
	}
	
	public static UserEntity getStudent(){
		Map session = getStudentSession();
		return session == null?null:(UserEntity)session.get("userinfo");
	}	
}
