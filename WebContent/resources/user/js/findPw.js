/**
 * 
 */
$('.inputEmail').css('display', 'none');
$('.inputName').css('display', 'none');
$('.inputPhone').css('display', 'none');
function findPw() {


	$('.submit-btn').click(function() {

		let email = $('#userEmail').val();
		let name = $('#userName').val();
		let phone = $('#userPhone').val();


		if (email == "") {

			$('.inputEmail').css('display', 'block');
			$('.inputName').css('display', 'none');
			$('.inputPhone').css('display', 'none');

			return false;
		} else if (name == "") {
			$('.inputEmail').css('display', 'none');
			$('.inputName').css('display', 'block');
			$('.inputPhone').css('display', 'none');

			return false;
		} else if (phone == "") {
			$('.inputEmail').css('display', 'none');
			$('.inputName').css('display', 'none');
			$('.inputPhone').css('display', 'block');

			return false;
		}
		return true;

	});
}

$('document').ready(function() {
	findPw();
})



