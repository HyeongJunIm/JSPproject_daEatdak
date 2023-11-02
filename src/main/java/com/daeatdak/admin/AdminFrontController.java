package com.daeatdak.admin;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.daeatdak.Result;

/**
 * Servlet implementation class AdminFrontController
 */
//@WebServlet("/AdminFrontController")
public class AdminFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AdminFrontController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);

		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);

		// TODO Auto-generated method stub
	}

	protected void doProcess(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String target = request.getRequestURI().substring(request.getContextPath().length());
		System.out.println(target);
		Result result = null;

		switch (target) {

		case "/admin/userInfoList.ad":
			new UserInfoListOkController().execute(request, response);
			System.out.println("회원리스트");
			request.getRequestDispatcher("/admin/adminMemberInfo.jsp").forward(request, response);

			break;

		case "/admin/goodsRegist.ad":
			request.getRequestDispatcher("/admin/adminProductRegist.jsp").forward(request, response);
			break;

		case "/admin/goodsRegistOk.ad":
			new GoodsRegistOkController().execute(request, response);
			System.out.println("등록완료");
			request.getRequestDispatcher("/admin/goodsInfoListOk.ad").forward(request, response);
			break;

		case "/admin/goodsInfoListOk.ad":
			new GoodsInfoListOkController().execute(request, response);
			System.out.println("상품 리스트 페이지 이동");
			request.getRequestDispatcher("/admin/adminProductInfo.jsp").forward(request, response);
			break;

		case "/admin/goodsListDelete.ad":
			new GoodsListDeleteOkController().execute(request, response);

			System.out.println("삭제성공!");
			break;
		case "/admin/goodsListDeleteOk.ad":
			request.getRequestDispatcher("/admin/goodsInfoListOk.ad").forward(request, response);

			break;
		case "/admin/goodsModify.ad":
			response.setContentType("text/html; charset=utf-8");
			new GoodsInfoRegistController().execute(request, response);
			request.getRequestDispatcher("/admin/adminProductModify.jsp").forward(request, response);

			break;

		case "/admin/goodsModifyOk.ad":
			response.setContentType("text/html; charset=utf-8");
			new GoodsUpdateOkController().execute(request, response);
			System.out.println("수정완료");
			request.getRequestDispatcher("/admin/goodsInfoListOk.ad").forward(request, response);

			break;
		}

		if (result != null) {
			if (result.isRedirect()) {
				response.sendRedirect(result.getPath());
			} else {
				request.getRequestDispatcher(result.getPath()).forward(request, response);
			}
		}
	}

}
