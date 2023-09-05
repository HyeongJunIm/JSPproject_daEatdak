package com.daeatdak.board;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.daeatdak.Execute;
import com.daeatdak.Result;
import com.daeatdak.board.dao.BoardDAO;
import com.daeatdak.board.dto.BoardDTO;

public class BoardWriteOkController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException, ServerException {
		BoardDTO boardDTO=new BoardDTO();
		BoardDAO boardDAO=new BoardDAO();

		
		Integer userNum = (Integer)request.getSession().getAttribute("userNum");
		

		response.setContentType("text/html;charset=UTF-8");
		boardDTO.setBoardName(request.getParameter("boardName"));
		System.out.println("-------------Name확인");
		boardDTO.setBoardPassword(request.getParameter("boardPassword"));
		System.out.println("-------------password확인");
		boardDTO.setBoardContent(request.getParameter("boardContent"));
		System.out.println("-------------content확인");
		String boardLockValue =request.getParameter("boardLock");

		System.out.println(userNum);

		boardDTO.setUserNum(userNum);
		// 체크여부를 받아와서 문자열타입으로 저장한다 
	    if (boardLockValue != null && boardLockValue.equals("on")) {
	        boardDTO.setBoardLock(1); // 체크된 경우 "1" 
	    } else {
	        boardDTO.setBoardLock(0); // 체크되지 않은 경우 "0" 
	    }
	    System.out.println("-------------boardLock확인");
		System.out.println(boardDTO);
		boardDAO.writeInsert(boardDTO);
		System.out.println("컨트롤러 실행!");
//		request.getRequestDispatcher("/board/boardList.jsp").forward(request, response);
		
		response.sendRedirect("/jsp_daEatdak/board/boardListOk.bo");
	
		return null;
	}

}
