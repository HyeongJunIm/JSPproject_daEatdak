package com.daeatdak.goods;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.daeatdak.Execute;
import com.daeatdak.Result;
import com.daeatdak.myPage.dao.MyPageDAO;
import com.daeatdak.myPage.dto.WishlistDTO;

public class AddToWishlistController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException, ServerException {

		
		MyPageDAO myPageDAO = new MyPageDAO();
		HttpSession session = request.getSession();
		WishlistDTO wishlistDTO = new WishlistDTO();
		
		int goodsNum = Integer.valueOf(request.getParameter("goodsNum"));
		Integer userNum = (Integer)session.getAttribute("userNum");
		
		
		System.out.println("찜하기 상품번호 : "+goodsNum);
		System.out.println("찜하기 유저번호 : "+userNum);
		
		
		if(wishlistDTO.getWishlistPick()==1) {
			
		}else {
			myPageDAO.insertWishList(goodsNum, userNum);

		}
		
		

		return null;
	}

}
