<%@page import="org.apache.ibatis.reflection.SystemMetaObject"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<link rel="shortcut icon" type="image/x-icon"
	href="${pageContext.request.contextPath}/resources/common/img/logoPic.png" />
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/common/css/common.css"
	rel="stylesheet" type="text/css" />
	<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/user/css/findUserInfo.css"
	rel="stylesheet" type="text/css" />
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />

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

	<div class="header-main-container">

		<!--헤더영역-->
		<div class="header">
			<%@ include file="/header.jsp"%>

		</div>
		
		<div class="main">
        <main>
            <div class="userInfo-container">
                            <div class="userInfo-section">
            
                <h2><span>다잇닭</span> 회원 비밀번호 찾기 </h2>
                <div class="find-user-Info">
                    <dl>

                        <dt><h3><%=request.getAttribute("userName")%>님 환영합니다.</h3></dt>
                        <dd>검색된 정보를 보여드릴게요!</dd>
                        <dd><%=request.getAttribute("userEmail")%>계정 비밀번호 : <span><%=request.getAttribute("userPassword")%></span> </dd>
                    </dl>
                </div>
                <div class="user-info-result-btn">
                    <button type="button" onclick="location.href='/user/login.me'">로그인창으로 이동하기</button>
                </div>
                </div>
            </div>
        </main>
    </div>
	</div>
	<div class="footer">
		<%@ include file="/footer.jsp"%>
		<!--상대경로로 각 페이지마다 맞게 작성-->
	</div>
</body>
</html>