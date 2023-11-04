package com.daeatdak.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class example
 */
//@WebServlet("/example")
public class BoardFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public BoardFrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		doProcess(request,response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
//		doGet(request, response);
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=UTF-8");
		doProcess(request,response);
	}

	
	public void doProcess(HttpServletRequest request, HttpServletResponse response)  throws ServletException, IOException {
		
		String target=request.getRequestURI().substring(request.getContextPath().length());
//		request.getRequestURI().substring(request.getContextPath().length());
		System.out.println("jsp_daEatdak 컨트롤러 실행!");
		System.out.println(target);
		switch(target) {
		
		case "/board/boardListOk.bo" :
			System.out.println("리스트 성공!");
			new BoardListOkController().execute(request, response);
			break;
		case "/board/boardWrite.bo" :
			System.out.println("글쓰기로 이동");
			request.getRequestDispatcher("/board/boardWrite.jsp").forward(request, response);
			break;
			
		case "/board/boardWriteOk.bo":	
			System.out.println("글쓰기 성공!");
			new BoardWriteOkController().execute(request, response);
			break;
			
		case "/board/boardViewOk.bo" :
			System.out.println("조회수 증가 메소드 실행 완료!");
			System.out.println("게시글 세보정보 페이지로 이동!");
			new BoardViewOkController().execute(request, response);
			break;
			
		case "/board/boardPasswordCheckConfig.bo" :
			System.out.println("비공개글 확인 페이지로 이동완료!");
			new BoardPasswordCheck().execute(request, response);
			break;
		
	
		case "/board/boardPasswordCheckConfigOk.bo" :
			System.out.println("비밀번호 체크 시작");
			new BoardPasswoardOkCheck().execute(request, response);
			break;
		
		// 글수정 버튼클리시 이동하는 곳 => 값을 가져가기위해 설정
		case "/board/boardUpdatePasswordCheck.bo" :
			System.out.println(" 수정페이지 비밀번호 확인으로 이동완료!");
			new BoardUpdatePasswordCheckCotroller().execute(request, response);
			break;
		// 수정페이지 비밀번호 체크후 수정페이지로 이동 
		case "/board/boardUpdatePasswordCheckOk.bo" :
			System.out.println("수정페이지 비밀번호 확인으로 비밀번호 체크 시작");
			new BoardUpdatePasswordCheckOkController().execute(request, response);
			break;
		case "/board/boardUpdate.bo":
			System.out.println("도착했어!");
		
			new BoardUpdateController().execute(request, response);
			break;
			
		case "/board/boardDlePasswordCheck.bo" :
			System.out.println(" 삭제하기 비밀번호 확인으로 이동완료!");
			new BoardDlePasswordCheckCotroller().execute(request, response);
			break;	
		
		case "/board/boardDlePasswordCheckOk.bo" :
			System.out.println(" 삭제하기 비밀번호 완료!");
			new BoardDlePasswordCheckOkCotroller().execute(request, response);
			break;	
			
		case "/board/boardReplyOk.bo":
			System.out.println("댓글 정보 가져오기");

			new BoardReplyOkController().execute(request, response);
			System.out.println("댓글 정보 가져오기 성공");
			break;
		case "/board/getBoardReply.bo":
			new BoardReplyListController().execute(request, response);
			System.out.println("댓글 넘기기 성공");
			break;
			
		}
	}
	
}
