package com.daeatdak.board;

import java.io.IOException;
import java.io.PrintWriter;
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
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonParser;

public class BoardReplyListController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException, ServerException {

		BoardReplyDTO boardReplyDTO = new BoardReplyDTO();
		BoardDAO boardDAO = new BoardDAO();
		String boardNum = request.getParameter("boardNum");
		System.out.println("게시 번호" + boardNum);

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();

		List<BoardReplyListVO> replyList = boardDAO.selectAllReply(boardNum);

		
		String json = new Gson().toJson(replyList);
		System.out.println(json);

		System.out.println("댓글 가져오기" + json);
		out.print(json);
		out.close();

		return null;
	}

}
