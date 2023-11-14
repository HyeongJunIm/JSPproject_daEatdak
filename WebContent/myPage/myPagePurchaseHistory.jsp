<%@ page import="com.daeatdak.goods.dto.GoodsDTO"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

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
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<!-- 개인 resource -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/myPage/css/myPagePurchaseHistory.css"
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
							<div class="content-text on">구매 내역</div>
						</a>
					</div>
					<div class="side-item">
						<a
							href="${pageContext.request.contextPath}/myPage/myPageWishListOk.mp?userNum=${userNum}">
							<div class="content-text">찜 목록</div>
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
						<div class="title-text">구매 내역</div>
					</div>


					<div class="myPage-main-contents">
						<%-- 						<c:forEach items="${gDTO }" var="gDTO"> --%>
						<%-- 												</c:forEach> --%>

						<div class="product">
							<div class="product-img-box">
								<img class="product-img"
									src="${pageContext.request.contextPath}/resources/myPage/img/product1.jpg">
							</div>
							<div class="product-info">
								<h4>맛있닭 엄청맛있는 닭가슴살 소시지 100kg</h4>
								<p>5000원</p>
								<p>수량 : 100</p>
								<p>합계 : 500,000원</p>
								<div class="cancle-btn-box">
									<button class="cancle-btn">구매 취소</button>
								</div>
							</div>
						</div>

						<div class="product">
							<div class="product-img-box">
								<img class="product-img"
									src="${pageContext.request.contextPath}/resources/myPage/img/product2.jpg">
							</div>
							<div class="product-info">
								<h4>맛있닭 엄청맛있는 닭가슴살 소시지 100kg</h4>
								<p>5000원</p>
								<p>수량 : 100</p>
								<p>합계 : 500,000원</p>
								<div class="cancle-btn-box">
									<button class="cancle-btn">구매 취소</button>
								</div>
							</div>
						</div>
						<div class="product">
							<div class="product-img-box">
								<img class="product-img"
									src="${pageContext.request.contextPath}/resources/myPage/img/product1.jpg">
							</div>
							<div class="product-info">
								<h4>맛있닭 엄청맛있는 닭가슴살 소시지 100kg</h4>
								<p>5000원</p>
								<p>수량 : 100</p>
								<p>합계 : 500,000원</p>
								<div class="cancle-btn-box">
									<button class="cancle-btn">구매 취소</button>
								</div>
							</div>
						</div>

					</div>


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