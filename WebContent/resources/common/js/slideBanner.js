
    $(document).ready(function() {
    var floatPosition = parseInt($("#floatMenu-container").css('top'));

    $(window).scroll(function() {
    var scrollTop = $(window).scrollTop();
    var attachedPosition = scrollTop + floatPosition + "px";


    $("#floatMenu-container").css('top', attachedPosition);


    }).scroll();

    });

    $('.top-button').click(function(){
        $(window).scrollTop(0,0);
        $("#floatMenu-container").hide();
        $('.top-button').hide();
});

function move(){
    
    $('.banner1').animate({width:'80'},200, 'linear',function(){
        $('.banner1').delay(1000).animate({width:"0"},200)
})
}
setInterval(move, 3000);


$('.empty-banner-session').on('click', function(){
	
	alert("로그인이 필요합니다.");
	
})
