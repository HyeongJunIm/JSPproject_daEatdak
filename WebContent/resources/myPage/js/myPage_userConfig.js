

function modifyUserINfo() {
	$('.updateBtn').on('click', function() {

		let pwCh = $("#configPW").val();
		let pwCh2 = $("#configPW2").val();




		if ($('.labelPwNo').css('display') == 'block') {
			alert("비밀번호 양식을 확인해주세요");
			return false;
		}


		if ($('.labelPwCh').css('display') == 'block') {
			alert("비밀번호 일치 여부를 다시 확인해주세요.");
			return false;
		}

		if (!(pwCh && pwCh2 && userAddress && userAddressDetail)) {

			alert("모든 정보를 입력해주세요")
			return false;
		}
		$('#myPageForm').submit();
		return true;

	})
}

$('document').ready(function() {
	modifyUserINfo();
})


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



$('.PwChOk').css('display', 'none');
$('.labelPwNo').css("display", "none");


function checkPw() {

	let pw = $("#configPW").val();
	let reg = /^(?=.*[a-zA-Z])(?=.*[!@#$%^&*()_=+])(?=.*[0-9]).{8,15}$/;

	let pwCheck = reg.test(pw);

	$('#configPW').on('keyup', function() {

		if (pwCheck) {
			$('.labelPwNo').css("display", "none");
			$('.PwChOk').css('display', 'block');
		} else {
			$('.labelPwNo').css("display", "block");
			$('.PwChOk').css('display', 'none');
		}
	});
}


$('#configPW2').keyup(function() {


	let pw = $("#configPW").val();
	let pwCh = $("#configPW2").val();

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


$('.deleteBtn').on('click', function() {

	let userNum = $('.deleteBtn').data('usernum');
	console.log(userNum)

	if(confirm("탈퇴하시겠습니까?")){
		alert("탈퇴 처리 되었습니다.")
		location.href="/user/deleteUser.me?userNum=" + userNum;
	}else {
		
	}



})


