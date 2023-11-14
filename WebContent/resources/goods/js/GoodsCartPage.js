/**
 * 
 */
let $all = $(".all");
let $inputs = $(".term");
let buttons = document.querySelector('.button');
let cartgoods = document.querySelectorAll('.cart-goods');

$all.on('click', function(){
    if($(this).is(":checked")){
        $inputs.prop('checked', true);
                updateTotalPrice();
    }else{
        $inputs.prop('checked', false);
                updateTotalPrice();
    }
});



$inputs.on('click', function(){
    if(!$(this).is(":checked")){
        $all.prop('checked', false);
    }
    if($inputs.filter(":checked").length === cartgoods.length){
        $all.prop('checked', true);
    }
});

/*buttons.addEventListener('click', function(){
    let checkedInputs = document.querySelectorAll('.term:checked');
    
    if (checkedInputs.length > 0) {
		
		
		
        alert("상품이 삭제되었습니다.");
        
        checkedInputs.forEach(function(input){
            $(input).closest(".cart-goods").remove();
        });
        $all.prop('checked', false);
    } else {
        alert("선택된 상품이 없습니다.");
    }
});

*/

$('.term').on('click', function(){
	let goodsNum = $('.term').val();
	console.log(goodsNum);
})

// 주문하기 마우스 오버,아웃 이벤트
let productorders=document.querySelector('.product-order button');

productorders.addEventListener('mouseover',function(){
	productorders.style.color="white";
	productorders.style.backgroundColor="rgba(94,190,231)";
})

productorders.addEventListener('mouseout',function(){
	productorders.style.color="rgba(94,190,231)";
	productorders.style.backgroundColor="white";
})

/*
//  주문하기 클릭시 주문하기 데이터가 사라지고 장바구니가 비어있다는 웹으로 이동
productorders.addEventListener('click',function(){
    if (cartgoods.length >0) {
        cartgoods.forEach(function (cartgoods){
            cartgoods.remove();
        });
        alert("상품주문완료");
        $('.product-order span').css('display','none');
        window.location.href="/product/html/product_cart.html";
    }
});
*/



$('.increase').on('click', function(){
	let price2 = $(this).closest('.order-choice').find('.cartItemPrice').val();
	let count = parseInt($(this).closest('.order-choice').find('.count').text().trim());
	$(this).closest('.order-choice').find('.count').text(count+1);
	
	let totalPrice = $(this).closest('.cart-goods').find('.total-price');
	totalPrice.text((count+1)*price2 + '원');
});

$('.decrease').on('click', function(){
	let price2 = $(this).closest('.order-choice').find('.cartItemPrice').val();
	let count = parseInt($(this).closest('.order-choice').find('.count').text().trim());

	if(parseInt(count) < 2) { return; }
	$(this).closest('.order-choice').find('.count').text(parseInt(count)-1);
	
	let totalPrice = $(this).closest('.cart-goods').find('.total-price');
	totalPrice.text((count-1)*price2 + '원')
});

function updateTotalPrice() {
    var total = 0;

    $(".cart-goods").each(function () {
        var isChecked = $(this).find(".term").is(":checked");
        if (isChecked) {
            var itemPrice = parseInt($(this).find(".cartItemPrice").val());
            var itemCount = parseInt($(this).find(".count").text().trim());
            total += itemPrice * itemCount;
            
        }
    });

    // 결과를 주문하기 위에 업데이트
    $("#totalPriceInput").val(total + "원");
}

// 체크박스 또는 수량 변경 시 호출하여 전체 가격을 업데이트
$(".term, .increase, .decrease").on("change click", function () {
    updateTotalPrice();
});

// 페이지 로드 시 초기 전체 가격 계산
$(document).ready(function () {
    updateTotalPrice();
});



