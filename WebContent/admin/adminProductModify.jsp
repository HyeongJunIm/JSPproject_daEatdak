<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>다잇닭</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/admin/css/adminProductRegist.css?ver=3">

<script src="https://code.jquery.com/jquery-3.7.0.js"
	integrity="sha256-JlqSTELeR4TLqP0OG9dxM7yDPqX1ox/HfgiSLBj8+kM="
	crossorigin="anonymous"></script>


<!-- Plugin -->
<link href="https://fonts.googleapis.com/css?family=Roboto"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://rawgit.com/enyo/dropzone/master/dist/dropzone.css" />
<script src="https://rawgit.com/enyo/dropzone/master/dist/dropzone.js"></script>
<script src="${pageContext.request.contextPath}/resources/admin/js/adminProductUp.js" ></script>
 
</head>

<body>

	
				<main class="test">
					<div class="section-container">
						<!-- 좌측 관리자 메뉴-->
						<%@ include file="aside.jsp"%>

						<div class="admin_productRegist">
							<div class="PageName">
								<h2>상품 수정</h2>
							</div>								
							
							<hr style="width: 90%;">
							<form action="/admin/goodsModifyOk.ad" method="post"
								enctype="multipart/form-data">
								<div class="Rege">
									<c:forEach var ="goods" items ="${list}"> 
										
									<div class="totalProdList">
										<div class="registerPage">

											<div style="width: 350px; height: 350px;">
												<div id=image_container>
													<img src="${pageContext.request.contextPath}/upload/${goods.fileSystemName}" />
												</div>
												
											</div>

											<div style="width: 60%; margin-left: 10px;">


												<div class="productRegist">
													<div>
														<span>상품분류</span>&nbsp;&nbsp; 
														<select name="goodsCategory" >
															<option
																value="1" <c:if test="${categoryNum==1}"> selected </c:if>>닭고기</option>
																
															<option
																value="2" <c:if test="${categoryNum==2}"> selected </c:if>>소고기</option>
															<option
																value="3" <c:if test="${categoryNum==3}"> selected </c:if>>돼지고기</option>
															<option
																value="4" <c:if test="${categoryNum==4}"> selected </c:if>>간편식</option>
														</select>
														<hr>
													</div>
												</div>


												<div class="productRegist">
													<div>
														<span>상품명&nbsp;&nbsp;&nbsp;&nbsp;</span>&nbsp;&nbsp;&nbsp;
														<input name="goodsName"
															value="<%=request.getAttribute("goodsName")%>"
															class="productRegist-text" type="text"
															placeholder="상품명을 입력해 주세요.">
													</div>
													<hr>
												</div>
												<div class="productRegist">
													<div>
														<span>상품 가격</span>&nbsp;&nbsp; <input name="goodsPrice"
															value="<%=request.getAttribute("goodsPrice")%>"
															class="productRegist-text" type="number"
															placeholder="상품 가격을 입력해 주세요.">
													</div>
													<hr>
												</div>
												<div class="productRegist">
													<div>
														<span>상품 재고</span>&nbsp;&nbsp; <input name="goodsQuantity"
															value="<%=request.getAttribute("goodsQuantity")%>"
															class="productRegist-text" type="number"
															placeholder="상품 재고를 입력해 주세요.">
													</div>
													<hr>
												</div>



											</div>
										</div>
									</div>


									<div>
										<input type="text" name="goodsDetail" 
										value="<%=request.getAttribute("goodsDetail")%>" placeholder="상품설명을 적어주세요."/>
 															
										<input type="hidden" value="<%=request.getAttribute("goodsNum") %>" name="goodsNum" />
										
						
									</div>
										<div class="productRegist-btn">
											<button class="upload" style="width: 80px; height: 40px;"
											>수정하기</button>
										</div>
									</c:forEach>
									</div>



							</form>

						</div>
					</div>
				</main>


	
</body>
</html>