package com.daeatdak.myPage;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.daeatdak.Execute;
import com.daeatdak.Result;
import com.daeatdak.myPage.dao.MyPageDAO;
import com.daeatdak.myPage.vo.MyPageWishListVO;
import com.google.gson.Gson;

public class MyPageWishRestController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException, ServerException {

		
		
		int userNum = Integer.valueOf(request.getParameter("userNum"));
		System.out.println("비동기 유저번호 : "+userNum);
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		MyPageDAO myPageDAO = new MyPageDAO();
		List<MyPageWishListVO> wishlist = myPageDAO.selectWishList(userNum);
		
		
		String json = new Gson().toJson(wishlist);

		
		out.print(json);
		out.close();
		
		return null;
	}

}
