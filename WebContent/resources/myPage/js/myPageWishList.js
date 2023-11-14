/**
 * 
 */

let userNum = $('.userNum').val();
console.log(userNum)






//찜목록 가져오기
function wishlist(userNum, callback) {
	$.ajax({

		url: '/myPage/myPageWishRestOk.mp',
		type: 'post',
		data: {
			userNum: userNum
		},
		dataType: 'json',
		success: function(result) {

			console.log(result);

			if (callback) {
				callback(result)
			}


		}, error: function(a, b, c) {
			console.error(c);
		}

	})
}

wishlist(userNum, showWishlist);


//찜 목록 뿌리기
function showWishlist(result) {

	let text = '';
	let wishLoca = $('.myPage-main-contents');

	result.forEach(r => {
		text += `
		
						<div class="product">
								<div class="product-img-box">
								<a href="/goods/goodsBuy.go?goodsNum=${r.goodsNum}">
									<img class="product-img"
										src="/upload/${r.fileSystemName}">
								</a>
								</div>
								<div class="product-info">
									<h4>${r.goodsName}</h4>
									<p>${r.goodsPrice} 원</p>
									<div class="cart-btn-box">
										<button class="cart-btn cart-move-btn" data-goodsnum="${r.goodsNum}">장바구니로 이동</button>
										<button class="cart-btn deleteBtn" data-wishnum="${r.wishlistNum}">목록에서 제거</button>
									</div>
								</div>
							</div>
		
		`;


	})

	wishLoca.html(text);
}


//찜 목록 삭제
function wishlistDelete(wishlistNum, callback) {

	$.ajax({

		url: '/myPage/wishDelete.mp',
		type: 'get',
		data: {

			wishlistNum: wishlistNum

		}, success: function(result) {

			if (callback) {
				callback(result);
			}

		}, error: function(a, b, c) {

			console.error(c);
		}
	})
}


$('.myPage-main-contents').on('click', '.deleteBtn',function() {

	let wishlistNum = $(this).data('wishnum');
	console.log(wishlistNum)

	if (confirm("찜 목록에서 삭제하시겠습니까?")) {
		wishlistDelete(wishlistNum, function(){
			wishlist(userNum, showWishlist);
		})

	}
})





//찜목록에서 장바구니에 담기
$('.myPage-main-contents').on('click', '.cart-move-btn', function(){
	
	let goodsNum = $(this).data('goodsnum');

	console.log(goodsNum);
	
	addToCart(goodsNum);
	
})

//찜목록에서 장바구니에 담기(같은 상품이 장바구니에 있으면 경고창 띄움)
function addToCart(goodsNum){
	$.ajax({
		
		url : '/myPage/wishlistToCart.mp',
		type : 'post',
		data : {
			goodsNum : goodsNum
		},
		success : function(result){
			
			console.log(result)
			if(result==1){
				alert("장바구니에 이미 담긴 상품입니다.")
			}else if(result==0){
				alert("장바구니에 추가되었습니다.")
			}
		
		
		
		}, error : function(a,b,c){
			console.error(c);
		}
		
		
	})

}
	






