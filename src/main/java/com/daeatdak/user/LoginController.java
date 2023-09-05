package com.daeatdak.user;

import java.io.IOException;
import java.rmi.ServerException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.daeatdak.Execute;
import com.daeatdak.Result;
import com.daeatdak.board.dao.BoardDAO;
import com.daeatdak.board.vo.BoardVO;
import com.daeatdak.goods.dao.GoodsDAO;
import com.daeatdak.goods.dto.CartDTO;
import com.daeatdak.user.dao.UserDAO;
import com.daeatdak.user.dto.UserDTO;

public class LoginController implements Execute{

	@Override
	public Result execute(HttpServletRequest request, HttpServletResponse response)
			throws IOException, ServletException, ServerException {
		System.out.println("컨트롤러 진입");
		GoodsDAO goodsDAO = new GoodsDAO();
		UserDAO userDAO = new UserDAO();
		UserDTO userDTO = new UserDTO();
		CartDTO cartDTO = new CartDTO();
		BoardVO boardVO =new BoardVO();
		UserDTO result = null;
		CartDTO myCart = null;
		BoardVO myboard=null;
		BoardDAO boardDAO= new BoardDAO();
		userDTO.setUserEmail(request.getParameter("userEmail"));
		userDTO.setUserPassword(request.getParameter("userPassword"));
		
		result = userDAO.login(userDTO);
		
			
		if(result != null) {
			myCart = goodsDAO.selectCart(result.getUserNum());
			myboard = boardDAO.selectMyInfo(result.getUserNum());
			if(myCart == null) {
				goodsDAO.createCart(result.getUserNum());
			}
			HttpSession session = request.getSession();
			session.setAttribute("userEmail",result.getUserEmail());
			session.setAttribute("userNum",result.getUserNum());
			session.setAttribute("userRoll",result.getUserRoll());
			System.out.println("session 등록 완료");
			response.sendRedirect(request.getContextPath() + "/common/MainFullMenu.co");
		}else {
            request.setAttribute("loginFailed", true);
            request.getRequestDispatcher("/user/login.jsp").forward(request, response);
		}
		
		return null;
	}

}
