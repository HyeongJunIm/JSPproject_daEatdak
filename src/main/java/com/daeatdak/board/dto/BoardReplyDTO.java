package com.daeatdak.board.dto;

public class BoardReplyDTO {

	private int commentNum;
	private String userNum;
	private String boardNum;
	private String commentContent;

	public int getCommentNum() {
		return commentNum;
	}

	public void setCommentNum(int commentNum) {
		this.commentNum = commentNum;
	}

	
	public String getUserNum() {
		return userNum;
	}

	public void setUserNum(String userNum) {
		this.userNum = userNum;
	}

	public String getBoardNum() {
		return boardNum;
	}

	public void setBoardNum(String boardNum) {
		this.boardNum = boardNum;
	}

	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}

	@Override
	public String toString() {
		return "BoardReplyDTO [boardNum=" + boardNum + ", commentContent=" + commentContent + ", commentNum="
				+ commentNum + ", userNum=" + userNum + "]";
	}

}
