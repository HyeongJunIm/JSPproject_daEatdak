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


<!-- 개인 resource -->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/myPage/css/myPageUserConfig.css"
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
						<a href="${pageContext.request.contextPath}/myPage/myPageMain.jsp">
							<div class="content-text on">회원 정보</div>
						</a>
					</div>
					<div class="side-item">
						<a
							href="${pageContext.request.contextPath}/myPage/myPagePurchaseHistory.jsp">
							<div class="content-text">구매 내역</div>
						</a>
					</div>
					<div class="side-item">
						<a
							href="${pageContext.request.contextPath}/myPage/myPageWishListOk.mp?userNum='1'">
							<div class="content-text">찜 목록</div>
						</a>
					</div>
				</div>
				<div class="myPage-main">
					<!-- 마이 페이지 title -->

					<div class="myPage-title">
						<div class="title-text">회원정보 수정</div>
					</div>


					<form action="/myPage/myPageUpdateInfoOk.mp" method="post"
						id="myPageForm">

						<div class="myPage-main-contents">
							<div class="config-box">
								<input type="hidden" value="${userInfo.userNum}" name="userNum" />
								<div class="box name">
									<p class="input-title">이름</p>
									<input type="text" value="${userInfo.userName}" id="userName"
										name="userName" disabled>
									<%-- 									<input type="text" value="<%=userName%>" id="userName" --%>
									<!-- 										name="<userName" disabled> -->
								</div>

								<div class="box id">
									<p class="input-title">이메일</p>
									<input type="text" value="${userInfo.userEmail }" disabled>
								</div>

								<div class="box password">
									<p class="input-title">비밀번호</p>
									<input type="password" name="configPW" id="configPW"
										oninput="checkPw()" placeholder="비밀번호 입력" maxlength="100">
										<label><span class="labelPwNo">특수문자와 숫자를 포함한 8자 이상을 기입하세요. </span></label>
										<label><span class="PwChOk">사용 가능한 비밀번호입니다. </span></label>
								</div>

								<div class="box password check">
									<p class="input-title">비밀번호 확인</p>
									<input type="password" name="configPW2" id="configPW2"
										 placeholder="비밀번호 확인" maxlength="100"
										style="margin-bottom: -2px;"> 
										<label>
										<span class="labelPwCh" 
										 style="display: none;">비밀번호가 일치하지
										않습니다.!</span>
										</label>
								</div>

								<div class="box phone">
									<p class="input-title">휴대전화</p>
									<input type="tel" value="${userInfo.userPhone}" id="userPhone"
										name="userPhone" disabled>
								</div>
								<div class="box address">
									<div>
										<p class="input-title">주소</p>
										<input type="text" value="${userInfo.address}" id="address"
											name="address">
										<button class="address-btn" id="PostCodeSearch" type="button">주소찾기</button>
										<span id="check" class="adressCheck" style="display: none;">번호를
											입력하세요.</span>
									</div>
									<input class="detail-address" type="text"
										value="${userInfo.detailAddress }" name="detailAddress">
								</div>
							</div>
						</div>
						<div class="update">
							<button class="updateBtn" 
								>수정</button>
						</div>
						<div class="delete">
							<button class="deleteBtn" data-usernum="${userInfo.userNum}" type="button">회원탈퇴</button>
						</div>
					</form>


				</div>
			</div>
		</main>
	</div>
	<div class="footer">
		<%@ include file="/footer.jsp"%>
	</div>
	
	
	
	<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>

	<script
		src="${pageContext.request.contextPath}/resources/myPage/js/myPage_userConfig.js">
		
	</script>
	<script
		src="//t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
</body>
</html>