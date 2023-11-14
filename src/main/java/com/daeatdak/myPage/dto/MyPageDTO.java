package com.daeatdak.myPage.dto;

public class MyPageDTO {

	private int userNum;
	private int goodsNum;
	private String goodsName;
	private int goodsPrice;
	
	
	public int getUserNum() {
		return userNum;
	}
	public void setUserNum(int userNum) {
		this.userNum = userNum;
	}
	public int getGoodsNum() {
		return goodsNum;
	}
	public void setGoodsNum(int goodsNum) {
		this.goodsNum = goodsNum;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public int getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(int goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	@Override
	public String toString() {
		return "MyPageDTO[userNum=" + userNum + ", goodsNum=" + goodsNum + 
				", goodsName=" + goodsName + ", goodsPrice=" + goodsPrice + "]";
	}
}
