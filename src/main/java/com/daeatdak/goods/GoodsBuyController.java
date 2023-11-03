package com.daeatdak.goods;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.daeatdak.Execute;
import com.daeatdak.Result;
import com.daeatdak.goods.dao.GoodsDAO;

public class GoodsBuyController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServerException {
		GoodsDAO goodsDAO = new GoodsDAO();
		int goodsNum = Integer.parseInt(request.getParameter("goodsNum"));
		
//		request.setAttribute("goodsList", goodsDAO.selectGoodsNum(goodsNum));
//		request.setAttribute("goodsImages", goodsDAO.selectImageByGoodsNum(goodsNum));
		try {
			request.getRequestDispatcher("/goods/GoodsBuyPage.jsp").forward(request, response);
		} catch (ServletException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return null;
	}

}
