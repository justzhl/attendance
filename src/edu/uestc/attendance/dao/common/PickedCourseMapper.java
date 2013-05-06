package edu.uestc.attendance.dao.common;
import java.util.List;

public interface PickedCourseMapper {
	//貌似还需要学期的参数
	///根据学号查找所选择的课程具体情况
	public List<PickedCourseEntity> listByStuID(long studentid);

	///根据教师编号查找所有的课程的具体情况
	public List<PickedCourseEntity> listByTeaID(long teacherid);
	
	
}
