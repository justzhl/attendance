package edu.uestc.attendance.action;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

import edu.uestc.attendance.dao.UserEntity;
import edu.uestc.attendance.dao.common.PickedCourseEntity;
import edu.uestc.attendance.dao.common.PickedCourseMapper;

public class listpickedcoursesAction extends ActionSupport {
	private long studentid;
	private int teacherid;
	private Map dataSet;
	private PickedCourseMapper pickedCourse;
	
	
	public Map getDataSet() {
		return dataSet;
	}
	public void setDataSet(Map dataSet) {
		this.dataSet = dataSet;
	}
	public PickedCourseMapper getPickedCourse() {
		return pickedCourse;
	}
	public void setPickedCourse(PickedCourseMapper pickedCourse) {
		this.pickedCourse = pickedCourse;
	}
	public long getStudentid() {
		return studentid;
	}
	public void setStudentid(long studentid) {
		this.studentid = studentid;
	}
	public int getTeacherid() {
		return teacherid;
	}
	public void setTeacherid(int teacherid) {
		this.teacherid = teacherid;
	}
	
	@Override
	public String execute(){
		List<PickedCourseEntity> result;
		//������ڽ�ʦid����ô�ý�ʦidȥ����
		if(teacherid!=0){
			result = pickedCourse.listByTeaID(teacherid);
		}
		//�������ѧ�ţ���ô��ѧ��ȥ����
		if(studentid!=0){
			result = pickedCourse.listByStuID(studentid);
		}
		//Ĭ��ʹ���Լ�session�е�idȥ����
		Map session = ActionContext.getContext().getSession();
		UserEntity user = (UserEntity)session.get("userinfo");
		if(user==null){
			return Action.ERROR;
		}
		if(UserEntity.STUDENTS == user.getUsertype()){
			result = pickedCourse.listByStuID(user.getId());
		} else if(UserEntity.TEACHERS== user.getUsertype()){
			result = pickedCourse.listByTeaID(user.getId());
		} else{
			return Action.LOGIN;
		}
		if(result == null){
			return Action.ERROR;
		} else {
			dataSet = new HashMap();
			dataSet.put("aaData",result);
		}
		return Action.SUCCESS;
	}
	
}
