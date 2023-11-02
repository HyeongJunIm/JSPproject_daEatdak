package com.daeatdak.admin;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.daeatdak.Execute;
import com.daeatdak.Result;
import com.daeatdak.admin.dao.AdminDAO;
import com.daeatdak.admin.dto.AdminDTO;
import com.oreilly.servlet.MultipartRequest;
import com.oreilly.servlet.multipart.DefaultFileRenamePolicy;

public class GoodsUpdateOkController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException, ServerException {

		
		AdminDTO adminDTO = new AdminDTO();
		AdminDAO adminDAO = new AdminDAO();
		Result result = new Result();
		 
	      String UPLOAD_PATH = request.getSession().getServletContext().getRealPath("/upload");
	      final int FILE_SIZE = 1024 * 1024 * 5; // 5MB

	      MultipartRequest multipartRequest = new MultipartRequest(request, UPLOAD_PATH, FILE_SIZE, "utf-8", new DefaultFileRenamePolicy());
//	      int number = adminDAO.getSequence();
	      
	      
	      adminDTO.setGoodsNum(Integer.valueOf(multipartRequest.getParameter("goodsNum")));
		  adminDTO.setCategoryNum(Integer.valueOf(multipartRequest.getParameter("goodsCategory")) );
		  adminDTO.setGoodsName(multipartRequest.getParameter("goodsName"));
		  adminDTO.setGoodsQuantity(Integer.valueOf(multipartRequest.getParameter("goodsQuantity")));
		  adminDTO.setGoodsDetail(multipartRequest.getParameter("goodsDetail"));
		  adminDTO.setGoodsPrice(Integer.valueOf(multipartRequest.getParameter("goodsPrice")));
		  
		  System.out.println(request.getParameter("goodsNum")+"=================================");
		  adminDAO.goodsInfoUpdate(adminDTO); 
		  System.out.println(adminDTO);
		  return null;
	}

	
	
}
