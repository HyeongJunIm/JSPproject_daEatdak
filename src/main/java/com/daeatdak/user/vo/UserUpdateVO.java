package com.daeatdak.user.vo;

public class UserUpdateVO {
	private int userNum;
	private String userPassword;
	private String address;
	private String detailAddress;

	public int getUserNum() {
		return userNum;
	}

	public void setUserNum(int userNum) {
		this.userNum = userNum;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getDetailAddress() {
		return detailAddress;
	}

	public void setDetailAddress(String detailAddress) {
		this.detailAddress = detailAddress;
	}

	@Override
	public String toString() {
		return "UserUpdateVO [userNum=" + userNum + ", userPassword=" + userPassword + ", address=" + address
				+ ", detailAddress=" + detailAddress + "]";
	}

}
