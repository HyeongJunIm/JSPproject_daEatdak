package com.daeatdak.user.dto;

public class UserDTO {
	private int userNum;
	private String userEmail;
	private String userName;
	private String userPassword;
	private String userPhone;
	private String userRoll;

	public String getUserRoll() {
		return userRoll;
	}


	public UserDTO() {
		;
	}



	public int getUserNum() {
		return userNum;
	}


	public void setUserNum(int userNum) {
		this.userNum = userNum;
	}


	public String getUserEmail() {
		return userEmail;
	}


	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getUserPassword() {
		return userPassword;
	}


	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}


	public String getUserPhone() {
		return userPhone;
	}


	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}


	@Override
	public String toString() {
		return "UserDTO [userNum=" + userNum + ", userEmail=" + userEmail + ", userName=" + userName + ", userPassword="
				+ userPassword + ", userPhone=" + userPhone + ", userRoll=" + userRoll + "]";
	}



	}
