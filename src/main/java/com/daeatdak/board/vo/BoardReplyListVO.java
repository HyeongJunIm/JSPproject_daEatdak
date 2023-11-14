package com.daeatdak.board.vo;

public class BoardReplyListVO {

	private int commentNum;
	private String boardNum;
	private String userNum;
	private String userName;
	private String commentContent;
	private Integer userRoll;

	public int getCommentNum() {
		return commentNum;
	}

	public void setCommentNum(int commentNum) {
		this.commentNum = commentNum;
	}

	
	public String getBoardNum() {
		return boardNum;
	}

	public void setBoardNum(String boardNum) {
		this.boardNum = boardNum;
	}

	public String getUserNum() {
		return userNum;
	}

	public void setUserNum(String userNum) {
		this.userNum = userNum;
	}
	
	

	public Integer getUserRoll() {
		return userRoll;
	}

	public void setUserRoll(Integer userRoll) {
		this.userRoll = userRoll;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	@Override
	public String toString() {
		return "BoardReplyListVO [commentNum=" + commentNum + ", boardNum=" + boardNum + ", userNum=" + userNum
				+ ", userName=" + userName + ", commentContent=" + commentContent + ", userRoll=" + userRoll + "]";
	}

	

}
