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
	<script src="https://code.jquery.com/jquery-3.7.0.js"
	integrity="sha256-JlqSTELeR4TLqP0OG9dxM7yDPqX1ox/HfgiSLBj8+kM="
	crossorigin="anonymous"></script>	
	<script src="${pageContext.request.contextPath}/resources/board/js/boardView.js" defer></script>
	<link rel="stylesheet" href="${pageContext.request.contextPath}/resources/board/css/boardView.css" rel="stylesheet" type="text/css" />
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
               <div class="title-text">문의 게시판</div>
               <p class="title-text-sub">자유롭게 질문할 수 있는 게시판 입니다.</p>
            </div>
            <div class="board-view">
              <!-- 게시글 제목 -->
              <div class="title"><c:out value="${board.getBoardName()}"></c:out></div>
              <!-- 게시글 정보 -->
              <div class="info">
                <!-- dl 리스트 사용해서 게시글 정보 나열 -->
                <dl>
                  <dt>번호</dt>
                  <dd><c:out value="${board.getBoardNum()}"></c:out></dd>
                </dl>
                <dl>
                  <dt>글쓴이</dt>
                  <dd><c:out value="${board.getUserName()}"></c:out></dd>
                </dl>
                <dl>
                  <dt>작성일</dt>
                  <dd><c:out value="${board.getBoardDate()}"></c:out></dd>
                </dl>
                <dl>
                  <dt>조회수</dt>
                  <dd><c:out value="${board.getBoardCount()}"></c:out></dd>
                </dl>
              </div>
              <!-- 게시글 작성내용 -->
              <div class="board-content">
             	<c:out value="${board.getBoardContent()}"></c:out>
              </div>
              <!-- 게시글 버튼 컨테이너 -->
              <div class="bt-container">
                <a href="${pageContext.request.contextPath}/board/boardListOk.bo" class="board-home">글 목록</a>
                	<c:if test="${sessionScope.userRoll ==0 || empty sessionScope.userNum }">
                		<a href="${pageContext.request.contextPath}/board/boardUpdatePasswordCheck.bo?boardNum=${board.getBoardNum()}" class="board-fix">수정</a>
                		<a href="${pageContext.request.contextPath}/board/boardDlePasswordCheck.bo?boardNum=${board.getBoardNum()}" class="board-delete">삭제</a>
              		</c:if>
            
              </div>
              <input type="hidden" value="${board.userNum} " name="userNum" class="userNum"/>
              <input type="hidden" value="${board.boardNum} " name="boardNum" class="boardNum"/>
              
              
              <div class="comment-container">
                <div class="comment-title">댓글</div>

                <div class="comment-content">
                  <div class="admin-name">관리자1</div>
                  <div class="admin-comment">답변내용이 들어갑니다</div>
                  <div class="comment-btn-container">
                    <a href="#" class="comment-fix-btn">수정</a>
                    <a href="#" class="comment-del-btn">삭제</a>
                  </div>
                </div>
          <!--       <div class="comment-content">
                  <div class="admin-name">관리자2</div>
                  <div class="admin-comment">답변내용이 들어갑니다</div>
                  <div class="comment-btn-container">
                    <a href="#" class="comment-fix-btn">수정</a>
                    <a href="#" class="comment-del-btn">삭제</a>
                  </div>
                </div>
                <div class="comment-content">
                  <div class="admin-name">김성찬</div>
                  <div class="admin-comment">답변내용이 들어갑니다</div>
                  <div class="comment-btn-container">
                    <a href="#" class="comment-fix-btn">수정</a>
                    <a href="#" class="comment-del-btn">삭제</a>
                  </div>
                </div>
                <div class="comment-content">
                  <div class="admin-name">관리자1</div>
                  <div class="admin-comment">답변내용이 들어갑니다</div>
                  <div class="comment-btn-container">
                    <a href="#" class="comment-fix-btn">수정</a>
                    <a href="#" class="comment-del-btn">삭제</a>
                  </div>
                </div>
 -->
              <div class="comment-write">
               			 <c:if test="${sessionScope.userRoll ==1}">
              
                <textarea rows="3" cols="120" placeholder="댓글을입력하세요" name="replyBox" class="replyBox"></textarea>
                <button class="comment-write-btn" type="button">댓글 등록</button>
                              </c:if>
                
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
