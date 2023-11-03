package com.daeatdak.admin;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.daeatdak.Execute;
import com.daeatdak.Result;
import com.daeatdak.admin.dao.AdminDAO;
import com.daeatdak.admin.dao.FileDAO;
import com.daeatdak.admin.dto.AdminDTO;

public class GoodsListDeleteOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServerException {

		AdminDTO adminDTO = new AdminDTO();
		AdminDAO adminDAO = new AdminDAO();
		FileDAO fileDAO = new FileDAO();
		Result result = new Result();
		
		
		
		
		 int goodsNumber = Integer.valueOf( request.getParameter("goodsNum"));
		  
		  System.out.println(goodsNumber + "번 상품 삭제!");
		 
		  fileDAO.goodsDetailFileDelete(goodsNumber);
		  fileDAO.delete(goodsNumber);
		  adminDAO.goodsDelete(goodsNumber);
		 
		
		
		response.sendRedirect("/admin/goodsListDeleteOk.ad");
		
		
		return null;
	}
	
}
