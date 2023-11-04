<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
  <head>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <title>다잇닭</title>
    <!-- 폰트 -->
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
    <link href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&display=swap" rel="stylesheet"/>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/common/css/common.css" rel="stylesheet" type="text/css" />
	<link rel="shortcut icon" type="image/x-icon" href="${pageContext.request.contextPath}/resources/common/img/logoPic.png" />
	<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
	<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
	<!-- 개인 resource -->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/myPage/css/myPageMain.css" rel="stylesheet" type="text/css" />
 </head>
  <body>
    <div class="side-banner-container">
      <!-- 사이드 배너 영역 -->
      <div class="side-banner">
      	<%@ include file ="/slideBanner.jsp" %>
      </div>
    </div>
    <div class="header-main-container"> 
    <div class="header">
    	<%@ include file ="/header.jsp" %>
    </div>
    <main>
	      <div class="myPage-container">
        <!-- 마이 페이지 사이드 메뉴바 -->
        <div class="sidemenu">
          <!-- 사이드 메뉴바 아이템 -->
            <div class="side-item">
              <a href="${pageContext.request.contextPath}/myPage/myPageMain.jsp">
                <div class="content-text on">회원정보 수정</div>
              </a> 
            </div>
            <div class="side-item">
              <a href="${pageContext.request.contextPath}/myPage/myPagePurchaseHistory.jsp">
                <div class="content-text">구매 내역</div>
              </a>
            </div>
            <div class="side-item">
              <a href="${pageContext.request.contextPath}/myPage/myPageWishList.jsp">
                <div class="content-text">찜 목록</div>
              </a>
            </div>
        </div>
        <div class="myPage-main">
            <!-- 마이 페이지 title -->
            <div class="myPage-title">
               <div class="title-text">회원정보 수정</div>
            </div>
            <!-- 카테고리 별 메인 컨텐츠 -->
            <div class="myPage-main-contents">
              <div class="password-check-container">
                <div class="password-check-box">
                    <div class="password-check-box-inner">
                        <b>비밀번호를 입력하세요.</b>
                        <input class="content-password" type="password" id="inputPassword" maxlength="4">
                        <div class="inner-btnBox">
                            <button class="btn cancle" onclick="history.go(-1)">취소</button>
                            <button class="btn admit" onclick="location.href='${pageContext.request.contextPath}/myPage/myPageUserConfig.jsp'">확인</button>
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
    	<%@ include file ="/footer.jsp" %>
    </div>
  </body>
</html>