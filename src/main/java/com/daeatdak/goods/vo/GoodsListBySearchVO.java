package com.daeatdak.goods.vo;

public class GoodsListBySearchVO {

	private int goodsNum;
	private int categoryNum;
	private String goodsName;
	private int goodsPrice;
	private String categoryName;
	private int goodsQuantity;
	private String filePath;
	private String fileSystemName;
	
	
	
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
	public int getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(int goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	public int getGoodsQuantity() {
		return goodsQuantity;
	}
	public void setGoodsQuantity(int goodsQuantity) {
		this.goodsQuantity = goodsQuantity;
	}
	public String getFilePath() {
		return filePath;
	}
	public void setFilePath(String filePath) {
		this.filePath = filePath;
	}
	public String getFileSystemName() {
		return fileSystemName;
	}
	public void setFileSystemName(String fileSystemName) {
		this.fileSystemName = fileSystemName;
	}
	@Override
	public String toString() {
		return "GoodsListByCategoryVO [goodsNum=" + goodsNum + ", categoryNum=" + categoryNum + ", goodsName="
				+ goodsName + ", goodsPrice=" + goodsPrice + ", categoryName=" + categoryName + ", goodsQuantity="
				+ goodsQuantity + ", filePath=" + filePath + ", fileSystemName=" + fileSystemName + "]";
	}
	
	
	
	
	
}


