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
import com.daeatdak.goods.dto.GoodsSearchDTO;
import com.daeatdak.goods.vo.GoodsListBySearchVO;

public class GoodsSearchListController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException, ServerException {

		
	      GoodsDAO goodsDAO = new GoodsDAO();
	      GoodsSearchDTO goodsSearchDTO = new GoodsSearchDTO();
	      
	    String cate = request.getParameter("cate");
		String keyword = request.getParameter("keyword");
		
		goodsSearchDTO.setKeyword(keyword);
		goodsSearchDTO.setCate(cate);
		
		System.out.println(goodsSearchDTO.toString());
		
		
		
			List<GoodsListBySearchVO> searchList = goodsDAO.searchGoodsList(goodsSearchDTO);
			request.setAttribute("searchList", searchList);
			System.out.println(searchList.toString()+"===================");
			
		
		
		
		
	return null;
	}

}
