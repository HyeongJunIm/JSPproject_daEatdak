package com.daeatdak.user;

import java.io.IOException;
import java.io.PrintWriter;
import java.rmi.ServerException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.daeatdak.Execute;
import com.daeatdak.Result;
import com.daeatdak.user.dao.UserDAO;

public class CheckPhoneOkController implements Execute
{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException, ServerException {

		
		response.setContentType("text/html; charset=utf-8");

		UserDAO userDAO = new UserDAO();
		boolean isTrue = userDAO.checkPhone(request.getParameter("userPhone"));
		int resultPhone = 0;
		
		System.out.println(request.getParameter("userPhone"));
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		if(isTrue) {
			resultPhone=0;
		}else {
			resultPhone = 1;
		}
		
		out.print(resultPhone);
		out.close();
		
		return null;
	}

}
