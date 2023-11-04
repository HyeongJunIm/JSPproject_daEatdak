package com.daeatdak.board;

import java.io.IOException;
import java.rmi.ServerException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.daeatdak.Execute;
import com.daeatdak.Result;
import com.daeatdak.board.dao.BoardDAO;
import com.daeatdak.board.dto.BoardReplyDTO;
import com.daeatdak.board.vo.BoardReplyListVO;

public class BoardReplyListController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException, ServerException {

		BoardReplyDTO boardReplyDTO = new BoardReplyDTO();
		BoardDAO boardDAO = new BoardDAO();
		
		
		List<BoardReplyListVO> replyList = boardDAO.selectAllReply(boardReplyDTO.getBoardNum() );
	
		request.setAttribute("replyList", replyList);
		
		System.out.println(replyList.toString());
		
		
		return null;
	}

}
