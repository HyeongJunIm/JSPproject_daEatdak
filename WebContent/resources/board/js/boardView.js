//게시판 댓글

let userNum = $('.userNum').val();
let boardNum = $('.boardNum').val();
let userSessionNum = $('.userSessionNum').val();
let commentNum = $('.comment-del-btn').data('commentnum');
//댓글 등록
$('.comment-write').on('click', '.comment-write-btn', function() {
	let content = $('.replyBox').val();
	
	let params ={
		userNum : $('.userSessionNum').val(),
		boardNum : $('.boardNum').val(),
		commentContent : $('.replyBox').val()
	};
		
	console.log("=====================")
	console.log($('.replyBox').val())
	
	console.log("=====================")
	console.log("유저넘버:" + userNum);
	console.log("게시넘버:" + boardNum);
	console.log("댓글내용: " + content);
	console.log("유저 세션번호: " + userSessionNum);
	

	if (!(content)) {
		alert('내용을 입력해주세요');
		return;
	};

	$.ajax({

		url: '/board/boardReplyOk.bo',
		type: 'get',
		data: params,
		dataType: 'json',
		//contentType: 'application/json; charset=utf-8',
		success: function(result) {
			console.log(result)


			showReply(result)

		},
		error: function(a, b, c) {
			console.error(c);
		}


	})

	$('.replyBox').val('');

})

function showReply(result) {
	let text = '';
	result.forEach(r => {

		text += `
  <div class="comment-content">
      		<div class="admin-name"> ${r.userName} </div>
				<div class="admin-comment">${r.commentContent} </div>
				`;

		if (userSessionNum == 38) {
			text += `	        
				<div class="comment-btn-container">
					<a href='#' class="comment-fix-btn">수정</a>
			        <a href='#' class="comment-del-btn" data-commentnum="${r.commentNum}">삭제</a>
			 	</div>

            `;
		}
		text +=`
				</div>

		`

	})


	$('.comment-content-section').html(text);

}
//댓글 리스트 불러오기
/**
 * 
 */
function viewBoard(boardNum, callback) {
	$.ajax({

		url: '/board/boardReplyList.bo',
		type: 'get',
		data: {
			boardNum: boardNum
		},
		dataType: 'json',
		contentType: 'application/json; charset=utf-8',
		success: function(result) {
			console.log(result)


			if (callback) {
				callback(result);
			}


		}, error: function(a, b, c) {
			console.error(c);
		}



	})

}
//화면 진입 시 댓글리스트 불러오기
viewBoard(boardNum, showReply)






//댓글 삭제
function deleteReply(commentNum, callback) {
	$.ajax({

		url: '/board/boardReplyDelete.bo',
		type: 'get',
		data: {
			commentNum: commentNum
		},
		success: function(result) {

			console.log(result)
			if (callback) {
				callback(result);

			}

		}, error: function(a, b, c) {
			console.log(c);
		}
	})

}


//댓글 삭제
$('.comment-content-section').on('click', '.comment-del-btn', function(e) {
	e.preventDefault();
	let boardNum = $('.boardNum').val();
	let commentNum = $(this).data('commentnum');
	console.log(commentNum);
	console.log(boardNum);

	if (confirm("댓글을 삭제하시겠습니까?")) {
		deleteReply(commentNum, function() {
			viewBoard(boardNum, showReply)
		});


	}


})











