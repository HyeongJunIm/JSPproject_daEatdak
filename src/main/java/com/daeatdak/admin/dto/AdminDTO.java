package com.daeatdak.admin.dto;

public class AdminDTO {
	
	private int categoryNum;
	private int goodsNum;
	private String goodsName;
	private int goodsQuantity;
	private int goodsPrice;
	private int saleCount;
	


	public AdminDTO() {
		;
	}

	public int getGoodsNum() {
		return goodsNum;
	}

	public void setGoodsNum(int goodsNum) {
		this.goodsNum = goodsNum;
	}
	
	public int getCategoryNum() {
		return categoryNum;
	}

	public void setCategoryNum(int categoryNum) {
		this.categoryNum = categoryNum;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public int getGoodsQuantity() {
		return goodsQuantity;
	}

	public void setGoodsQuantity(int goodsQuantity) {
		this.goodsQuantity = goodsQuantity;
	}

	public int getGoodsPrice() {
		return goodsPrice;
	}

	public void setGoodsPrice(int goodsPrice) {
		this.goodsPrice = goodsPrice;
	}

	public int getSaleCount() {
		return saleCount;
	}

	public void setSaleCount(int saleCount) {
		this.saleCount = saleCount;
	}

	@Override
	public String toString() {
		return "AdminDTO [categoryNum=" + categoryNum + ", goodsNum=" + goodsNum + ", goodsName=" + goodsName
				+ ", goodsQuantity=" + goodsQuantity + ", goodsPrice=" + goodsPrice + ", saleCount=" + saleCount + "]";
	}




 
	




}
