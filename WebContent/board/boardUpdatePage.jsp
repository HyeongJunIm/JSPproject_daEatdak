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
    <link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
    <link href="https://fonts.googleapis.com/css2?family=IBM+Plex+Sans+KR&display=swap" rel="stylesheet"/>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/common/css/common.css" rel="stylesheet" type="text/css" />
	<link rel="shortcut icon" type="image/x-icon" href="${pageContext.request.contextPath}/resources/common/img/logoPic.png" />
	<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
	<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
	<!-- 개인 resource -->
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/board/css/boardConfig.css" rel="stylesheet" type="text/css" />
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
	<div class="board-container">
        <div class="board-main">
            <!-- 문의게시판 title -->
            <div class="board-title">
               <div class="title-text">문의 수정</div>
            </div>
           <form action="boardUpdate.bo?board=${board.getBoardNum()}" method="post"> 
	            <div class="write-title">
	              <input class="content-title" type="text" value="코딩 너무 재밌다" placeholder="제목을 입력하세요" maxlength="50" name="boardName">
	              <input class="content-password" type="password" placeholder="비밀번호" maxlength="4" name="boardPassword" required>
	              <div class="checkbox">
	                <p>비공개 여부</p><input type="checkbox" name="boardLock">
	              </div>
	            </div>
	            <div class="board-write">
	              <div class="write-content">
				<textarea name="boardContent">
				</textarea>
	              </div>
	              <div class="write-bottom">
	                <a href="${pageContext.request.contextPath}/board/boardListOk.bo" class="write-btn list">목록으로</a>
					<input type="hidden" name="boardNum" value="${board.getBoardNum()}" />
	                <button class="write-btn write" type="submit">글 등록</button> 
	              </div>
	            </div>
	      </form>      
        </div>
      </div>
    </main>
    </div>
    <div class="footer">
    	<%@ include file ="/footer.jsp" %>
    </div>
  </body>
</html>
