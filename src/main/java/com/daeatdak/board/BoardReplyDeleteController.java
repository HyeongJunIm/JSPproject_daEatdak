package com.daeatdak.board;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.daeatdak.Execute;
import com.daeatdak.Result;
import com.daeatdak.board.dao.BoardDAO;

public class BoardReplyDeleteController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException, ServerException {

		
		BoardDAO boardDAO = new BoardDAO();
		
		String commentNum = request.getParameter("commentNum");

		
		System.out.println(commentNum);
//		System.out.println(boardNum);
		
		boardDAO.deleteReply(Integer.valueOf(commentNum));;
		
		return null;
	}

}
