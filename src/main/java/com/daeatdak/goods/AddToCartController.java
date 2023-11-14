package com.daeatdak.goods;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.daeatdak.Execute;
import com.daeatdak.Result;
import com.daeatdak.goods.dao.GoodsDAO;
import com.daeatdak.goods.dto.CartDTO;
import com.daeatdak.goods.dto.CartItemDTO;
import com.daeatdak.goods.dto.GoodsDTO;

public class AddToCartController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException, ServerException {

		GoodsDAO goodsDAO = new GoodsDAO();
		HttpSession session = request.getSession();	
		
		int goodsNum = Integer.parseInt(request.getParameter("goodsNum"));
		Integer userNum = (Integer) session.getAttribute("userNum");
		
		
	
		
		goodsDAO.insertCartItem(userNum,goodsNum);
		
		return null;
	}

}
