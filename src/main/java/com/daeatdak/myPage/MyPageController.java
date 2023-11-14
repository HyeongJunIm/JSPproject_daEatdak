package com.daeatdak.myPage;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.daeatdak.Execute;
import com.daeatdak.Result;
import com.daeatdak.myPage.dao.MyPageDAO;
import com.daeatdak.user.dao.UserDAO;
import com.daeatdak.user.dto.UserDTO;
import com.daeatdak.user.vo.UserVO;

public class MyPageController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException, ServerException {
		// TODO Auto-generated method stub
		HttpSession session = request.getSession();
		
		UserDTO userDTO = new UserDTO();
		UserVO userVO = new UserVO();
		UserDAO userDAO = new UserDAO();
		MyPageDAO myPageDAO = new MyPageDAO();
		
		
		String passwordCheck = request.getParameter("inputPassword");
		int userNum = (int)(session.getAttribute("userNum"));
		String userEmail = ((String)session.getAttribute("userEmail"));		
		
		System.out.println("마이페이지 비밀번호 : " + passwordCheck);
		System.out.println(userEmail);

		String result = myPageDAO.selectUserPassword(userEmail);
		
		
		//비밀번호 일치 시
		if(passwordCheck.equals(result)) {
			System.out.println("비밀번호 일치");
			userVO = myPageDAO.selectUserInfo(userNum);
			request.setAttribute("userInfo", userVO);
			System.out.println("회원 정보 : "+userVO.toString());
			request.getRequestDispatcher("/myPage/myPageUserConfig.jsp").forward(request, response);
			
		//비밀번호 불일치 시 
		}else {
			System.out.println("비일번호 불일치");
			
			request.setAttribute("Fail", true);
			request.getRequestDispatcher("/myPage/myPageMain.jsp").forward(request, response);
			

		}
		
		

		return null;

	}

}
