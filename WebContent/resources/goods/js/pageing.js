/**
 * 
 */
function pagination() {
  var list_info_num = 9; // 한 페이지에 보여줄 리스트 수
  var $li = $('.product-list li'); // 이미지가 보이는 li태그
  var total_num_li = $li.length; // li의 길이 -> 숫자 
  var num_pages = Math.ceil(total_num_li / list_info_num); // 페이지 수
  var current_page = 0;

  function showPage(page) {
    $li.hide();
    var start = page * list_info_num;
    var end = start + list_info_num;
    $li.slice(start, end).show();
    current_page = page;
    $(window).scrollTop(0);
    
    if(total_num_li==0){
		$('.prev').hide();
		$('.next').hide();
	}else {
		$('.prev').show();
		$('.next').show();
	}
  }

  function updatePage() {
    showPage(current_page);
    
  }
  for (var i = 1; i <= num_pages; i++) {
    $('.page-box').append("<li class='page-num'><a href='javascript:void(0);'>" + i + "</a></li>");
  }

  showPage(0); // 초기 페이지 설정

  $('.page-box a').click(function () {
    var page = parseInt($(this).text()) - 1;
    showPage(page);
  });

  $('.arrow.prev').click(function () {
    if (current_page > 0) {
      showPage(current_page - 1);
    }
  });

  $('.arrow.next').click(function () {
    if (current_page < num_pages - 1) {
      showPage(current_page + 1);
    }
  });
}

$(document).ready(function () {
  pagination();

  $('.page-box li:first-child').addClass("active");
});