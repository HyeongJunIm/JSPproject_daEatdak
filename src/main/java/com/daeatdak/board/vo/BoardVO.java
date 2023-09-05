package com.daeatdak.board.vo;

public class BoardVO {
	
	 
	private int boardNum;
	private String boardName;
	private String userName;
	private String boardDate;
	private int boardCount;
	private String boardContent;
	private int boardLock;
	private String boardPassword;
	
	private int userNum;
	

	public int getUserNum() {
		return userNum;
	}

	public void setUserNum(int userNum) {
		this.userNum = userNum;
	}



	public BoardVO() {
		
	}

	public int getBoardLock() {
		return boardLock;
	}


	public void setBoardLock(int boardLock) {
		this.boardLock = boardLock;
	}


	public String getBoardPassword() {
		return boardPassword;
	}


	public void setBoardPassword(String boardPassword) {
		this.boardPassword = boardPassword;
	}

	
	public int getBoardNum() {
		return boardNum;
	}


	public void setBoardNum(int boardNum) {
		this.boardNum = boardNum;
	}


	public String getBoardName() {
		return boardName;
	}


	public void setBoardName(String boardName) {
		this.boardName = boardName;
	}


	public String getUserName() {
		return userName;
	}


	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getBoardDate() {
		return boardDate;
	}


	public void setBoardDate(String boardDate) {
		this.boardDate = boardDate;
	}


	public int getBoardCount() {
		return boardCount;
	}


	public void setBoardCount(int boardCount) {
		this.boardCount = boardCount;
	}


	public String getBoardContent() {
		return boardContent;
	}


	public void setBoardContent(String boardContent) {
		this.boardContent = boardContent;
	}

	@Override
	public String toString() {
		return "BoardVO [boardNum=" + boardNum + ", boardName=" + boardName + ", userName=" + userName + ", boardDate="
				+ boardDate + ", boardCount=" + boardCount + ", boardContent=" + boardContent + ", boardLock="
				+ boardLock + ", boardPassword=" + boardPassword +  ", userNum=" + userNum
				+ "]";
	}





//	public int getBoardLock() {
//		return boardLock;
//	}
//
//
//	public void setBoardLock(int boardLock) {
//		this.boardLock = boardLock;
//	}



	
	
	
	
	
}
