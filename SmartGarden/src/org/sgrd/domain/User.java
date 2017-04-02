package org.sgrd.domain;

import java.io.Serializable;

public class User implements Serializable{

	public User() {
		// TODO Auto-generated constructor stub
	}
	
	private Integer userId;
	private String userName;
	private String userPwd;
	private Integer userRight;
	private String userSex;
	private String userMail;
	private String userPhone;
	private Integer userAge;
	private String userHis;
	public Integer getUserId() {
		return userId;
	}
	public void setUserId(Integer userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserPwd() {
		return userPwd;
	}
	public void setUserPwd(String userPwd) {
		this.userPwd = userPwd;
	}
	public Integer getUserRight() {
		return userRight;
	}
	public void setUserRight(Integer userRight) {
		this.userRight = userRight;
	}
	public String getUserSex() {
		return userSex;
	}
	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}
	public String getUserMail() {
		return userMail;
	}
	public void setUserMail(String userMail) {
		this.userMail = userMail;
	}
	public String getUserPhone() {
		return userPhone;
	}
	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}
	public Integer getUserAge() {
		return userAge;
	}
	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}
	public String getUserHis() {
		return userHis;
	}
	public void setUserHis(String userHis) {
		this.userHis = userHis;
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", userName=" + userName
				+ ", userPwd=" + userPwd + ", userRight=" + userRight
				+ ", userSex=" + userSex + ", userMail=" + userMail
				+ ", userPhone=" + userPhone + ", userAge=" + userAge
				+ ", userHis=" + userHis + "]";
	}
	
	
	
	
	
}
