package com.daeatdak.goods;

import java.io.IOException;
import java.rmi.ServerException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.daeatdak.Execute;
import com.daeatdak.Result;
import com.daeatdak.goods.dao.GoodsDAO;
import com.daeatdak.goods.vo.GoodsListByCategoryVO;

public class GoodsListController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServerException {
	      GoodsDAO goodsDAO = new GoodsDAO();
	      int categoryNum = Integer.valueOf(request.getParameter("categoryNum")) ;
	      
 
	      List<GoodsListByCategoryVO> goodsListByCategory = goodsDAO.goodsListByCategory(categoryNum);
	      
	      request.setAttribute("categoryNum", categoryNum);
	      request.setAttribute("goodsListByCategory", goodsListByCategory);
	      
	      System.out.println("cateNum : " + categoryNum);
	      try {
			request.getRequestDispatcher("/goods/GoodsList.jsp").forward(request, response);
		} catch (ServletException e) {

			e.printStackTrace();
		} catch (IOException e) {

			e.printStackTrace();
		}
		return null;
	}

}
