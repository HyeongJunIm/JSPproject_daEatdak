package com.daeatdak.myPage;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.daeatdak.Result;

//@WebServlet("/MyPage")
public class MyPageFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MyPageFrontController() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doProcess(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
		doProcess(request, response);

	}

	

	
	private void doProcess(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
		String target = request.getRequestURI().substring(request.getContextPath().length());
		Result result = null;		
		

		switch (target) {
		//마이페이지 메인 이동
		case "/myPage/myPageMainOk.mp":
			request.getRequestDispatcher("/myPage/myPageMain.jsp").forward(request, response);
			break;
		
		//회원정보 수정을 위한 비밀번호 확인
		case "/myPage/myPagePasswordOk.mp":
			new MyPageController().execute(request, response);
			break;
		
		case "/myPage/myPageUserConfigOk.mp":
			System.out.println("마이페이지");
			new MyPageController().execute(request, response);			
			break;
			
		//회원정보수정 전송
		case "/myPage/myPageUpdateInfoOk.mp":
			new MyPageUpdateInfoController().execute(request, response);
			break;
		
			
		//구매내역 이동
		case "/myPage/myPagePurchaseListOk.mp":
			request.getRequestDispatcher("/myPage/myPagePurchaseHistory.jsp").forward(request, response);
			break;
			
			
			
			
			
			
			
			
		//찜페이지 이동
		case "/myPage/myPageWishListOk.mp":
			new MyWishListOkController().execute(request, response);
			break;
			
		case "/myPage/myPageWishRestOk.mp":
			new MyPageWishRestController().execute(request, response);
			break;
		
		//찜 목록 삭제
		case "/myPage/wishDelete.mp":
			new MyPageWishDeleteController().execute(request, response);
			break;
			
		//찜 목록 장바구니 추가
		case "/myPage/wishlistToCart.mp":
			System.out.println("장바구니 추가");
			new MyPageWishToCartRestController().execute(request, response);
			break;
			

		
			
		
			
		}
	}

}
