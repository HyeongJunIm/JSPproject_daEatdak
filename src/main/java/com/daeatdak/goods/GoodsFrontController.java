package com.daeatdak.goods;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.daeatdak.Result;



public class GoodsFrontController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

    public GoodsFrontController() {
        super();
        // TODO Auto-generated constructor stub
    }


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	    doProcess(request, response);
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	    doProcess(request, response);
	}

	   protected void doProcess(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		      String target = request.getRequestURI().substring(request.getContextPath().length());
		      Result result = null;
		     
		      switch(target) {
		      case "/goods/goodsList.go":
		    	  new GoodsListController().execute(request, response);
		         break;
		         
		      case "/goods/goodsBuy.go":
		    	  new GoodsBuyController().execute(request, response);
		         break;
		     
		      case "/goods/toCart.go":
		    	  System.out.println("장바구니로 물품추가");
		    	  new AddToCartController().execute(request,response);
		    	  break;
		      
		      case "/goods/CartList.go":
		    	  System.out.println("장바구니로 이동");
		    	  new CartListController().execute(request, response);
		    	  break;
		    	  
		      case "/goods/searchList.go":
		    	  new GoodsSearchListController().execute(request, response);
		      	break;

		      }
		      		
		      
		      
		      if(result != null) {
		    	  if(result.isRedirect()) {
		    		  response.sendRedirect(result.getPath());
		    		  //리다이렉션을 필요로 한다면 리다이렉션을 수행한다.
		    		  //
		    	  }else {
		    		  request.getRequestDispatcher(result.getPath()).forward(request,response);
		    		  //포워딩을 필요로 하면 result 객체의 경로로 포워딩 한다.
		    	  }
		      }
		      
		   }
	
}
