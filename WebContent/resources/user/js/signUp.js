
window.onload = function() {

	document.getElementById("PostCodeSearch").onclick = function PostCodeSearch() {
		new daum.Postcode({
			oncomplete: function(data) {
				console.log(data);
				document.querySelector('#address').value = data.roadAddress;
			}
		}).open();
	}
}






function join(){
	$('.sign-btn').on('click', function() {


	let userEmail = $("#email").val();
	let userName = $("#name").val();
	let pwCh = $("#pw").val();
	let pwCh2 = $("#pw2").val();
	let userPhone = $("#phonenumber").val();
	let userAddress = $("#address").val();
	let userAddressDetail = $("#address_detail").val();

	if ($('.id_already').css('display') == 'block' || $('.checkEmail-result').css('display')=='block') {
		alert("이메일 양식 혹은 중복을 다시 한번 확인 부탁드립니다.")
		return false;
	}


	if (!(userEmail && userName && pwCh && pwCh2 && userPhone && userAddress && userAddressDetail)) {

		alert("모든 정보를 입력해주세요")
		return false;
	}
	
	$('#login_form').submit();
	alert(userName + " 님 환영합니다.")
	return true;

});
}
$('document').ready(function(){
	join();
})



$('#phonenumber').keyup(function(){
	let userPhone = $(this).val();
	
	if((userPhone.length <10 && userPhone.length >0)|| userPhone.includes('-')) {
		$('.phone_alreday').css('display', 'block');
		
		return;
	}else {
		$('.phone_alreday').css('display', 'none');

	}
	
})

//이메일 유효성 검사
/*
$('#email').keyup(function() {
	let userEmail = $(this).val();
	console.log(userEmail);
	const pattern = /^[A-Za-z0-9_\.\-]+@[A-Za-z0-9\-]+\.+/;
	
	let emailCheck = pattern.test(userEmail);
	
	if (emailCheck) {
		$('.checkEmail-result').css('display', 'none')
	} else {
		$('.checkEmail-result').css('display', 'block')
		return;
	}
})

*/




$('#pw2').keyup(function() {


	let pw = $("#pw").val();
	let pwCh = $("#pw2").val();

	if (pw != pwCh) {
		$('.labelPwCh').css('display', 'block');
		$('.labelEm').css('display', 'none');
		// $('.PwChOk').css('display', 'none');
		return;
	} else {
		// $('.PwChOk').css('display', 'block');
		$('.labelPwCh').css('display', 'none');
	}

});

//이메일용
function characterCheck(obj){
var regExp = /[ \{\}\[\]\/?,;:|\)*~`!^\-_+┼<>\#$%&\'\"\\\(\=]/gi; 
if( regExp.test(obj.value) ){
	alert("특수문자는 입력하실수 없습니다.");
	obj.value = obj.value.substring( 0 , obj.value.length - 1 ); // 입력한 특수문자 한자리 지움
	}
}

//모든특수문자용
function AllCharacterCheck(obj){
var regExp = /[ \{\}\[\]\/?.,;:|\)*~`!^\-_+┼<>\#$%&\'\"\\@\(\=]/gi; 
if( regExp.test(obj.value) ){
	alert("특수문자는 입력하실수 없습니다.");
	obj.value = obj.value.substring( 0 , obj.value.length - 1 ); // 입력한 특수문자 한자리 지움
	}
}



function checkPw() {

	let pw = $("#pw").val();
	let reg = /^(?=.*[a-zA-Z])(?=.*[!@#$%^&*()_=+])(?=.*[0-9]).{8,15}$/;

	let pwCheck = reg.test(pw);

	$('#pw').on('keyup', function() {

		if (pwCheck) {
			$('.labelPwNo').css("display", "none");
			$('.PwChOk').css('display', 'block');
		} else {
			$('.labelPwNo').css("display", "block");
			$('.PwChOk').css('display', 'none');
		}
	});
}
