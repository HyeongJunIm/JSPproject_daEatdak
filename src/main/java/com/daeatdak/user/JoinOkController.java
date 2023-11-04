package com.daeatdak.user;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.daeatdak.Execute;
import com.daeatdak.Result;
import com.daeatdak.user.dao.AddressDAO;
import com.daeatdak.user.dao.UserDAO;
import com.daeatdak.user.dto.AddressDTO;
import com.daeatdak.user.dto.UserDTO;

public class JoinOkController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServerException {

		UserDTO userDTO = new UserDTO();
		UserDAO userDAO = new UserDAO();
		AddressDTO addressDTO = new AddressDTO();
		AddressDAO addressDAO = new AddressDAO();
		Result result =new Result();
		int userAddress = 0;
		int users=0;
		
		userDTO.setUserEmail(request.getParameter("userEmail"));
		userDTO.setUserName(request.getParameter("userName"));
		userDTO.setUserPassword(request.getParameter("userPassword"));
		userDTO.setUserPhone(request.getParameter("userPhone"));

		
		
		userDAO.join(userDTO);
		users = userDAO.getSequence();
		System.out.println(userDTO);

		
		addressDTO.setAddress(request.getParameter("userAddress") + request.getParameter("userDetailAddress"));
		addressDTO.setRoadAddress(request.getParameter("userAddress"));
		addressDTO.setDetailAddress(request.getParameter("userDetailAddress"));
		addressDTO.setUserNum(users);
		addressDAO.insert(addressDTO);
		System.out.println("주소값 입력" + addressDTO);
		
		
		

		
		
	return null;
	}
	
}
