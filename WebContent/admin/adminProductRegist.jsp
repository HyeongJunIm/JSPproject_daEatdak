<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">

<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>다잇닭</title>
<link rel="stylesheet"
	href="${pageContext.request.contextPath}/resources/admin/css/adminProductRegist.css?ver=3">
<!-- <script src="${pageContext.request.contextPath}/resources/admin/js/adminProductRegist.js"></script> -->

<script src="https://code.jquery.com/jquery-3.7.0.js"
	integrity="sha256-JlqSTELeR4TLqP0OG9dxM7yDPqX1ox/HfgiSLBj8+kM="
	crossorigin="anonymous"></script>


<!-- Plugin -->
<link href="https://fonts.googleapis.com/css?family=Roboto"
	rel="stylesheet">
<link rel="stylesheet"
	href="https://rawgit.com/enyo/dropzone/master/dist/dropzone.css" />
<script src="https://rawgit.com/enyo/dropzone/master/dist/dropzone.js"></script>


</head>

<body>
	<main class="test">
		<div class="section-container">
			<!-- 좌측 관리자 메뉴-->
			<%@ include file="aside.jsp"%>

			<div class="admin_productRegist">
				<div class="PageName">
					<h2>상품 등록</h2>
				</div>
				<hr style="width: 90%;">
				<form action="/admin/goodsRegistOk.ad" method="post"  enctype="multipart/form-data">
				<div class="Rege">
				
					<div class="totalProdList">
						<div class="registerPage">
						
							<div style="width: 350px; height: 350px;">
								<div id=image_container></div>
								<input type="file" id="image" accept="image/*" accept=".jpg, .jpeg, .png" multiple 
									onchange="setThumbnail(event);" style="width: 180px;" name="goodsMainImg"/>
								<button type="button" class="imgDel">삭제</button>
							</div>

							<div style="width: 60%; margin-left: 10px;">
							
								<div class="productRegist">
									<div>
										<span>상품분류</span>&nbsp;&nbsp; 
										<select name="goodsCategory">
											<option value="1">닭고기</option>
											<option value="2">소고기</option>
											<option value="3">돼지고기</option>
											<option value="4">간편식</option>
											
										</select>
										<hr>
									</div>
								</div>
								
								<div class="productRegist">
									<div>
										<span>상품명&nbsp;&nbsp;&nbsp;&nbsp;</span>&nbsp;&nbsp;&nbsp; 
										<input name="goodsName"
											class="productRegist-text" type="text"
											placeholder="상품명을 입력해 주세요.">
									</div>
									<hr>
								</div>
								<div class="productRegist">
									<div>
										<span>상품 가격</span>&nbsp;&nbsp; 
										<input name="goodsPrice"
											class="productRegist-text" type="number"
											placeholder="상품 가격을 입력해 주세요.">
									</div>
									<hr>
								</div>
								<div class="productRegist">
									<div>
										<span>상품 재고</span>&nbsp;&nbsp; 
										<input name="goodsQuantity"
											class="productRegist-text" type="number"
											placeholder="상품 재고를 입력해 주세요.">
									</div>
									<hr>
								</div>
							</div>
						</div>
					</div>
						<div>
							<textarea cols="30" rows="5" name="goodsDetail" maxlength="500" placeholder="상품 설명">
							</textarea>
						
						</div>

						<div class="productRegist-btn">
							<button class="ins" style="width: 80px; height: 40px;">등록하기</button>
						</div>

					</div>


			

			</form>
				
			</div>
		</div>
	</main>

</body>














<script>
	function setThumbnail(event) {
		var reader = new FileReader();
		reader.onload = function(event) {
			var img = document.createElement("img");
			img.setAttribute("src", event.target.result);
			document.querySelector("#image_container").appendChild(img);
		};
		reader.readAsDataURL(event.target.files[0]);
	}

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
</html>