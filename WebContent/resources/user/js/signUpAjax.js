

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
					}else{
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


let checkPhone = function() {
	$('#phonenumber').on('change', function() {
		let phone = $("#phonenumber").val();

		$('.checkPhone-result').text("");



		$.ajax({

			url: "/user/checkPhoneOk.me",
			type: "get",
			data: {
				userPhone: phone
			},
			success: function(resultPhone) {
				if (resultPhone == 0) {
					$('.checkPhone-result').text('사용 가능한 전화번호입니다.');
					if (phone == '') {
						$('.checkPhone-result').text("");

					} else if (phone.length < 10) {
						$('.checkPhone-result').text('');

					}
				} else if (resultPhone == 1) {
					$('.checkPhone-result').text('이미 가입된 전화번호입니다.');
					if (phone == '') {
						$('.checkPhone-result').text("");

					}
				}
			}
		})
	}
	)
}
$('#phonenumber').on('change', checkPhone());

