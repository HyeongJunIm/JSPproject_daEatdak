package com.daeatdak.myPage;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.daeatdak.Execute;
import com.daeatdak.Result;
import com.daeatdak.myPage.dao.MyPageDAO;

public class MyPageWishDeleteController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException, ServerException {

		
		MyPageDAO myPageDAO = new MyPageDAO();
		int wishlistNum = Integer.valueOf(request.getParameter("wishlistNum"));
		
		System.out.println("찜 번호 : " +wishlistNum);
		
		
		myPageDAO.deleteWishList(wishlistNum);
		
		
//		response.sendRedirect("/myPageWishList.jsp");
		request.getRequestDispatcher("/myPage/myPageWishList.jsp").forward(request, response);

		return null;
	}

}
	