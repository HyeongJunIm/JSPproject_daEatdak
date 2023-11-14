package com.daeatdak.myPage.vo;

public class MyPageWishListVO {

	private int userNum;
	private int wishlistNum;
	private int goodsNum;
	private String goodsName;
	private int goodsPrice;
	private int categoryNum;
	private String categoryName;
	private String filePath;
	private String fileSystemName;

	public int getUserNum() {
		return userNum;
	}

	public void setUserNum(int userNum) {
		this.userNum = userNum;
	}

	public int getWishlistNum() {
		return wishlistNum;
	}

	public void setWishlistNum(int wishlistNum) {
		this.wishlistNum = wishlistNum;
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

	public int getCategoryNum() {
		return categoryNum;
	}

	public void setCategoryNum(int categoryNum) {
		this.categoryNum = categoryNum;
	}

	public String getCategoryName() {
		return categoryName;
	}

	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
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
		return "MyPageWishListVO [userNum=" + userNum + ", wishlistNum=" + wishlistNum + ", goodsNum=" + goodsNum
				+ ", goodsName=" + goodsName + ", goodsPrice=" + goodsPrice + ", categoryNum=" + categoryNum
				+ ", categoryName=" + categoryName + ", filePath=" + filePath + ", fileSystemName=" + fileSystemName
				+ "]";
	}


}
