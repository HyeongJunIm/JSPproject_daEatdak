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
	href="${pageContext.request.contextPath}/resources/user/css/findId.css"
	rel="stylesheet" type="text/css" />
<link rel="shortcut icon" type="image/x-icon"
	href="${pageContext.request.contextPath}/resources/common/img/logoPic.png" />
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />

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
			<!--상대경로로 각 페이지마다 맞게 작성-->
		</div>

		<div class='main'>
			<main>
				<!--개인 페이지 작업영역-->
				<div class="idfind-container">
					<div class="idfind-area">
						<div class="idfind-greeting">
							<strong class="txt">계정 찾기<br></strong>
							<span class="txt2">회원 정보를 입력하시면 이메일을 찾으실 수 있습니다.</span>
						</div>
						<form id="findid_form" name="findid_form"
							action="/user/findUserEmailOk.me" method="post">
							<div class="input-group">
								<div class="input-text">
									<input type="text" placeholder="이름 입력" maxlength="100"
										name="userName" id="userName">
									 <input type="text"
										placeholder="휴대폰 번호 입력" maxlength="100" name="userPhone" id="userPhone">

									<label> <span class="inputName checkInfo">이름을
											입력해주세요.</span>
									</label> <label> <span class="inputPhone checkInfo">전화번호를
											입력해주세요.</span>
									</label>
									<c:choose>
										<c:when test="${findFailed}">
											<label> <span class="checkInfo">
											입력하신 정보를 다시
													확인해주세요. 일치하는 정보가 존재하지 않습니다.</span>
											</label>
										</c:when>
										<c:otherwise>
											<label><span></span></label>
										</c:otherwise>
									</c:choose>
								</div>
							</div>
							<div class="button-submit">
								<button class="submit-btn">확인</button>
							</div>
						</form>

						<div class="login-back">
							<button type="button" onclick="location.href='/user/login.me' ">로그인
								창으로 돌아가기</button>
						</div>


					</div>

				</div>











			</main>
		</div>

	</div>
	<!--header-main-container 닫기-->


	<!--푸터 영역-->
	<div class="footer">
		<%@ include file="/footer.jsp"%>
		<!--상대경로로 각 페이지마다 맞게 작성-->
	</div>


<script src="https://code.jquery.com/jquery-3.6.4.js"></script>
<script src="${pageContext.request.contextPath}/resources/user/js/findId.js" ></script>
</body>
</html>