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
								<input type="hidden" value="<%=request.getAttribute("goodsNum") %>" name="goodsNum" />
								
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


									<%-- <div>
										<input type="text" name="goodsDetail" 
										value="<%=request.getAttribute("goodsDetail")%>" placeholder="상품설명을 적어주세요."/>
 															
										
						
									</div> --%>
									
										<div class="img-List">
						
							<div>
								<div style="width: 900px; height: 300px;">
									<div class="imgs_container" id="imgs_container1"></div>
								</div>
								<div class="btnLeft">
									<input type="file" id="images" accept="image/*" name="goodsDetailImg1"
										onchange="setThumbnail2(event);" style="width: 180px;" />
									<button class="imgsDel">삭제</button>
								</div>
							</div>

							<div>
								<div style="width: 900px; height: 300px;">
									<div class="imgs_container" id="imgs_container2"></div>
								</div>
								<div class="btnLeft">
									<input type="file" id="images" accept="image/*" name="goodsDetailImg2"
										onchange="setThumbnail3(event);" style="width: 180px;" />
									<button class="imgsDel">삭제</button>
								</div>
							</div>

							<div>
								<div style="width: 900px; height: 300px;">
									<div class="imgs_container" id="imgs_container3"></div>
								</div>
								<div class="btnLeft">
									<input type="file" id="images" accept="image/*" name="goodsDetailImg3"
										onchange="setThumbnail4(event);" style="width: 180px;" />
									<button class="imgsDel">삭제</button>
								</div>
							</div>

							<div>
								<div style="width: 900px; height: 300px;">
									<div class="imgs_container" id="imgs_container4"></div>
								</div>
								<div class="btnLeft">
									<input type="file" id="images" accept="image/*" name="goodsDetailImg4"
										onchange="setThumbnail5(event);" style="width: 180px;" />
									<button class="imgsDel">삭제</button>
								</div>
							</div>

							<div>
								<div style="width: 900px; height: 300px;">
									<div class="imgs_container" id="imgs_container5"></div>
								</div>
								<div class="btnLeft">
									<input type="file" id="images" accept="image/*" name="goodsDetailImg5"
										onchange="setThumbnail6(event);" style="width: 180px;" />
									<button class="imgsDel">삭제</button>
								</div>
							</div>



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


	<script>
	function setThumbnail2(event) {
		var reader = new FileReader();
		reader.onload = function(event) {
			var img = document.createElement("img");
			img.setAttribute("src", event.target.result);
			document.querySelector("#imgs_container1").appendChild(img);
		};
		reader.readAsDataURL(event.target.files[0]);
	}

	function setThumbnail3(event) {
		var reader = new FileReader();
		reader.onload = function(event) {
			var img = document.createElement("img");
			img.setAttribute("src", event.target.result);
			document.querySelector("#imgs_container2").appendChild(img);
		};
		reader.readAsDataURL(event.target.files[0]);
	}

	function setThumbnail4(event) {
		var reader = new FileReader();
		reader.onload = function(event) {
			var img = document.createElement("img");
			img.setAttribute("src", event.target.result);
			document.querySelector("#imgs_container3").appendChild(img);
		};
		reader.readAsDataURL(event.target.files[0]);
	}

	function setThumbnail5(event) {
		var reader = new FileReader();
		reader.onload = function(event) {
			var img = document.createElement("img");
			img.setAttribute("src", event.target.result);
			document.querySelector("#imgs_container4").appendChild(img);
		};
		reader.readAsDataURL(event.target.files[0]);
	}

	function setThumbnail6(event) {
		var reader = new FileReader();
		reader.onload = function(event) {
			var img = document.createElement("img");
			img.setAttribute("src", event.target.result);
			document.querySelector("#imgs_container5").appendChild(img);
		};
		reader.readAsDataURL(event.target.files[0]);
	}

	
</script>


<script type="text/javascript">
function DropFile(dropAreaId, fileListId) {
	  let dropArea = document.getElementById(dropAreaId);
	  let fileList = document.getElementById(fileListId);

	  function preventDefaults(e) {
	    e.preventDefault();
	    e.stopPropagation();
	  }

	  function highlight(e) {
	    preventDefaults(e);
	    dropArea.classList.add("highlight");
	  }

	  function unhighlight(e) {
	    preventDefaults(e);
	    dropArea.classList.remove("highlight");
	  }

	  function handleDrop(e) {
	    unhighlight(e);
	    let dt = e.dataTransfer;
	    let files = dt.files;

	    handleFiles(files);

	    const fileList = document.getElementById(fileListId);
	    if (fileList) {
	      fileList.scrollTo({ top: fileList.scrollHeight });
	    }
	  }

	  function handleFiles(files) {
	    files = [...files];
	    files.forEach(previewFile);
	  }

	  function previewFile(file) {
	    console.log(file);
	    renderFile(file);
	  }

	  function renderFile(file) {
	    let reader = new FileReader();
	    reader.readAsDataURL(file);
	    reader.onloadend = function () {
	      let img = dropArea.getElementsByClassName("preview");
	      img.src = reader.result;
	      img.style.display = "block";
	    };
	  }


	  return {
	    handleFiles
	  };

	}

	const dropFile = new DropFile("drop-file", "files");


	function productDel() {
	  $(".ins").click(function() {
	      var up = confirm("등록 하시겠습니까?");
	      link = "admin_productInfo.html"
	      if(up) {
	          alert("등록되었습니다.")
	          location.href = link;
	      }
	  })
	  
	  $(".imgDel").click(function() {
	    $("#image_container img").css("display","none");
	  });
	  
	  $(".imgsDel").click(function() {
	    $(".imgs_container img").css("display","none");
	  });



	}

	$('document').ready(function(){
	  productDel();
	$('.pagination li:first-child').addClass("disabled");

	});





</script>
</body>

</html>