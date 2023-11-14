package com.daeatdak.myPage;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.daeatdak.Execute;
import com.daeatdak.Result;
import com.daeatdak.myPage.dao.MyPageDAO;
import com.daeatdak.myPage.vo.MyPageWishListVO;
import com.google.gson.Gson;

public class MyWishListOkController implements Execute {
	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException {
		
		
		
		
		
		
		MyPageDAO myPageDAO = new MyPageDAO();
		MyPageWishListVO myPageWishListVO = new MyPageWishListVO();
		
		int userNum = Integer.valueOf(request.getParameter("userNum"));
		
		System.out.println(userNum);
		List<MyPageWishListVO> wishList = myPageDAO.selectWishList(userNum);
		
		System.out.println("찜하기 목록 : " + wishList);
		request.setAttribute("wishList", wishList);

	
		
		request.getRequestDispatcher("/myPage/myPageWishList.jsp").forward(request, response);

		
		
		return null;
	}

}
