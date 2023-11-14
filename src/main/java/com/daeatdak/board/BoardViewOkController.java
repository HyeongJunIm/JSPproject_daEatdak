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
import javax.servlet.http.HttpSession;

import com.daeatdak.Execute;
import com.daeatdak.Result;
import com.daeatdak.board.dao.BoardDAO;
import com.daeatdak.board.dto.BoardReplyDTO;
import com.daeatdak.board.vo.BoardReplyListVO;
import com.daeatdak.board.vo.BoardVO;
import com.google.gson.Gson;

public class BoardViewOkController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)throws IOException, ServletException, ServerException {
		System.out.println("컨트롤러까지는 이동!");
		HttpSession session = request.getSession();
		int boardNum = Integer.valueOf(request.getParameter("boardNum"));
		System.out.println(boardNum);
		BoardDAO boardDAO = new BoardDAO();
		BoardVO boardVO = boardDAO.select(boardNum);
		BoardReplyDTO boardReplyDTO = new BoardReplyDTO();
		System.out.println(boardVO);
		boardDAO.updateViewCount(boardNum); // 조회수 증가
		request.setAttribute("board", boardVO); 
		
		
		
		
	
		
		request.getRequestDispatcher("/board/boardView.jsp").forward(request, response);
		System.out.println("프론트컨트롤로 이동!");
		return null;
	}

}
