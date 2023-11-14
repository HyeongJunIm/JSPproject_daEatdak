package com.daeatdak.user;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.daeatdak.Result;

/**
 * Servlet implementation class UserFrontController
 */
//@WebServlet("/UserFrontController")
public class UserFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public UserFrontController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doProcess(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.setCharacterEncoding("UTF-8");
		doProcess(request, response);

	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		System.out.println(request.getContextPath());
		String target = request.getRequestURI().substring(request.getContextPath().length());
		System.out.println(target);
		Result result = null;

		switch (target) {
		
		case "/user/signUpSelect.me":
			request.getRequestDispatcher("/user/signupSelect.jsp").forward(request, response);
			break;
			
		case "/user/join.me":
			System.out.println("join");
			request.getRequestDispatcher("/user/signUp.jsp").forward(request, response);
			break;

		case "/user/joinOk.me":
			System.out.println("joinOk");
			new JoinOkController().execute(request, response);
			request.getRequestDispatcher("/user/login.me").forward(request, response);

			break;

		
			
		case "/user/findUserEmail.me":
				request.getRequestDispatcher("/user/findId.jsp").forward(request, response);
				System.out.println("이메일찾기");
			
			break;
			
		
			
		case "/user/findUserEmailOk.me":
			new FindUserEmailController().execute(request,response); 
			System.out.println("이메일 찾기 성공!");

			break;
			
		case "/user/findUserPassword.me":
			request.getRequestDispatcher("/user/findPw.jsp").forward(request, response);
			System.out.println("비밀번호찾기");
			break;
			
		case "/user/findUserPasswordOk.me":
			new FindUserPasswordController().execute(request,response); 
			System.out.println("비밀번호 찾기 성공!");	
			break;
			
		case "/user/findUserInfoFail.me":
			request.getRequestDispatcher("/user/findId.jsp").forward(request, response);
			System.out.println("회원정보 검색 실패");
			break;
		 
		
		
		case "/user/login.me":
			request.getRequestDispatcher("/user/login.jsp").forward(request, response);
			break;
		
		case "/user/loginOk.me":
			System.out.println("loginOk");
			new LoginController().execute(request,response);
			
			break;
			
		case "/user/logoutOk.me":
			System.out.println("logoutOk");
			new LogoutController().execute(request,response);
			break;

		case "/user/checkIdOk.me":
			System.out.println("checkId");
			new CheckIdOkController().execute(request, response);
			break;
		case "/user/checkPhoneOk.me":
			System.out.println("checkPhone");
			new CheckPhoneOkController().execute(request, response);
			break;
		
		//회원탈퇴
		case "/user/deleteUser.me":
			new UserDeleteController().execute(request, response);
			break;
		}
		
				
		
		
		if (result != null) {
			if (result.isRedirect()) {
				System.out.println(result.getPath());
				response.sendRedirect(result.getPath());
			} else {
				request.getRequestDispatcher(result.getPath()).forward(request, response);
			}
		}

	}

}
