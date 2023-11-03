package com.daeatdak.admin.dto;

public class GoodsDetailImageDTO {

	private int goodsDetailImageNumber;
	private String goodsDetailImagePath;
	private String goodsDetailImageOriginalName;
	private String goodsDetailImageSystemName;
	private int goodsNum;
	
	
	

	public int getGoodsNum() {
		return goodsNum;
	}

	public void setGoodsNum(int goodsNum) {
		this.goodsNum = goodsNum;
	}

	public int getGoodsDetailImageNumber() {
		return goodsDetailImageNumber;
	}

	public void setGoodsDetailImageNumber(int goodsDetailImageNumber) {
		this.goodsDetailImageNumber = goodsDetailImageNumber;
	}

	public String getGoodsDetailImagePath() {
		return goodsDetailImagePath;
	}

	public void setGoodsDetailImagePath(String goodsDetailImagePath) {
		this.goodsDetailImagePath = goodsDetailImagePath;
	}

	public String getGoodsDetailImageOriginalName() {
		return goodsDetailImageOriginalName;
	}

	public void setGoodsDetailImageOriginalName(String goodsDetailImageOriginalName) {
		this.goodsDetailImageOriginalName = goodsDetailImageOriginalName;
	}

	public String getGoodsDetailImageSystemName() {
		return goodsDetailImageSystemName;
	}

	public void setGoodsDetailImageSystemName(String goodsDetailImageSystemName) {
		this.goodsDetailImageSystemName = goodsDetailImageSystemName;
	}

	@Override
	public String toString() {
		return "GoodsDetailImageDTO [goodsDetailImageNumber=" + goodsDetailImageNumber + ", goodsDetailImagePath="
				+ goodsDetailImagePath + ", goodsDetailImageOriginalName=" + goodsDetailImageOriginalName
				+ ", goodsDetailImageSystemName=" + goodsDetailImageSystemName + ", goodsNum=" + goodsNum + "]";
	}

	
}