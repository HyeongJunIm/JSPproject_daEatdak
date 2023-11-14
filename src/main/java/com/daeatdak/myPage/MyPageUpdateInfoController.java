package com.daeatdak.myPage;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.daeatdak.Execute;
import com.daeatdak.Result;
import com.daeatdak.myPage.dao.MyPageDAO;
import com.daeatdak.user.vo.UserUpdateVO;

public class MyPageUpdateInfoController implements Execute {

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException, ServerException {

		
		MyPageDAO myPageDAO = new MyPageDAO();
		UserUpdateVO userUpdateVO = new UserUpdateVO();
		
		
		
		String changePw = request.getParameter("configPW2");
		int userNum = Integer.valueOf(request.getParameter("userNum"));
		String address = request.getParameter("address");
		String detailAddress = request.getParameter("detailAddress");

		
		
		userUpdateVO.setUserNum(userNum);
		userUpdateVO.setAddress(address);
		userUpdateVO.setDetailAddress(detailAddress);
		userUpdateVO.setUserPassword(changePw);
		
		
		
		System.out.println("회원 정보 수정 사항 : " + userUpdateVO.toString());
		myPageDAO.updateUserInfo(userUpdateVO);
		myPageDAO.updateUserAddress(userUpdateVO);
		
		response.sendRedirect("/myPage/myPageMain.jsp");
		
		return null;
	}

}
