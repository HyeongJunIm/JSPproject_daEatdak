/**
 * 
 */
$('.inputName').css('display', 'none');
$('.inputPhone').css('display', 'none');
function findId() {


	$('.submit-btn').click(function() {

		let name = $('#userName').val();
		let phone = $('#userPhone').val();


		if (name == "") {

			$('.inputName').css('display', 'block');
			$('.inputPhone').css('display', 'none');

			return false;
		} else if (phone == "") {
			$('.inputName').css('display', 'none');
			$('.inputPhone').css('display', 'block');

			return false;
		} 
		return true;

	});
}

$('document').ready(function() {
	findId();
})



