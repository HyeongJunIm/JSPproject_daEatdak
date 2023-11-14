

let checkEmail = function() {
	$('#email').on('change', function() {
		let id = $(this).val();
		const pattern = /^[A-Za-z0-9_\.\-]+@[A-Za-z0-9\-]+\.+/;
		let emailCheck = pattern.test(id);

		$.ajax({

			url: "/user/checkIdOk.me",
			type: "get",
			data: {
				userEmail: id
			},
			success: function(result) {

				if (result == 0) {
					if (emailCheck) {
						$('.id_already').css('display', 'none');
						$('.id_available').css('display', 'block');
					} else {
						$('.checkEmail-result').css('display', 'block')
						$('.id_already').css('display', 'none');
						$('.id_available').css('display', 'none');
						return;
					}

				} else if (result == 1) {

					$('.id_already').css('display', 'block');
					$('.id_available').css('display', 'none');
					return;

				}
			}

		})
	});
}
$('#email').on('change', checkEmail());
$('.checkPhone-result').css('display', 'none');
$('.checkPhone-result-blank').css('display', 'none')
$('.checkPhone-result-unavailable').css('display', 'none')

let checkPhone = function() {
	$('#phonenumber').on('change', function() {
		let phone = $("#phonenumber").val();

		$.ajax({

			url: "/user/checkPhoneOk.me",
			type: "get",
			data: {
				userPhone: phone
			},
			success: function(resultPhone) {
				if (resultPhone == 0) {
					$('.checkPhone-result').css('display', 'block');
					$('.checkPhone-result-blank').css('display', 'none')
					$('.checkPhone-result-unavailable').css('display', 'none')
					if (phone == '') {
						$('.checkPhone-result').css('display', 'none');
						$('.checkPhone-result-blank').css('display', 'block')
						$('.checkPhone-result-unavailable').css('display', 'none')

					} else if (phone.length < 10) {
						$('.checkPhone-result').css('display', 'none');
						$('.checkPhone-result-blank').css('display', 'block')
						$('.checkPhone-result-unavailable').css('display', 'none')

					}
				} else if (resultPhone == 1) {
					$('.checkPhone-result').css('display', 'none');
					$('.checkPhone-result-blank').css('display', 'none')
					$('.checkPhone-result-unavailable').css('display', 'block')
					if (phone == '') {
						$('.checkPhone-result').css('display', 'none');
						$('.checkPhone-result-blank').css('display', 'block')
						$('.checkPhone-result-unavailable').css('display', 'none')

					}
				}
			}
		})
	}
	)
}
$('#phonenumber').on('change', checkPhone());

