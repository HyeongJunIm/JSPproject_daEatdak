package com.daeatdak.board;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.daeatdak.Execute;
import com.daeatdak.Result;
import com.daeatdak.board.dao.BoardDAO;
import com.daeatdak.board.vo.BoardVO;

public class BoardDlePasswordCheckOkCotroller implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException, ServerException {
		System.out.println("삭제확인 메소드 실행!");
	
		BoardDAO boardDAO=new BoardDAO();
		int boardNum=Integer.valueOf(request.getParameter("boardNum"));
		System.out.println(boardNum);
		BoardVO boardVO=boardDAO.select(boardNum);
//		BoardDAO boardDAO=new BoardDAO();
//		BoardVO boardVO=new BoardVO();
		System.out.println(boardVO);
		System.out.println(boardVO.getBoardPassword());
		String boardPassword=request.getParameter("boardPassword");
		System.out.println(boardPassword);
		
		
		if(boardVO.getBoardPassword().equals(boardPassword)) {
			
			
			boardDAO.delate(boardNum);
			System.out.println("삭제완료!");
			request.getRequestDispatcher("/board/boardListOk.bo").forward(request, response);
		}else if(!boardVO.getBoardPassword().equals(boardPassword)){
			request.setAttribute("board", boardVO);
			String warningMessage = "비밀번호가 일치하지 않습니다.";
			request.setAttribute("warningMessage", warningMessage);
			request.getRequestDispatcher("/board/boardPasswordCheckDel.jsp").forward(request, response);
		}


		
		return null;
	}

}
