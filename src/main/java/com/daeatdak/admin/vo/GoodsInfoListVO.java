package com.daeatdak.admin.vo;

public class GoodsInfoListVO {
	
	private int goodsNum;
	private String categoryName;
	private String goodsName;
	private int goodsPrice;
	private int goodsQuantity;
	
	


	public GoodsInfoListVO() {
		;
	}


	public int getGoodsNum() {
		return goodsNum;
	}


	public void setGoodsNum(int goodsNum) {
		this.goodsNum = goodsNum;
	}


	public String getCategoryName() {
		return categoryName;
	}


	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
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


	public int getGoodsQuantity() {
		return goodsQuantity;
	}


	public void setGoodsQuantity(int goodsQuantity) {
		this.goodsQuantity = goodsQuantity;
	}


	@Override
	public String toString() {
		return "GoodsInfoListVO [goodsNum=" + goodsNum + ", categoryName=" + categoryName + ", goodsName=" + goodsName
				+ ", goodsPrice=" + goodsPrice + ", goodsQuantity=" + goodsQuantity + "]";
	}


	

	
	
	
}