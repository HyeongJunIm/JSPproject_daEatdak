/**
 * 
 */

function findPw() {


	$('.submit-btn').click(function() {

	let email = $('#userEmail').val();
	let name = $('#userName').val();
	let phone = $('#userPhone').val();
	
	
		if (email == "") {
						alert("이메일 누락")

			return false;
		} else if (name == "") {
						alert("이름 누락")

			return false;
		} else if (phone == "") {
						alert("전화번호 누락")

			return false;
		}
		return true;

	});
}

$('document').ready(function(){
	findPw();
})



