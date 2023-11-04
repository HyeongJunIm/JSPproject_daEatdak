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
import com.daeatdak.goods.vo.GoodsDetailInfoVO;
import com.daeatdak.goods.vo.GoodsDetailVO;

public class GoodsBuyController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServerException, ServletException {
		
		
		GoodsDAO goodsDAO = new GoodsDAO();
		int goodsNum = Integer.parseInt(request.getParameter("goodsNum"));
		
//		request.setAttribute("goodsList", goodsDAO.selectGoodsNum(goodsNum));
//		request.setAttribute("goodsImages", goodsDAO.selectImageByGoodsNum(goodsNum));
		
		
		GoodsDetailInfoVO goodsDetailInfo = goodsDAO.GoodsDetailInfo(goodsNum);
		List<GoodsDetailVO> goodsDetail = goodsDAO.goodsDetailImage(goodsNum);
		
		request.setAttribute("goodsDetailInfo", goodsDetailInfo);
		request.setAttribute("goodsDetail", goodsDetail);
		
		
		System.out.println("상품 상세정보 : " + goodsDetailInfo.toString());
		System.out.println("상품 상세정보 설명 : " + goodsDetail.toString());
		
		
			request.getRequestDispatcher("/goods/GoodsBuyPage.jsp").forward(request, response);
		
		return null;
	}

}
