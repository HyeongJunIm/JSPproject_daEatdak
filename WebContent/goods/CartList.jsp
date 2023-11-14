<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/common/css/common.css" rel="stylesheet" type="text/css" />
<link rel="shortcut icon" type="image/x-icon" href="${pageContext.request.contextPath}/resources/common/img/logoPic.png" />
<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/goods/js/GoodsCartPage.js?ver=12" defer></script>


		<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/goods/css/CartList.css" type="text/css"/>
<title>장바구니 페이지</title>
</head>
<body>
<%--주문하기 클릭시 현재 빈장바구니로 이동하는것으로 페이지 이동을 하였음 , 차후 서블릿으로 페이지 이동 구현 필요 --%>
	<div class="side-banner-container">
		<!-- 사이드 배너 영역 -->
		<div class="side-banner">
			<%@ include file="/slideBanner.jsp"%>
		</div>
	</div>
	<div class="header-main-container">
		<div class="header">
			<%@ include file="/header.jsp"%>
		</div>
		 <main class="container">
                <div class="cart_main">
                    <div class="cart_main_top">
                        <div class="cart_name">
                            <h3>장바구니</h3>
                        </div>    
                    </div>
                    <div class="cart_main_bottom">
                    
                    <c:choose>
                    	<c:when test="${empty cartList }">
                    		<div class="cart_mark">
                            	<p class="symbols-outlined" >
                               		 <span class="material-symbols-outlined">
                                 	   error
                                </span>
                            </p>
                        	</div>
                       		<div>
                           		 <p>장바구니에 담긴 상품이 없습니다!</p>
                        	</div>
                    	</c:when>
                    	
                    	<c:otherwise>
                    		<div class="checkbox-area">
                            <div class="checkbox-check">
                                <form>
                                    <input type="checkbox" class="all">
                                    <span>전체선택</span>
                                </form>
                            </div>
                            <!-- <div class="button-click">     -->
                                <button class="button">선택삭제</button>
                            <!-- </div> -->
                        </div>    
                        <div class="cart-input">
                            <form action="/goods/cart.go" method="post">    
                            
                                <ul class="goods">
                                <c:forEach var ="cart" items="${cartList}">
                                    <li class="cart-goods">
                                    
                                  <%--   	<c:set var ="imagePath" value=""/>
                        					<c:forEach var = "image" items ="${goodsImages}">
                        						<c:if test="${image.getGoodsNum()==cart.getGoodsNum()}">
                        							<c:set var ="imagePath" value ="${image.getGoodsImg() }"/>
                        						</c:if>
                        					</c:forEach>
                        				<c:if test ="${empty imagePath}">
                        					<c:set var="imagePath" value="resources/goods/img/Default.png"/>
                        				</c:if>  --%>
                                    
                                        <div class="checkbox-area">
                                                <input type="checkbox" name="selectedItems" class="term" value="${cart.goodsNum }">
                                        </div>
                                        <div class="img-area">
                                                    <img src="${pageContext.request.contextPath}/upload/${cart.fileSystemName}">
                                        </div>
                                        <div class="goods-text-area">
                                                <span>${cart.getGoodsName()}</span>
                                                
                                                <br/>
                                                <span>${cart.getGoodsPrice()}원</span>
                                        </div> 
                                        <div class="order-choice">
                                                <div>
                                                    <button class="increase" type="button">+</button>
                                                    <span class="count">1</span>
                                                    <button class="decrease" type="button">-</button>
                                                    <input class="cartItemPrice" type="hidden" value="${cart.getGoodsPrice()}">
                                                </div>
                                        </div>
										<div class="price">
   											 <span class="total-price">${cart.getGoodsPrice()}원</span>
										</div>
                                    </li>
                                    </c:forEach>
                                </ul> 
                         	<input type ="text" id="totalPriceInput" name ="totalPrice" readonly/>  
                        	<div class="product-order">
                            	<button type="button">주문하기</button>
                        	</div>
                      	</form>
                        </div>

                    	</c:otherwise>
                    </c:choose>
                    </div>    
                </div>
            </main>
		
		
	</div>
	<div class="footer">
		<%@ include file="/footer.jsp"%>
	</div>
</body>
</html>