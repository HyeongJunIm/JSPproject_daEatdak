package com.daeatdak.myPage;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.daeatdak.Execute;
import com.daeatdak.Result;
import com.daeatdak.goods.dao.GoodsDAO;

public class MyPageWishToCartRestController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException, ServerException {

		
		
		GoodsDAO goodsDAO = new GoodsDAO();
		HttpSession session = request.getSession();	
		PrintWriter out = response.getWriter();
		
		int goodsNum = Integer.parseInt(request.getParameter("goodsNum"));
		Integer userNum = (Integer) session.getAttribute("userNum");
		
		
		
		System.out.println("===========================");
		System.out.println("장바구니에 추가할 상품 번호 : "+goodsNum);
		System.out.println("장바구니 회원 번호 : " + userNum);
		
		int add = goodsDAO.selectWishToCart(goodsNum);
		

		if(add==0) {	
			goodsDAO.insertCartItem(userNum, goodsNum);
			
		}else if (add==1) {
			
			out.print(add);
			out.close();
			
		}
		
		
		return null;
	}

}
