package com.daeatdak.common;

import java.io.IOException;
import java.rmi.ServerException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.daeatdak.Execute;
import com.daeatdak.Result;
import com.daeatdak.admin.dto.FileDTO;
import com.daeatdak.admin.vo.GoodsListVO;
import com.daeatdak.common.dao.CommonDAO;

public class MainFullMenuController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException, ServerException {
	     CommonDAO commonDAO = new CommonDAO();

	        List<GoodsListVO> goodsChickenVo = commonDAO.selectMainGoods(1);       
	        List<GoodsListVO> goodsPorkVo = commonDAO.selectMainGoods(2);
	        List<GoodsListVO> goodsMeatVo = commonDAO.selectMainGoods(3);      
	        List<GoodsListVO> goodsConVo = commonDAO.selectMainGoods(4);
	        
	        
	        
	        List<GoodsListVO> recentlyGoods = commonDAO.selectAll();
	        
	        
	        //다잇닭
	        request.setAttribute("goodsChickenVo", goodsChickenVo);
	        //다잇돈
	        request.setAttribute("goodsPorkVo", goodsPorkVo);
	        //다잇소
	        request.setAttribute("goodsMeatVo", goodsMeatVo);
	        //다잇다
	        request.setAttribute("goodsConVo", goodsConVo);

	        
	        
	        
	        request.setAttribute("recentlyGoods", recentlyGoods);
	        
	       
		return null;
	}

   
}
