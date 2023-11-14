<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html>
<html lang="ko">
<head>
<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/common/css/slideBanner.css" rel="stylesheet" type="text/css"  />
<script type="text/javascript" src="${pageContext.request.contextPath}/resources/common/js/slideBanner.js" defer></script>
<script type="text/javascript" src="http://code.jquery.com/jquery-latest.min.js"></script>
<title> side-banner </title>
</head>
<body>

    <div id="floatMenu-container">
        <div class="float-menu">
            <div class="banner-change-section">
                <div class="banner-move">
                     <img  src="${pageContext.request.contextPath}/resources/common/img/sideBanner1.jpg" alt="사이드배너1" class="banner1"/>
                     <img  src="${pageContext.request.contextPath}/resources/common/img/sidebanner2.png" alt="사이드배너2" class="banner2"/>
                </div>
            </div>
            <div class="float-user-menu">
            	<c:choose>
				<c:when test = "${empty sessionScope.userRoll}">
                <ul>
                 
                    <li>
                        <a href="${pageContext.request.contextPath}/board/boardListOk.bo">
                            <span class="material-symbols-outlined">
                                support_agent
                            </span>
                        </a>
                    </li>
                    <li class="empty-banner-session">
                        <a href="${pageContext.request.contextPath}/user/login.me">
                            <span class="material-symbols-outlined">
                                shopping_cart
                            </span>
                        </a>
                    </li>
                </ul>
                </c:when>
                <c:when test="${sessionScope.userRoll == 0}">
                  <ul>
                 
                    <li>
                        <a href="${pageContext.request.contextPath}/board/boardListOk.bo">
                            <span class="material-symbols-outlined">
                                support_agent
                            </span>
                        </a>
                    </li>
                    <li>
                        <a href="${pageContext.request.contextPath}/goods/CartList.go?userNum=${sessionScope.userNum}">
                            <span class="material-symbols-outlined">
                                shopping_cart
                            </span>
                        </a>
                    </li>
                </ul>
                </c:when>
                </c:choose>
        	</div>
        <div class="float-button">
            <button class="top-button" >TOP</button>
        </div>
        </div>
    </div>
</body>
</html>