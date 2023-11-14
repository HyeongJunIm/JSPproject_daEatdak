package com.daeatdak.goods.vo;

public class CartItemVO {
	private int cartItemNum;
	private int cartNum;
	private int goodsNum;
	private String goodsName;
	private int goodsPrice;
	private String filePath;
	private String fileSystemName;
	public int getCartItemNum() {
		return cartItemNum;
	}
	public void setCartItemNum(int cartItemNum) {
		this.cartItemNum = cartItemNum;
	}
	public int getCartNum() {
		return cartNum;
	}
	public void setCartNum(int cartNum) {
		this.cartNum = cartNum;
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
		return "CartItemVO [cartItemNum=" + cartItemNum + ", cartNum=" + cartNum + ", goodsNum=" + goodsNum
				+ ", goodsName=" + goodsName + ", goodsPrice=" + goodsPrice + ", filePath=" + filePath
				+ ", fileSystemName=" + fileSystemName + "]";
	}
	
	
	
	
	
	
}
