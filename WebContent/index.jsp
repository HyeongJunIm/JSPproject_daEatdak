<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="UTF-8">

<meta name="viewport" content="width=device-width, initial-scale=1.0">
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/common/css/common.css"
	rel="stylesheet" type="text/css" />
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/common/css/index.css"
	rel="stylesheet" type="text/css" />
<link rel="shortcut icon" type="image/x-icon"
	href="${pageContext.request.contextPath}/resources/common/img/logoPic.png" />
<link rel="stylesheet"
	href="https://fonts.googleapis.com/css2?family=Material+Symbols+Outlined:opsz,wght,FILL,GRAD@20..48,100..700,0..1,-50..200" />
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<script
	src="${pageContext.request.contextPath}/resources/common/js/index.js?ver=1"
	defer></script>


<title>다잇닭</title>
</head>
<body>

	<!-- 모니터가 커져도 사이드 배너위치 고정을 위한 컨테이너 -->
	<div class="side-banner-container">
		<!-- 사이드 배너 영역 -->
		<div class="side-banner">
			<%@ include file="slideBanner.jsp"%>
		</div>
	</div>


	<!-- 헤더와 매인 부분을 감싸서 footer를 하단 고정하기 위한 컨테이너 
공통적으로 사용해야함-->
	<div class="header-main-container">
		<div class="header">

			<%@ include file="header.jsp"%>
		</div>

		<div class="main">
			<main>
				<div class="main-content-container">
					<div class="banner-container">

						<!-- 배너 좌우 여백에 배경색을 넣기 위한 영역 -->
						<div class="background"></div>

						<!-- 매인 배너 섹션 -->
						<div class="banner-section">
							<ul>
								<li><img
									src="${pageContext.request.contextPath}/resources/common/img/mainbanner3.jpg"
									alt="매인베너" /></li>
								<li><img
									src="${pageContext.request.contextPath}/resources/common/img/mainBanner1.jpg"
									alt="매인베너" /></li>
								<li><img
									src="${pageContext.request.contextPath}/resources/common/img/mainbanner2.jpg"
									alt="매인베너" /></li>
							</ul>

						</div>

						<!-- 배너 순서 -->
						<div class="bannerCnt">
							<p></p>
						</div>
					</div>

					<!-- 상품들 탭메뉴 형식으로 나타낸 영역 -->
					<div class="goods-container">
						<div class="goods-section">
							<!-- 상품 카테고리(탭메뉴) -->
							<div class="goods-tap">
								<h3>
									<span>급찐살?!</span> 저희가 도와드릴게요! 그래서 준비했어요!
								</h3>
								<div class="goods-tap-center">
									<ul>
										<li><h4>
												<a href="#panel1" class="on">닭고기</a>
											</h4></li>
										<li>|</li>
										<li><h4>
												<a href="#panel2">돼지고기</a>
											</h4></li>
										<li>|</li>
										<li><h4>
												<a href="#panel3">소고기</a>
											</h4></li>
										<li>|</li>
										<li><h4>
												<a href="#panel4">간편식 음료</a>
											</h4></li>
									</ul>
								</div>
							</div>
							<!-- 카테고리별 상품들 -->
							<div class="goods-contents">
								<div class="panel" id="panel1">

									<c:choose>
										<c:when test="${not empty goodsChickenVo}">
											<ul>
												<c:forEach items="${goodsChickenVo}" var="chicken"
													varStatus="loop">
													<c:if test="${loop.index < 10}">
														<li><a href="#">
																<div class="zoom-container">
																	<figure class="img">
																		<a
																			href="${pageContext.request.contextPath}/goods/goodsBuy.go?goodsNum=${chicken.goodsNum}">
																			<img
																			src="${pageContext.request.contextPath}/upload/${chicken.fileSystemName}"
																			alt="신상품1" />
																		</a>
																	</figure>
																</div>
																<h5>
																	다잇닭
																	</h5>
																		<h6>${chicken.goodsName}</h6>
																		<p>${chicken.goodsPrice}원</p>
														</a></li>
													</c:if>
												</c:forEach>
											</ul>
										</c:when>
									</c:choose>

									<div class="move-to-menu-button-section">
										<a
											href="${pageContext.request.contextPath}/goods/goodsList.go?categoryNum=1">
											<h6>닭고기 전체보기</h6>
										</a>
									</div>
								</div>



								<div class="panel" id="panel2">
									<c:choose>
										<c:when test="${not empty goodsPorkVo}">
											<ul>
												<c:forEach items="${goodsPorkVo}" var="pork"
													varStatus="loop">
													<c:if test="${loop.index < 10}">
														<li><a href="#">
																<div class="zoom-container">
																	<figure class="img">
																		<a
																			href="${pageContext.request.contextPath}/goods/goodsBuy.go?goodsNum=${pork.goodsNum}">
																			<img
																			src="${pageContext.request.contextPath}/upolad/${pork.fileSystemName}"
																			alt="신상품2" />
																		</a>
																	</figure>
																</div>
																<h5>
																	다잇닭
																	</h5>
																		<h6>${pork.goodsName}</h6>
																		<p>${pork.goodsPrice}원</p>
														</a></li>
													</c:if>
												</c:forEach>
											</ul>
										</c:when>
									</c:choose>
									<div class="move-to-menu-button-section">
										<a
											href="${pageContext.request.contextPath}/goods/goodsList.go?categoryNum=2">
											<h6>돼지고기 전체보기</h6>
										</a>
									</div>
								</div>





								<div class="panel" id="panel3">
									<c:choose>
										<c:when test="${not empty goodsMeatVo}">
											<ul>
												<c:forEach items="${goodsMeatVo}" var="meat"
													varStatus="loop">
													<c:if test="${loop.index < 10}">
														<li><a href="#">
																<div class="zoom-container">
																	<figure class="img">
																		<a
																			href="${pageContext.request.contextPath}/goods/goodsBuy.go?goodsNum=${meat.goodsNum}">
																			<img
																			src="${pageContext.request.contextPath}/upload/${meat.fileSystemName}"
																			alt="신상품2" />
																		</a>
																	</figure>
																</div>
																<h5>
																	다잇닭
																	</h5>
																		<h6>${meat.goodsName}</h6>
																		<p>${meat.goodsPrice}원</p>
														</a></li>
													</c:if>
												</c:forEach>
											</ul>
										</c:when>
									</c:choose>
									<div class="move-to-menu-button-section">
										<a
											href="${pageContext.request.contextPath}/goods/goodsList.go?categoryNum=3">
											<h6>소고기 전체보기</h6>
										</a>
									</div>
								</div>
								<div class="panel" id="panel4">
									<c:choose>
										<c:when test="${not empty goodsConVo}">
											<ul>
												<c:forEach items="${goodsConVo}" var="con" varStatus="loop">
													<c:if test="${loop.index < 10}">
														<li><a href="#">
																<div class="zoom-container">
																	<figure class="img">
																		<a
																			href="${pageContext.request.contextPath}/goods/goodsBuy.go?goodsNum=${con.goodsNum}">
																			<img
																			src="${pageContext.request.contextPath}/upload/${con.fileSystemName}"
																			alt="신상품2" />
																		</a>
																	</figure>
																</div>
																<h5>
																	다잇닭
																	</h5>
																		<h6>${con.goodsName}</h6>
																		<p>${con.goodsPrice}원</p>
														</a></li>
													</c:if>
												</c:forEach>
											</ul>
										</c:when>
									</c:choose>
									<div class="move-to-menu-button-section">
										<a
											href="${pageContext.request.contextPath}/goods/goodsList.go?categoryNum=4">
											<h6>간편식 전체보기</h6>
										</a>
									</div>
								</div>
							</div>
						</div>


					</div>

					<!-- 신상품 영역 -->
					<div class="recently-goods-container">
						<div class="recently-goods-section">
							<div class="recently-title-tap">
								<h3>
									뭘 좋아할지 몰라 <span>따끈따끈 신상품</span>들을 모아봤어요!
								</h3>
							</div>

							<!-- 신상품 -->
							<div class="recently-goods-contents">
								<c:choose>
									<c:when test="${not empty recentlyGoods}">
										<ul>
											<c:forEach items="${recentlyGoods}" var="recent"
												varStatus="loop">
												<c:if test="${loop.index < 10}">
													<li><a
														href="${pageContext.request.contextPath}/goods/goodsBuy.go?goodsNum=${recent.goodsNum}">
															<div class="zoom-container">
																<img
																	src="${pageContext.request.contextPath}/upload/${recent.fileSystemName}"
																	alt="신상품1" />
															</div>
															<p>
																<span>${recent.categoryName}</span>${recent.goodsName}</p>
															<p>${recent.goodsPrice}원</p>
													</a></li>
												</c:if>
											</c:forEach>
										</ul>
									</c:when>
									<c:otherwise>
										<li>
											<p>판매량이 높은 상품이 없습니다.</p>
										</li>
									</c:otherwise>
								</c:choose>
							</div>


							<!-- 화살표-좌우슬라이드 -->
						</div>
						<button class="recently-section-button recently-left-button">
							<span class="material-symbols-outlined"> arrow_back_ios </span>
						</button>
						<button class="recently-section-button recently-right-button">
							<span class="material-symbols-outlined"> arrow_forward_ios
							</span>
						</button>
					</div>
				</div>

				<!-- 조리법 영역 -->
				<div class="media-section">
					<h3>
						<span>다잇닭</span>을 더 재미있게 즐길 수 있는 방법!
					</h3>
					<div class="media-taps">
						<div class="media-tap">
							<video
								src="${pageContext.request.contextPath}/resources/common/img/media1.mp4"
								controls muted>
							</video>
						</div>

						<!-- 조리법에 관한 재료와 준비물 -->
						<div class="media-material">
							<h3>닭가슴살 김밥!</h3>
							<dl>
								<dt>이것들을 준비해주세요!</dt>
								<dd>
									<div class="media-img-container">
										<img
											src="${pageContext.request.contextPath}/resources/common/img/닭고기/chicken.jpg"
											alt="재료1" />
									</div>
									<div class="material-detail">
										<p>다잇닭</p>
										<p>훈제 닭가슴살 100g</p>
										<p>
											<a
												href="${pageContext.request.contextPath}/goods/GoodsBuyPage.jsp">구매하기</a>
										</p>
									</div>
								</dd>
							</dl>
							<div class="extra-material">
								<p>
									<span>김밥용김 계란 파프리카 오이 당근</span>도<br> 필요해요!
								</p>

							</div>
						</div>
					</div>
				</div>
			</main>

		</div>
	</div>

	<div class="footer">
		<%@ include file="footer.jsp"%>

	</div>
</body>

<script src="https://code.jquery.com/jquery-3.6.0.min.js"></script>
<!-- <script>
    $(document).ready(function () {
        // 페이지 로드 시 서버에서 데이터를 가져와서 출력
        $.ajax({
            url: "getTopSellingGoods", // 실제로 데이터를 가져올 서버 URL을 입력해야 합니다.
            method: "GET",
            dataType: "json",
            success: function (data) {
                var $topSellingGoodsList = $("#topSellingGoodsList");
                
                // 가져온 데이터를 동적으로 리스트에 추가
                $.each(data, function (index, goods) {
                    $topSellingGoodsList.append(
                    		'<ul>' +
                        '<li>' +
                        '<a href="#">' +
                        '<div class="zoom-container">' +
                        '<!-- 이미지 없음 -->
<!--  ' +
                        '</div>' +
                        '<p><span>다있닭</span> ' + goods.goods_name + '</p>' +
                        '<p>' + goods.goods_price + '원</p>' +
                        '</a>' +
                        '</li>' +
                        '</ul>'
                        
                    );
                    content.trigger( "create") ;
                });
            }
        });
    }); -->


<!-- </script> 
 -->
</html>