
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8" />
<meta name="viewport" content="width=device-width, initial-scale=1.0" />
<title>다잇닭</title>
<!-- 폰트 -->
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
<link
	href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&display=swap"
	rel="stylesheet" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/common/css/common.css"
	rel="stylesheet" type="text/css" />
<link rel="shortcut icon" type="image/x-icon"
	href="${pageContext.request.contextPath}/resources/common/img/logoPic.png" />
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
<!-- 개인 resource -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/myPage/css/myPageWishList.css"
	rel="stylesheet" type="text/css" />
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
		<main>
			<div class="myPage-container">
				<!-- 마이 페이지 사이드 메뉴바 -->
					<div class="sidemenu">
					<!-- 사이드 메뉴바 아이템 -->
					<div class="side-item">
						<a href="${pageContext.request.contextPath}/myPage/myPageMainOk.mp">
							<div class="content-text ">회원 정보 </div>
						</a>
					</div>
					<div class="side-item">
						<a
							href="${pageContext.request.contextPath}/myPage/myPagePurchaseListOk.mp?userNum=${userNum}">
							<div class="content-text">구매 내역</div>
						</a>
					</div>
					<div class="side-item">
						<a
							href="${pageContext.request.contextPath}/myPage/myPageWishListOk.mp?userNum=${userNum}">
							<div class="content-text on">찜 목록</div>
						</a>
<!-- 						<a onclick="location.href='/myPage/myPageMainOk.mp';" -->
<%-- 							href="${pageContext.request.contextPath}/myPage/myPageWishList.jsp"> --%>
<!-- 							<div class="content-text">찜 목록</div> -->
<!-- 						</a> -->
					</div>
				</div>
				<div class="myPage-main">
					<!-- 마이 페이지 title -->
					<div class="myPage-title">
						<div class="title-text">찜 목록</div>
					</div>
					
					
					<!-- 찜목록  -->
					<div class="myPage-main-contents">
					

				

					</div>
				</div>
			</div>
			<c:forEach items="${wishList }" var="list">
						<input type="hidden" value="${list.userNum}" class="userNum"/>
			</c:forEach>
		</main>
	</div>
	<div class="footer">
		<%@ include file="/footer.jsp"%>
	</div>
	
	
	
	<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/myPage/js/myPageWishList.js"></script>
</body>
</html>