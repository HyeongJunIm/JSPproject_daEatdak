package com.daeatdak.goods.dto;

public class GoodsSearchDTO {

	private String cate;
    private String keyword;
	public String getCate() {
		return cate;
	}
	public void setCate(String cate) {
		this.cate = cate;
	}
	public String getKeyword() {
		return keyword;
	}
	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}
	@Override
	public String toString() {
		return "GoodsSearchDTO [cate=" + cate + ", keyword=" + keyword + "]";
	}
    
    


	
	
	
	
}
