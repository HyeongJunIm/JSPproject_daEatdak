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
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/goods/css/ChickenAllMain.css?ver=2.1" type="text/css"/>
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<script src="${pageContext.request.contextPath}/resources/goods/js/pageing.js?ver=2" defer></script>
<title>다잇닭</title>
</head>
<body>

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
            <div class="product-chicken-page">
                <div class="page-top">
                <!-- 카테고리별 page-name 출력-->
                	<c:choose>
                		<c:when test="${keyword=='' || keyword==null }">
                		<h2 class="page-name">모든 상품을 불러왔어요!</h2>
                		</c:when>
                		<c:when test="${keyword !=null}">
                		    <h2 class="page-name">${keyword} 검색결과 </h2>
                		</c:when>
                	</c:choose>
                	
                  
                </div>
                <div class="product-inter">
                    <ul class="product-list">
						<c:forEach var ="searchResult" items ="${searchList}"> 
                        <li class="list-info">             

                            <div class="list">
                                <figure class="img">
                                    <a href="${pageContext.request.contextPath}/goods/goodsBuy.go?goodsNum=${searchResult.goodsNum}">
                                        <img class="chicken" src="${pageContext.request.contextPath}/upload/${searchResult.fileSystemName}" alt="상품이미지">
                                    </a>
                                </figure>
                                <div class="list-name-top">
                                	<c:choose >
                						<c:when test="${searchResult.categoryNum == 1 }" >
                   							  <span>다있닭</span> 
                   						</c:when>
										<c:when test="${searchResult.categoryNum == 2 }" >
                   							  <span>다있돈</span> 
                 					  	</c:when>
                  					 	<c:when test="${searchResult.categoryNum == 3 }" >
                   							  <span>다있소</span> 
                  					 	</c:when>
                 					  	<c:when test="${searchResult.categoryNum == 4 }" >
                   							  <span>다있닷</span> 
                  					 	</c:when>
               						 </c:choose>
                                </div>
                                <div class="list-name-bottom">
                                    ${searchResult.goodsName}
                                </div>
                                <span class="list-price">${searchResult.goodsPrice} 원</span>
                            </div>
                        </li>
                        </c:forEach>
                                           <c:choose>
                       
                         <c:when test="${empty searchList }" >
                         <li></li>
                         <li>
                        	<div>
                        		<ul>
                        		<li><img src="" alt="결과없음"/></li>
                        		<li>${keyword}에 관한 검색 결과가 없습니다.<li>
                        		<li><a href="${pageContext.request.contextPath}/goods/goodsList.go?categoryNum=1">상품리스트 페이지로 돌아가기</a></li>
                        		</ul>
                        	</div>
                        </li>
                         <li></li>
                        
                        </c:when>
                        </c:choose>
                        </ul>
             
	                    <div class="pageing">
	                        <div class="arrow prev" onclick="">&lt;</div>
	                        <ul class="page-box">
	                        </ul>
	                        <div class="arrow next">&gt;</div>
	                    </div>
	                  
                </div>
            </div>
        </main>
	</div>
	<div class="footer">
		<%@ include file="/footer.jsp"%>
	</div>
</body>
</html>