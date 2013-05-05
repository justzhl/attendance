package edu.uestc.attendance.dao;

public interface UserMapper {
	public int checkLogin(UserEntity entity);
	public UserEntity getItem(UserEntity entity);
}
