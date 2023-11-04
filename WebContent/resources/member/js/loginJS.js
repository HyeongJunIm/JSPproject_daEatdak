function loginName() {

    $(".btnLogin").click(function() {
		
		
		var name = $("#userEmail").val();
		var password = $("#userPassword").val();

		if(name == "" ) {
						$(".loginX").css("display", "none");

			$('.nameNull').css("display","block");
			$('.nameNull').css("color","red");
			$('.pwNull').css("display","none");

			return false;

		} else if(password == "" ) {
						$(".loginX").css("display", "none");

			$('.pwNull').css("display","block");
			$('.pwNull').css("color","red");
			$('.nameNull').css("display","none");

			return false;
		} 
		$(".loginX").css("color", "red");

		return true;
	})
  }

$('document').ready(function(){

	loginName();
	});


