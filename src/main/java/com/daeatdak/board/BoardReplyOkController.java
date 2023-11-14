package com.daeatdak.board;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.daeatdak.Execute;
import com.daeatdak.Result;
import com.daeatdak.board.dao.BoardDAO;
import com.daeatdak.board.dto.BoardReplyDTO;
import com.daeatdak.board.vo.BoardReplyListVO;
import com.google.gson.Gson;

public class BoardReplyOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException, ServerException {

		BoardReplyDTO boardReplyDTO = new BoardReplyDTO();
		BoardDAO boardDAO = new BoardDAO();

		String commentContent = request.getParameter("commentContent");
		String userNum = request.getParameter("userNum");
		String boardNum = request.getParameter("boardNum");

		System.out.println("댓글 내용: "+commentContent);
		System.out.println("회원 번호: "+userNum);
		System.out.println("게시 번호: "+boardNum);

		boardReplyDTO.setCommentContent(commentContent);
		boardReplyDTO.setUserNum(userNum);
		boardReplyDTO.setBoardNum(boardNum);
		
		//ajax로 받아온 댓글 정보를 DB에 저장한다.
		boardDAO.insertReply(boardReplyDTO);
		System.out.println("댓글정보: " + boardReplyDTO.toString());

		
		
		
		//비동기 통신 성공 시 실행될 것들
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		
		//db에 저장된 게시물에 달린 댓글들을 모두 불러온다.
		List<BoardReplyListVO> replyList = boardDAO.selectAllReply(boardReplyDTO.getBoardNum() );
		

		//gson을 사용하여 json으로 변경
		String json = new Gson().toJson(replyList);		
		System.out.println(json);
		//js에서 사용하기위해 내보낸다.
		System.out.println("댓글 가져오기"+ json);
		out.print(json);
		out.close();
		
		
		
		return null;
	}

}
