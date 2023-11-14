package com.daeatdak.goods;

import java.io.IOException;
import java.rmi.ServerException;
import java.util.List;

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
import com.daeatdak.goods.dto.GoodsImageDTO;
import com.daeatdak.goods.vo.CartItemVO;

public class CartListController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException, ServerException {
		HttpSession session = request.getSession();
		GoodsDAO goodsDAO = new GoodsDAO();
		CartDTO cartDTO = new CartDTO();
		GoodsDTO goodsDTO = new GoodsDTO();
//		GoodsImageDTO goodsImageDTO = new GoodsImageDTO();
		CartItemDTO cartItemDTO = new CartItemDTO();
		
		CartItemVO cartItemVO = new CartItemVO();

		Integer userNum = (Integer) session.getAttribute("userNum");		
		System.out.println(userNum);
		cartDTO = goodsDAO.selectMyCart(userNum);
		
		List<CartItemVO> cartItems = goodsDAO.selectItemByCartNum(cartDTO.getCartNum());
		
		request.setAttribute("cartList",cartItems);
		
		System.out.println("cartList : " + cartItems);
		System.out.println("----");
		
	      
//	    request.setAttribute("cartList", goodsDAO.selectCartItems(cartDTO.getCartNum()));
//	    request.setAttribute("goodsImages", goodsDAO.selectImage());
//	    System.out.println(session.getAttribute("cartList"));
		request.getRequestDispatcher("/goods/CartList.jsp").forward(request, response);
		return null;
	}

}
