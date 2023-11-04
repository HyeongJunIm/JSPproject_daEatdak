package com.daeatdak.user;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.daeatdak.Execute;
import com.daeatdak.Result;
import com.daeatdak.user.dao.UserDAO;
import com.daeatdak.user.dto.UserDTO;

public class FindUserPasswordController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServerException, ServletException {
		UserDTO userDTO = new UserDTO();
		UserDAO userDAO = new UserDAO();

//		request.setAttribute("findUserEmail", userDAO.findUserEmailByName(userDTO));
		String userEmail = request.getParameter("userEmail");
		String userName = request.getParameter("userName");
		String userPhone = request.getParameter("userPhone");

		System.out.println(userEmail);
		System.out.println(userName);
		System.out.println(userPhone);
		userDTO.setUserEmail(userEmail);
		userDTO.setUserName(userName);
		userDTO.setUserPhone(userPhone);
		
		userDTO=userDAO.findUserPasswordByEmail(userDTO);


		
		if(userDTO == null) {
			request.setAttribute("findFailed", true);
            request.getRequestDispatcher("/user/findPw.jsp").forward(request, response);
		}else {
			request.setAttribute("userName", userName);
			request.setAttribute("userPassword", userDTO.getUserPassword());
			request.setAttribute("userEmail",userEmail);
			
	

			request.getRequestDispatcher("/user/password.jsp").forward(request, response);
		}
		
		return null;

	}

}
