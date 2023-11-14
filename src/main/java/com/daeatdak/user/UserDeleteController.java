package com.daeatdak.user;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.daeatdak.Execute;
import com.daeatdak.Result;
import com.daeatdak.user.dao.UserDAO;

public class UserDeleteController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException, ServerException {

		HttpSession session = request.getSession();
		UserDAO userDAO = new UserDAO();
		
		int userNum = Integer.valueOf(request.getParameter("userNum"));
		System.out.println(userNum);
		
		userDAO.deleteUser(userNum);
		session.invalidate();
		
		
		response.sendRedirect("/index.jsp");
		
		
		return null;
	}

}
