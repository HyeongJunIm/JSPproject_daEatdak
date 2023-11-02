package com.daeatdak.admin;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.daeatdak.Execute;
import com.daeatdak.Result;
import com.daeatdak.admin.dao.AdminDAO;
import com.daeatdak.admin.vo.GoodsInfoListVO;

public class GoodsInfoListOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServerException {
		
		AdminDAO adminDAO = new AdminDAO();

		Result result = new Result();
		
		
		adminDAO.goodsInfoList();
		
		request.setAttribute("GoodsInfoList", adminDAO.goodsInfoList());

		
	
		return null;
		
		
	}
	
	
	
}
