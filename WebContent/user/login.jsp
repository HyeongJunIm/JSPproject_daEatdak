<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>

<!--기본적인 공통 css-->
<!--이외 각자 페이지 css/js는 각자 추가할 것-->
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/common/css/common.css"
	rel="stylesheet" type="text/css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/user/css/login.css"
	rel="stylesheet" type="text/css" />
<link rel="shortcut icon" type="image/x-icon"
	href="${pageContext.request.contextPath}/resources/common/img/logoPic.png" />
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
<script src="https://code.jquery.com/jquery-3.6.4.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/member/js/loginJS.js"></script>

<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="side-banner-container">
		<!-- 사이드 배너 영역 -->
		<div class="side-banner">
			<%@ include file="/slideBanner.jsp"%>
			<!--상대경로로 각 페이지마다 맞게 작성 ex) ./slideBanner.jsp or ../ ...-->
		</div>
	</div>

	<!--푸터 하단 고정을 위한 Header 영역과 Main영역 컨테이너-->
	<!--이 부분 생략 시 푸터 부분 어색해짐 반드시 넣을 것, 관리자 페이지는 제외-->
	<!--해당 관련 css - min-height값은 추후에 완성본에서 조정할 예정이니 일단 넣을 것 -->
	<div class="header-main-container">

		<!--헤더영역-->
		<div class="header">
			<%@ include file="/header.jsp"%>

		</div>

		<div class='main'>
			<main>
				<!--개인 페이지 작업영역-->
				<div class="login-container">
					<div class="login-area">
						<div class="login-greeting">
							<strong class="txt">안녕하세요 : ) <br> <span class="logoTitle">다잇닭 </span> 입니다
							</strong>
						</div>

						<form id="login_form" name="login_form"
							action="${pageContext.request.contextPath}/user/loginOk.me"
							onsubmit='return aclick();' method="post">

							<div class="input-group">
								<div class="input-text">
									<input type="text" id="userEmail" name="userEmail"
										placeholder="이메일" maxlength="100"> 
									<input
										type="password" id="userPassword" name="userPassword"
										placeholder="비밀번호" maxlength="100"> 
										
										<label
										class="nameNull" style="display: none;">이메일을 입력해주세요.</label> 
										<label
										class="pwNull" style="display: none">비밀번호를 입력해주세요.
										
										</label>
									<c:choose>
										<c:when test="${loginFailed}">
											<label class="loginX" style="color: red;">이메일 혹은
												비밀번호가 틀렸습니다.</label>
										</c:when>
										<c:otherwise>
											<label class="loginX" style="display: none">
											</label>
										</c:otherwise> 
									</c:choose>
								</div>
							</div>
							<div class="button-login">
								<button class="btnLogin">로그인</button>
							</div>
						</form>
						<div class="button-found">
							<button type="button"
								onclick="location.href='/user/findUserPassword.me' ">비밀번호
								찾기</button>
							<button type="button"
								onclick="location.href='/user/findUserEmail.me'  ">아이디
								찾기</button>
											<button type="button"
								onclick="location.href='/user/join.me'">회원가입</button>
						</div>
						
					</div>
				</div>
			</main>
		</div>
	</div>


	<!--푸터 영역-->
	<div class="footer">
		<%@ include file="/footer.jsp"%>
		<!--상대경로로 각 페이지마다 맞게 작성-->
	</div>

</body>
</html>