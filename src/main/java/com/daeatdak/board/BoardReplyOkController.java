package com.daeatdak.board;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.daeatdak.Execute;
import com.daeatdak.Result;
import com.daeatdak.board.dao.BoardDAO;
import com.daeatdak.board.dto.BoardReplyDTO;

public class BoardReplyOkController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException, ServerException {


		
		BoardReplyDTO boardReplyDTO = new BoardReplyDTO();
		BoardDAO boardDAO = new BoardDAO();
		
		
		String commentContent = request.getParameter("commentContent");
		String userNum = request.getParameter("userNum");
		String boardNum = request.getParameter("boardNum");
		
		System.out.println(commentContent);
		System.out.println(userNum);
		System.out.println(boardNum);
		
		 boardReplyDTO.setCommentContent(commentContent);

		boardReplyDTO.setUserNum(userNum);
		boardReplyDTO.setBoardNum(boardNum);
		
		 boardDAO.insertReply(boardReplyDTO);
		
		System.out.println("댓글정보: "+boardReplyDTO.toString());
		
		request.getRequestDispatcher("/board/getBoardReply.bo").forward(request, response);
		return null;
	}

}
