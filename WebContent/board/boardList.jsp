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
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/board/css/boardList.css" rel="stylesheet" type="text/css" />
	<link rel="shortcut icon" type="image/x-icon" href="${pageContext.request.contextPath}/resources/common/img/logoPic.png" />
	<link rel="stylesheet" href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
	<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/board/js/boardList.js" defer></script>
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
    	<%@ include file="/header.jsp" %>
    </div>
    <main>
      <div class="board-container">
        <div class="board-main">
            <!-- 문의게시판 title -->
            <div class="board-title">
               <div class="title-text">문의 게시판</div>
               <p class="title-text-sub">자유롭게 질문할 수 있는 게시판 입니다.</p>
            </div>
            <!-- 게시판 리스트 container -->
            <div class="top">
              <div class="num">번호</div>
              <div class="title">제목</div>
              <div class="writer">글쓴이</div>
              <div class="date">작성일</div>
              <div class="count_list">조회수</div>
            </div>
            <div class="board-list">
              <!-- 항목별 제목 top으로 구분 -->
            	<c:choose>
              		<c:when test="${not empty boardList}">
	              		<c:forEach var="board" items="${boardList}">
	              			<c:choose>
	              			 <c:when test="${board.getBoardLock()==0}"> 
			              			<div class="post">
			              				<div class="num">
			              					<c:out value="${board.getBoardNum()}"></c:out>
			              				</div>
			              				<div class="title">
			              					<a href="${pageContext.request.contextPath}/board/boardViewOk.bo?boardNum=${board.getBoardNum()}">
			              						<c:out value="${board.getBoardName()}"></c:out>
			              					</a>
			              				</div>
			              				<div class="witer">
			              					<c:out value="${board.getUserName()}"></c:out>
			              				</div>
			              				<div class="date">
			              					<c:out value="${board.getBoardDate()}"></c:out>
			              				</div>
			              				<div class="count">
			              					<c:out value="${board.getBoardCount()}"></c:out>
			              				</div>
		              				</div>
		              		</c:when>
		              		<c:when test="${board.getBoardLock()==1}">
		              				<div class="post">
			              				<div class="num">
			              					<c:out value="${board.getBoardNum()}"></c:out>
			              				</div>
<<<<<<< HEAD
			              				<div class="title">
			              					<c:choose>
			              					
			              						<c:when test="${sessionScope.userRoll ==0 || empty sessionScope.userNum }">
			              							<a href="${pageContext.request.contextPath}/board/boardPasswordCheckConfig.bo?boardNum=${board.getBoardNum()}">
			              								비공개 글 입니다.
			              							</a>
			              						</c:when>
			              						<c:when test="${sessionScope.userRoll==1}">
			              							<a href="${pageContext.request.contextPath}/board/boardViewOk.bo?boardNum=${board.getBoardNum()}">
			              							비공개 글 입니다.
			              						</a>
			              						</c:when>
			              					</c:choose>
			              					
=======
			              				<div class="title">1
			              					<a href="${pageContext.request.contextPath}/board/boardPasswordCheckConfig.bo?boardNum=${board.getBoardNum()}">
			              						비공개 글 입니다.
			              					</a>
>>>>>>> 19d2ef5a476a29e57a79fe72c23655ac0308896c
			              				</div>
			              				<div class="witer">
			              				<c:choose>
			              					<c:when test="${not empty board.getUserName()}">
			              					<c:out value="${board.getUserName()}"></c:out>
			              					</c:when>
			              					<c:otherwise>
			              					비회원
			              					</c:otherwise>
			              				</c:choose>	
			              				</div>
			              				<div class="date">
			              					<c:out value="${board.getBoardDate()}"></c:out>
			              				</div>
			              				<div class="count">
			              					<c:out value="${board.getBoardCount()}"></c:out>
			              				</div>
			              			</div>
		              			</c:when>	
	              			</c:choose>			
	              		</c:forEach>
              		</c:when>			
              		<c:otherwise>
              			<div class="post"><div class="post_nonetitle" style="margin-left: 250px;">게시글이 없습니다.</div></div>
              		</c:otherwise>
            	</c:choose>
            </div>
            <div class="board-list-bottom">
               <div class="board-search-container">
                    <form action=""> 
                      <select>
                        <option>제목</option>
                        <option>이름</option>
                      </select>
                      <input type="text" id="search" />
                      <button type="submit">
                        <span class="material-symbols-outlined">search</span>
                      </button>
                    </form>
               </div>
                <div class="board-page">
                  <!-- <a href="#" class="bt first"><<</a>
                  <a href="#" class="bt prev"><</a>
                  <a href="#" class="bt num on">1</a>
                  <a href="#" class="bt num">2</a>
                  <a href="#" class="bt num">3</a>
                  <a href="#" class="bt num">4</a>
                  <a href="#" class="bt num">5</a>
                  <a href="#" class="bt next">></a>
                  <a href="#" class="bt last">>></a> -->
                </div>
                <div class="bt-container">
                	<c:choose>
                		<c:when test="${sessionScope.userRoll ==0}">
                    		<a href="${pageContext.request.contextPath}/board/boardWrite.bo" class="board-write">등록</a>
                		</c:when>
                		<c:when test="${sessionScope.userRoll ==1}" > 
                		</c:when>
                	</c:choose>	
                </div>
          </div>
        </div>
      </div>
    </main>
    </div>
    <div class="footer">
    	<%@ include file="/footer.jsp" %>
    </div>
  </body>
</html>
