package com.daeatdak.myPage.dto;

public class WishlistDTO {

	private int wishlistNum;
	private int userNum;
	private int goodsNum;
	private int wishlistPick;

	public int getWishlistNum() {
		return wishlistNum;
	}

	public void setWishlistNum(int wishlistNum) {
		this.wishlistNum = wishlistNum;
	}

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

	public int getWishlistPick() {
		return wishlistPick;
	}

	public void setWishlistPick(int wishlistPick) {
		this.wishlistPick = wishlistPick;
	}

	@Override
	public String toString() {
		return "WishlistDTO [wishlistNum=" + wishlistNum + ", userNum=" + userNum + ", goodsNum=" + goodsNum
				+ ", wishlistPick=" + wishlistPick + "]";
	}

}
